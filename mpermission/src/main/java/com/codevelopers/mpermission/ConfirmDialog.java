package com.codevelopers.mpermission;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class ConfirmDialog  extends DialogFragment {

    private String message;
    private DialogInterface.OnClickListener listener;

    public ConfirmDialog(@NonNull String message, @NonNull DialogInterface.OnClickListener listener){
        this.message = message;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(R.string.alert);
        builder.setMessage(message);
        builder.setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.accept, listener);

        return builder.create();
    }
}
