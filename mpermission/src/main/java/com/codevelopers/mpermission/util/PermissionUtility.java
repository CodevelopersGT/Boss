package com.codevelopers.mpermission.util;

import android.Manifest;

import androidx.annotation.NonNull;

public class PermissionUtility {

    public static boolean isValidPermission(@NonNull String permission) {

        if (permission.trim().isEmpty())
            return false;

        switch (permission) {

            case Manifest.permission.ACCEPT_HANDOVER:
            case Manifest.permission.ACCESS_BACKGROUND_LOCATION:
            case Manifest.permission.ACCESS_CHECKIN_PROPERTIES:
            case Manifest.permission.ACCESS_COARSE_LOCATION:
            case Manifest.permission.ACCESS_FINE_LOCATION:
            case Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS:
            case Manifest.permission.ACCESS_MEDIA_LOCATION:
            case Manifest.permission.ACCESS_NETWORK_STATE:
            case Manifest.permission.ACCESS_NOTIFICATION_POLICY:
            case Manifest.permission.ACCESS_WIFI_STATE:
            case Manifest.permission.ACCOUNT_MANAGER:
            case Manifest.permission.ACTIVITY_RECOGNITION:
            case Manifest.permission.ADD_VOICEMAIL:
            case Manifest.permission.ANSWER_PHONE_CALLS:
            case Manifest.permission.BATTERY_STATS:
            case Manifest.permission.BIND_ACCESSIBILITY_SERVICE:
            case Manifest.permission.BIND_APPWIDGET:
            case Manifest.permission.BIND_AUTOFILL_SERVICE:
            case Manifest.permission.BIND_CALL_REDIRECTION_SERVICE:
            case Manifest.permission.BIND_CARRIER_MESSAGING_CLIENT_SERVICE:
            case Manifest.permission.BIND_CARRIER_SERVICES:
            case Manifest.permission.BIND_CHOOSER_TARGET_SERVICE:
            case Manifest.permission.BIND_CONDITION_PROVIDER_SERVICE:
            case Manifest.permission.BIND_DEVICE_ADMIN:
            case Manifest.permission.BIND_DREAM_SERVICE:
            case Manifest.permission.BIND_INCALL_SERVICE:
            case Manifest.permission.BIND_INPUT_METHOD:
            case Manifest.permission.BIND_MIDI_DEVICE_SERVICE:
            case Manifest.permission.BIND_NFC_SERVICE:
            case Manifest.permission.BIND_NOTIFICATION_LISTENER_SERVICE:
            case Manifest.permission.BIND_PRINT_SERVICE:
            case Manifest.permission.BIND_QUICK_SETTINGS_TILE:
            case Manifest.permission.BIND_REMOTEVIEWS:
            case Manifest.permission.BIND_SCREENING_SERVICE:
            case Manifest.permission.BIND_TELECOM_CONNECTION_SERVICE:
            case Manifest.permission.BIND_TEXT_SERVICE:
            case Manifest.permission.BIND_TV_INPUT:
            case Manifest.permission.BIND_VISUAL_VOICEMAIL_SERVICE:
            case Manifest.permission.BIND_VOICE_INTERACTION:
            case Manifest.permission.BIND_VPN_SERVICE:
            case Manifest.permission.BIND_VR_LISTENER_SERVICE:
            case Manifest.permission.BIND_WALLPAPER:
            case Manifest.permission.BLUETOOTH:
            case Manifest.permission.BLUETOOTH_ADMIN:
            case Manifest.permission.BLUETOOTH_PRIVILEGED:
            case Manifest.permission.BODY_SENSORS:
            case Manifest.permission.BROADCAST_PACKAGE_REMOVED:
            case Manifest.permission.BROADCAST_SMS:
            case Manifest.permission.BROADCAST_STICKY:
            case Manifest.permission.BROADCAST_WAP_PUSH:
            case Manifest.permission.CALL_COMPANION_APP:
            case Manifest.permission.CALL_PHONE:
            case Manifest.permission.CALL_PRIVILEGED:
            case Manifest.permission.CAMERA:
            case Manifest.permission.CAPTURE_AUDIO_OUTPUT:
            case Manifest.permission.CHANGE_COMPONENT_ENABLED_STATE:
            case Manifest.permission.CHANGE_CONFIGURATION:
            case Manifest.permission.CHANGE_NETWORK_STATE:
            case Manifest.permission.CHANGE_WIFI_MULTICAST_STATE:
            case Manifest.permission.CHANGE_WIFI_STATE:
            case Manifest.permission.CLEAR_APP_CACHE:
            case Manifest.permission.CONTROL_LOCATION_UPDATES:
            case Manifest.permission.DELETE_CACHE_FILES:
            case Manifest.permission.DELETE_PACKAGES:
            case Manifest.permission.DIAGNOSTIC:
            case Manifest.permission.DISABLE_KEYGUARD:
            case Manifest.permission.DUMP:
            case Manifest.permission.EXPAND_STATUS_BAR:
            case Manifest.permission.FACTORY_TEST:
            case Manifest.permission.FOREGROUND_SERVICE:
            case Manifest.permission.GET_ACCOUNTS:
            case Manifest.permission.GET_ACCOUNTS_PRIVILEGED:
            case Manifest.permission.GET_PACKAGE_SIZE:
            case Manifest.permission.GLOBAL_SEARCH:
            case Manifest.permission.INSTALL_LOCATION_PROVIDER:
            case Manifest.permission.INSTALL_PACKAGES:
            case Manifest.permission.INSTALL_SHORTCUT:
            case Manifest.permission.INSTANT_APP_FOREGROUND_SERVICE:
            case Manifest.permission.INTERNET:
            case Manifest.permission.KILL_BACKGROUND_PROCESSES:
            case Manifest.permission.LOCATION_HARDWARE:
            case Manifest.permission.MANAGE_DOCUMENTS:
            case Manifest.permission.MANAGE_OWN_CALLS:
            case Manifest.permission.MASTER_CLEAR:
            case Manifest.permission.MEDIA_CONTENT_CONTROL:
            case Manifest.permission.MODIFY_AUDIO_SETTINGS:
            case Manifest.permission.MODIFY_PHONE_STATE:
            case Manifest.permission.MOUNT_FORMAT_FILESYSTEMS:
            case Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS:
            case Manifest.permission.NFC:
            case Manifest.permission.NFC_TRANSACTION_EVENT:
            case Manifest.permission.PACKAGE_USAGE_STATS:
            case Manifest.permission.READ_CALENDAR:
            case Manifest.permission.READ_CALL_LOG:
            case Manifest.permission.READ_CONTACTS:
            case Manifest.permission.READ_EXTERNAL_STORAGE:
            case Manifest.permission.READ_LOGS:
            case Manifest.permission.READ_PHONE_NUMBERS:
            case Manifest.permission.READ_PHONE_STATE:
            case Manifest.permission.READ_SMS:
            case Manifest.permission.READ_SYNC_SETTINGS:
            case Manifest.permission.READ_SYNC_STATS:
            case Manifest.permission.READ_VOICEMAIL:
            case Manifest.permission.REBOOT:
            case Manifest.permission.RECEIVE_BOOT_COMPLETED:
            case Manifest.permission.RECEIVE_MMS:
            case Manifest.permission.RECEIVE_SMS:
            case Manifest.permission.RECEIVE_WAP_PUSH:
            case Manifest.permission.RECORD_AUDIO:
            case Manifest.permission.REORDER_TASKS:
            case Manifest.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND:
            case Manifest.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND:
            case Manifest.permission.REQUEST_DELETE_PACKAGES:
            case Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS:
            case Manifest.permission.REQUEST_INSTALL_PACKAGES:
            case Manifest.permission.REQUEST_PASSWORD_COMPLEXITY:
            case Manifest.permission.SEND_RESPOND_VIA_MESSAGE:
            case Manifest.permission.SEND_SMS:
            case Manifest.permission.SET_ALARM:
            case Manifest.permission.SET_ALWAYS_FINISH:
            case Manifest.permission.SET_ANIMATION_SCALE:
            case Manifest.permission.SET_DEBUG_APP:
            case Manifest.permission.SET_PROCESS_LIMIT:
            case Manifest.permission.SET_TIME:
            case Manifest.permission.SET_TIME_ZONE:
            case Manifest.permission.SET_WALLPAPER:
            case Manifest.permission.SET_WALLPAPER_HINTS:
            case Manifest.permission.SIGNAL_PERSISTENT_PROCESSES:
            case Manifest.permission.SMS_FINANCIAL_TRANSACTIONS:
            case Manifest.permission.START_VIEW_PERMISSION_USAGE:
            case Manifest.permission.STATUS_BAR:
            //case Manifest.permission.SYSTEM_ALERT_WINDOW:
            case Manifest.permission.TRANSMIT_IR:
            case Manifest.permission.UNINSTALL_SHORTCUT:
            case Manifest.permission.UPDATE_DEVICE_STATS:
            case Manifest.permission.USE_BIOMETRIC:
            case Manifest.permission.USE_FULL_SCREEN_INTENT:
            case Manifest.permission.USE_SIP:
            case Manifest.permission.VIBRATE:
            case Manifest.permission.WAKE_LOCK:
            case Manifest.permission.WRITE_APN_SETTINGS:
            case Manifest.permission.WRITE_CALENDAR:
            case Manifest.permission.WRITE_CALL_LOG:
            case Manifest.permission.WRITE_CONTACTS:
            case Manifest.permission.WRITE_EXTERNAL_STORAGE:
            case Manifest.permission.WRITE_GSERVICES:
            case Manifest.permission.WRITE_SECURE_SETTINGS:
            //case Manifest.permission.WRITE_SETTINGS:
            case Manifest.permission.WRITE_SYNC_SETTINGS:
            case Manifest.permission.WRITE_VOICEMAIL:
                return true;

            default:
                return false;
        }

    }

