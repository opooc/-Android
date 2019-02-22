package com.opooc.shixun_smart.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.opooc.shixun_smart.R;

import java.util.ArrayList;
import java.util.List;

/*
 *  Project_name:shiXun_Smart
 *  Package_name:com.opooc.shixun_smart.ui
 *  Name:        GuideActivity
 *  User:        opooc
 *  Creat_name:  2019/2/21 11:14 PM
 *  note:        引导页
 */
public class GuideActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    //容器
    private List<View> mList = new ArrayList<>();
    private View view1,view2,view3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initView();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        view1 = View.inflate(this,R.layout.page_item_one,null);
        view2 = View.inflate(this,R.layout.page_item_two,null);
        view3 = View.inflate(this,R.layout.page_item_three,null);

        mList.add(view1);
        mList.add(view2);
        mList.add(view3);

        mViewPager.setAdapter(new GuideAdapter());

    }


    class GuideAdapter extends PagerAdapter{
        public int getCount(){
            return mList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ((ViewPager)container).addView(mList.get(position));
            return mList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView(mList.get(position));
//            super.destroyItem(container, position, object);
        }
    }
}
