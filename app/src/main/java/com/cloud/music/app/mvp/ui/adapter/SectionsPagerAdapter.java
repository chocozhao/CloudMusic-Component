package com.cloud.music.app.mvp.ui.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * ClaseName：SectionsPagerAdapter
 * Description：
 * Author：chocozhao
 * QQ: 1027313530
 * Createtime：2020/2/24 17:18
 * Modified By：
 * Fixtime：2020/2/24 17:18
 * FixDescription：
 **/
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments2;

    public SectionsPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments2 = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments2.get(position);
    }

    @Override
    public int getCount() {
        return fragments2.size();
    }

}
