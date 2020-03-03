package com.codevelopers.mpermission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.codevelopers.mcontext.Context;
import com.codevelopers.mpermission.error.PermissionException;
import com.codevelopers.mpermission.listener.OnPermissionListener;
import com.codevelopers.mpermission.pojo.Permission;
import com.codevelopers.mpermission.util.PermissionUtility;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    private List<Permission> permissions = new ArrayList<>();
    private Context context;
    private OnPermissionListener onPermissionListener;

    public Boss(@NonNull Activity activity, @NonNull OnPermissionListener listener) {

        this.context = new Context(activity);
        this.onPermissionListener = listener;
    }


    public Boss(@NonNull Fragment fragment, @NonNull OnPermissionListener listener) {

        this.context = new Context(fragment);
        this.onPermissionListener = listener;
    }

    public void requestPermission(final Permission permission, @Nullable String explanation) {

        if (!PermissionUtility.isValidPermission(permission.getPermission()))
            throw new PermissionException("Invalid permission");

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M || !PermissionUtility.isRiskyPermission(permission.getPermission())) {

            onPermissionListener.onSuccessPermission(permission);
            return;
        }

        if (!this.permissions.contains(permission))
            this.permissions.add(permission);


        if (context.hasPermission(permission.getPermission())) {
            this.onPermissionListener.onSuccessPermission(permission);
            return;
        }

        //Se deben de pedir permisos en base a algoritmo estandar propocionado
        //en la documentacion


        //Debo de mostrar explicacion?
        if (explanation != null && !explanation.trim().isEmpty()) {

            //Pregunto si el contexto es activity

            Activity activity = context.isActivity() ? context.getActivity() : context.getFragment().getActivity();

            if (activity != null && activity.shouldShowRequestPermissionRationale(permission.getPermission())) {

                //Mando a llamar dialogo para obtener un mensaje estandar
                ConfirmDialog confirmDialog = new ConfirmDialog(explanation, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        requestPermission(permission);
                    }
                });

                if (context.isFragment())
                    confirmDialog.show(context.getFragment().getFragmentManager(), "");
                else
                    confirmDialog.show(((FragmentActivity) context.getActivity()).getSupportFragmentManager(), "");

                return;
            }
        }

        requestPermission(permission);
    }

    private void requestPermission(Permission permission) {

        context.requestPermission(permission.getPermission(), permission.getRequestCode());
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        Permission permission = new Permission(requestCode, permissions[0]);

        if (!this.permissions.contains(permission))
            return;

        if (grantResults[0] != PackageManager.PERMISSION_GRANTED){

            onPermissionListener.onNotPermission(permission);
            return;
        }

        onPermissionListener.onSuccessPermission(permission);
    }
}
