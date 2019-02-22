package com.opooc.shixun_smart.application;

import android.app.Application;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.application
 *  Name:        BaseApplication
 *  User:        opooc
 *  Creat_name:  2019/2/21 2:55 PM
 *  note:        BaseApplication
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
       // CrashReport.initCrashReport(getApplicationContext(), "1e55436183", true);
    }
}
