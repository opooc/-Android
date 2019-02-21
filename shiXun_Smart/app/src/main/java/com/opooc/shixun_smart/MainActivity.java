package com.opooc.shixun_smart;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.opooc.shixun_smart.fragment.ButlerFragement;
import com.opooc.shixun_smart.fragment.GirlFragement;
import com.opooc.shixun_smart.fragment.UserFragement;
import com.opooc.shixun_smart.fragment.WeChatFragement;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //tabLayout
    private TabLayout mTabLayout;
    //viewPage
    private ViewPager mViewPager;
    //fragment
    private List<Fragment> mFragment;
    //title
    private List<String> mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉阴影
        getSupportActionBar().setElevation(0);

        initData();
        initView();
    }

    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add("服务管家");
        mTitle.add("微信精选");
        mTitle.add("社区图片");
        mTitle.add("个人中心");

        mFragment = new ArrayList<>();
        mFragment.add(new ButlerFragement());
        mFragment.add(new WeChatFragement());
        mFragment.add(new GirlFragement());
        mFragment.add(new UserFragement());


    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());
        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }
            //设置标题

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
        mTabLayout.setupWithViewPager(mViewPager);
    }

}
