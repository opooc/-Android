package com.opooc.shixun_smart.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.opooc.shixun_smart.R;
import com.opooc.shixun_smart.utils.ShareUtils;
import com.opooc.shixun_smart.utils.StaticClass;
import com.opooc.shixun_smart.utils.UtilsTools;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.ui
 *  Name:        SplashActivity
 *  User:        opooc
 *  Creat_name:  2019/2/21 9:38 PM
 *  note:
 */
public class SplashActivity extends AppCompatActivity {

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLER_SPLASH:
                    if (isFirst()){
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }else {
                        startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    }
                    finish();
                    break;
            }
        }
    };

/*1.延时2000
* 2.判断是否第一次
* 3.自定义字体
* 4.Activity全屏主题*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actiity_splash);

        initView();
    }
    private void initView(){
        handler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH,2000);

        tv_splash = (TextView) findViewById(R.id.tv_splash);
        UtilsTools.setFont(this,tv_splash);
    }
    //判断程序是否第一次运行
    private boolean isFirst() {
       boolean isFirst = ShareUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
        if (isFirst){
            ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            return  true;
        }else {
            return false;
        }
    }
//禁止返回
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
