package com.cloud.music.find.mvp.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.cloud.music.commonsdk.imgaEngine.config.CommonImageConfigImpl;
import com.cloud.music.find.R;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.ArmsUtils;


/**
 * @author maoqitian
 * @Description 首页 轮播图 holder
 * @Time 2019/5/18 0018 22:30
 */
public class BannerHolderView extends Holder<GetFindInfo.BlocksBean.ExtInfoBean.BannersBean> {

    private ImageView mImage;
    private TextView mText;
    private Context mContext;
    private AppComponent mAppComponent;
    /**
     * 用于加载图片的管理类, 默认使用 Glide, 使用策略模式, 可替换框架
     */
    private ImageLoader mImageLoader;

    public BannerHolderView(View itemView, Context context) {
        super(itemView);
        mContext = context;
        //可以在任何可以拿到 Context 的地方, 拿到 AppComponent, 从而得到用 Dagger 管理的单例对象
        mAppComponent = ArmsUtils.obtainAppComponentFromContext(itemView.getContext());
        mImageLoader = mAppComponent.imageLoader();
    }


    @Override
    protected void initView(View itemView) {
        mImage = itemView.findViewById(R.id.image_banner);
        mText = itemView.findViewById(R.id.text_banner);
    }

    @Override
    public void updateUI(GetFindInfo.BlocksBean.ExtInfoBean.BannersBean data) {
        mImageLoader.loadImage(mContext,
                CommonImageConfigImpl
                        .builder()
                        .url(data.getPic())
                        .imageView(mImage)
                        .placeholder(R.mipmap.gank_ic_logo)
                        .build());
        mText.setText(data.getTypeTitle());
    }

}
