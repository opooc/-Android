package com.opooc.shixun_smart.utils;

import android.util.Log;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.utils
 *  Name:        L
 *  User:        opooc
 *  Creat_name:  2019/2/21 6:41 PM
 *  note:        Log
 */
public class L {
    //开关
    public static final boolean DEBUG = true;
    //TAG
    public  static  final String TAG = "Smart";
    //五个等级 DIWEF

    public static  void  d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }
    }
    public static  void  i(String text){
        if (DEBUG){
            Log.i(TAG,text);
        }
    }
    public static  void  w(String text){
        if (DEBUG){
            Log.w(TAG,text);
        }
    }
    public static  void  e(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }
    }
}
