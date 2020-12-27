package com.cloud.music.village.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.cloud.music.village.di.module.HomeModule;
import com.cloud.music.village.mvp.contract.HomeContract;

import com.jess.arms.di.scope.FragmentScope;
import com.cloud.music.village.mvp.ui.fragment.HomeFragment;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/27/2020 15:00
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
@Component(modules = HomeModule.class, dependencies = AppComponent.class)
public interface HomeComponent {
    void inject(HomeFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        HomeComponent.Builder view(HomeContract.View view);

        HomeComponent.Builder appComponent(AppComponent appComponent);

        HomeComponent build();
    }
}