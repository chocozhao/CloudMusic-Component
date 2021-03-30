package com.cloud.music.find.di.module;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cloud.music.find.mvp.model.entity.GetFindInfo;
import com.cloud.music.find.mvp.ui.adapter.FindAdapter;
import com.jess.arms.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.cloud.music.find.mvp.contract.HomeContract;
import com.cloud.music.find.mvp.model.HomeModel;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.util.ArrayList;
import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/26/2020 22:11
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class HomeModule {

    @Binds
    abstract HomeContract.Model bindHomeModel(HomeModel model);


    @FragmentScope
    @Provides
    static RxPermissions provideRxPermissions(HomeContract.View view) {
        return new RxPermissions(view.getFragment());
    }


    @FragmentScope
    @Provides
    static RecyclerView.LayoutManager provideLayoutManager(HomeContract.View view) {
        return new LinearLayoutManager(view.getActivity());
    }

    @FragmentScope
    @Provides
    static List<GetFindInfo.BlocksBean> provideBlocksList() {
        return new ArrayList<>();
    }

    @FragmentScope
    @Provides
    static FindAdapter provideFindAdapter(List<GetFindInfo.BlocksBean> list){
        return new FindAdapter(list);
    }
}