    public static boolean isRiskyPermission(@NonNull String permission) {

        switch (permission){

            case Manifest.permission.READ_CALENDAR:
            case Manifest.permission.WRITE_CALENDAR:
            case Manifest.permission.CAMERA:
            case Manifest.permission.READ_CONTACTS:
            case Manifest.permission.WRITE_CONTACTS:
            case Manifest.permission.GET_ACCOUNTS:
            case Manifest.permission.ACCESS_FINE_LOCATION:
            case Manifest.permission.ACCESS_COARSE_LOCATION:
            case Manifest.permission.RECORD_AUDIO:
            case Manifest.permission.READ_PHONE_STATE:
            case Manifest.permission.CALL_PHONE:
            case Manifest.permission.READ_CALL_LOG:
            case Manifest.permission.WRITE_CALL_LOG:
            case Manifest.permission.ADD_VOICEMAIL:
            case Manifest.permission.USE_SIP:
            case Manifest.permission.PROCESS_OUTGOING_CALLS:
            case Manifest.permission.BODY_SENSORS:
            case Manifest.permission.SEND_SMS:
            case Manifest.permission.RECEIVE_SMS:
            case Manifest.permission.RECEIVE_WAP_PUSH:
            case Manifest.permission.RECEIVE_MMS:
            case Manifest.permission.READ_EXTERNAL_STORAGE:
            case Manifest.permission.WRITE_EXTERNAL_STORAGE:
                return true;
        }

        return false;
    }
}
