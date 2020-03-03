package com.codevelopers.mpermission.listener;

import com.codevelopers.mpermission.pojo.Permission;

public interface OnPermissionListener {

    void onSuccessPermission(Permission permission);

    void onNotPermission(Permission permission);
}
