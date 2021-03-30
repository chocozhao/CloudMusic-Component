package com.cloud.music.find.mvp.ui.adapter;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.music.find.R;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;

import org.jetbrains.annotations.NotNull;

import static com.cloud.music.find.mvp.ui.adapter.FindAdapter.TYPE_BLOCK_PLAYLIST_RCMD;

/**
 * 轮播图展示
 */
class FindBlockPlayListRCMDAdapter extends BaseItemProvider<GetFindInfo.BlocksBean> {
    @Override
    public int getItemViewType() {
        return TYPE_BLOCK_PLAYLIST_RCMD;
    }

    @Override
    public int getLayoutId() {
        return R.layout.find_rv_item_footer;
    }

    @Override
    public void convert(@NotNull BaseViewHolder helper, GetFindInfo.BlocksBean blocksBean) {
        helper.setText(R.id.find_refresh, blocksBean.getCreatives().get(helper.getAdapterPosition()).getActionType());
    }
}
