package com.opooc.shixun_smart.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.ui
 *  Name:        BaseActivity
 *  User:        opooc
 *  Creat_name:  2019/2/21 2:58 PM
 *  note:        BaseActivity
 */


/*
* 同一属性、接口、*/
public class BaseActivity extends AppCompatActivity {
    protected void  oncreate( Bundle savaedInstanceState){
        super.onCreate(savaedInstanceState);
     // 显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
