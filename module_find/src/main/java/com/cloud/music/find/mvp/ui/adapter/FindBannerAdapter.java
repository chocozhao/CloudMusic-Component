package com.cloud.music.find.mvp.ui.adapter;

import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.blankj.utilcode.util.GsonUtils;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.music.find.R;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;
import com.cloud.music.find.mvp.ui.holder.BannerHolderView;

import org.jetbrains.annotations.NotNull;

import timber.log.Timber;

import static com.cloud.music.find.mvp.ui.adapter.FindAdapter.TYPE_BANNER;

/**
 * 轮播图展示
 */
class FindBannerAdapter extends BaseItemProvider<GetFindInfo.BlocksBean> {
    @Override
    public int getItemViewType() {
        return TYPE_BANNER;
    }

    @Override
    public int getLayoutId() {
        return R.layout.find_rv_item_banner;
    }

    @Override
    public void convert(@NotNull BaseViewHolder helper, GetFindInfo.BlocksBean blocksBean) {
        Timber.i("blocksBean:" + GsonUtils.toJson(blocksBean.getExtInfo().getBanners()));
        ConvenientBanner mConvenientBanner = helper.getView(R.id.cb_convenient_banner);
        mConvenientBanner.setPages(new CBViewHolderCreator() {
            @Override
            public Holder createHolder(View itemView) {
                return new BannerHolderView(itemView, getContext());
            }

            @Override
            public int getLayoutId() {
                return R.layout.find_item_banner_view;
            }
        }, blocksBean.getExtInfo().getBanners());
        mConvenientBanner.startTurning(3000);
    }
}
