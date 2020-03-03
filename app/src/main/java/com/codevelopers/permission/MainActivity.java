package com.codevelopers.permission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.widget.Toast;

import com.codevelopers.mpermission.Boss;
import com.codevelopers.mpermission.listener.OnPermissionListener;
import com.codevelopers.mpermission.pojo.Permission;

public class MainActivity extends AppCompatActivity {

    private Boss boss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boss = new Boss(this, new OnPermissionListener() {
            @Override
            public void onSuccessPermission(Permission permission) {

                Toast.makeText(MainActivity.this, permission.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNotPermission(Permission permission) {

                Toast.makeText(MainActivity.this, "Sin permiso " + permission.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //Lo normal es pedir permiso en un evento, como al dar click en un boton
        boss.requestPermission(new Permission(7, Manifest.permission.WRITE_CALENDAR), null);
        boss.requestPermission(new Permission(8, Manifest.permission.WRITE_EXTERNAL_STORAGE), null);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        boss.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
