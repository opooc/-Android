package com.opooc.shixun_smart.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.opooc.shixun_smart.R;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.fragment
 *  Name:        WeChatFragement
 *  User:        opooc
 *  Creat_name:  2019/2/21 3:40 PM
 *  note:        TODO
 */
public class WeChatFragement extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_wechat,null);
        return view;
    }
}
