package com.opooc.shixun_smart.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.utils
 *  Name:        UtilsTools
 *  User:        opooc
 *  Creat_name:  2019/2/21 3:07 PM
 *  note:        工具统一类
 *
 */
public class UtilsTools {
    public static void setFont(Context mContext, TextView textview){
        //设置字体
        Typeface fontType =  Typeface.createFromAsset(mContext.getAssets(),"fonts/FONT.TTF");

        textview.setTypeface(fontType);
    }
}
