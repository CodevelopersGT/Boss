package com.codevelopers.mpermission.pojo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.codevelopers.mpermission.error.PermissionException;
import com.codevelopers.mpermission.util.PermissionUtility;

import java.util.Random;

public class Permission {

    private int requestCode;
    private String permission;

    public Permission(int requestCode, String permission) {

        validPermission(permission);
        this.requestCode = requestCode;
        this.permission = permission;

    }

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    private void validPermission(String permission) {

        if (!PermissionUtility.isValidPermission(permission))
            throw new PermissionException("The permission is not valid");
    }

    public Permission(String permission) {

        validPermission(permission);
        this.permission = permission;
        this.requestCode = generateRequestCode();

    }


    public static int generateRequestCode() {

        Random random = new Random();
        return random.nextInt(1000);
    }

    @Override
    public boolean equals(@Nullable Object obj) {

        if (obj instanceof Permission)
            return this.requestCode == ((Permission) obj).getRequestCode();

        return false;
    }

    @NonNull
    @Override
    public String toString() {
        return "Request code " + requestCode + "Permission " + permission;
    }
}
