/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloud.music.app.mvp.ui.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.cloud.music.app.mvp.ui.adapter.SectionsPagerAdapter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import butterknife.BindView;

import com.cloud.music.app.R;
import com.cloud.music.commonsdk.core.RouterHub;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================
 * 宿主 App 的主页
 *
 * @see <a href="https://github.com/JessYanCoding/ArmsComponent/wiki">ArmsComponent wiki 官方文档</a>
 * Created by JessYan on 19/04/2018 16:10
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
@Route(path = RouterHub.APP_MAINACTIVITY)
public class MainActivity extends BaseActivity {
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar mBottomNavigationBar;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private String[] mTitles;

    private long mPressedTime;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        //这里想展示组件向外提供服务的功能, 模拟下组件向宿主提供一些必要的信息, 这里为了简单就直接返回本地数据不请求网络了

        initBottomNavigationBar();
        initViewPager();
    }


    private void initViewPager() {
        fragmentList.clear();
        fragmentList.add((Fragment) ARouter.getInstance().build(RouterHub.FIND_HOME_FRAGMENT)
                .navigation());//发现
        fragmentList.add((Fragment) ARouter.getInstance()
                .build(RouterHub.SPRINKLER_HOME_FRAGMENT)//播客
                .navigation(this));
        fragmentList.add((Fragment) ARouter.getInstance()
                .build(RouterHub.MINE_HOME_FRAGMENT) //我的
                .navigation(this));
        fragmentList.add((Fragment) ARouter.getInstance()
                .build(RouterHub.KSONG_HOME_FRAGMENT)//K歌
                .navigation(this));
        fragmentList.add((Fragment) ARouter.getInstance()
                .build(RouterHub.VILLAGE_HOME_FRAGMENT) //云村
                .navigation(this));
        mViewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager(), fragmentList));
        mViewPager.setOffscreenPageLimit(mTitles.length);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottomNavigationBar.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /**
     * 底部导航栏栏目
     */
    public void initBottomNavigationBar() {
        mTitles = new String[]{"发现", "播客", "我的", "K歌", "云村"};
        mBottomNavigationBar
                .setActiveColor(R.color.public_color_cd514e)
                .setInActiveColor(R.color.public_color_999999)
                .setBarBackgroundColor(R.color.public_white);

        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_DEFAULT);

        mBottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_find_selected, mTitles[0])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.drawable.ic_find_normal)))
                .addItem(new BottomNavigationItem(R.drawable.ic_sprinkler_selected, mTitles[1])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.drawable.ic_sprinkler_normal)))
                .addItem(new BottomNavigationItem(R.drawable.ic_mine_selected, mTitles[2])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.drawable.ic_mine_normal)))
                .addItem(new BottomNavigationItem(R.drawable.ic_mine_selected, mTitles[3])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.drawable.ic_mine_normal))).
                addItem(new BottomNavigationItem(R.drawable.ic_village_selected, mTitles[4])
                        .setInactiveIcon(ContextCompat.getDrawable(this, R.drawable.ic_village_normal
                        )))
                .setFirstSelectedPosition(0)
                .initialise();//所有的设置需在调用该方法前完成```

        mBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {//这里也可以使用SimpleOnTabSelectedListener
            @Override
            public void onTabSelected(int position) {//未选中 -> 选中
                mViewPager.setCurrentItem(position);

            }

            @Override
            public void onTabUnselected(int position) {//选中 -> 未选中


            }

            @Override
            public void onTabReselected(int position) {//选中 -> 选中

            }
        });
    }

    @Override
    public void onBackPressed() {
        //获取第一次按键时间
        long mNowTime = System.currentTimeMillis();
        //比较两次按键时间差
        if ((mNowTime - mPressedTime) > 2000) {
            ArmsUtils.makeText(getApplicationContext(),
                    "再按一次退出" + ArmsUtils.getString(getApplicationContext(), R.string.public_app_name));
            mPressedTime = mNowTime;
        } else {
            super.onBackPressed();
        }
    }

    /**
     * 这里注意下在组件的页面中(使用了 R2 的页面)使用 {@link butterknife.OnClick} 会有概率出现 id 不正确的问题, 使用以下方式解决
     * <pre>
     * @OnClick({R2.id.button1, R2.id.button2})
     * public void Onclick(View view){
     *      if (view.getId() == R.id.button1){
     *          ...
     *      } else if(view.getId() == R.id.button2){
     *          ...
     *      }
     * }
     * </pre>
     * <p>
     * 在注解上使用 R2, 下面使用 R, 并且使用 {@code if else}, 替代 {@code switch}
     *
     * @param view
     */

}
