package com.cloud.music.find.mvp.ui.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cloud.music.find.R;
import com.cloud.music.find.R2;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;

import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

public class FindAdapter extends BaseQuickAdapter<GetFindInfo.BlocksBean, BaseViewHolder> {

    private final static String HOMEPAGE_BANNER = "HOMEPAGE_BANNER"; //轮播图
    private final static String HOMEPAGE_BLOCK_PLAYLIST_RCMD = "HOMEPAGE_BLOCK_PLAYLIST_RCMD"; //推荐歌单
    private final static String HOMEPAGE_BLOCK_STYLE_RCMD = "HOMEPAGE_BLOCK_STYLE_RCMD"; //样式推荐歌单
    private final static String HOMEPAGE_MUSIC_CALENDAR = "HOMEPAGE_MUSIC_CALENDAR"; //音乐日历
    private final static String HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST = "HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST"; //官方专属歌单
    private final static String HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG = "HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG"; //新歌专辑
    private final static String HOMEPAGE_YUNBEI_NEW_SONG = "HOMEPAGE_YUNBEI_NEW_SONG"; //
    private final static String HOMEPAGE_PODCAST24 = "HOMEPAGE_PODCAST24"; //24小时播客
    private final static String HOMEPAGE_BLOCK_FUN_CLUB = "HOMEPAGE_BLOCK_FUN_CLUB"; //俱乐部   云村KTV 唱聊等
    private final static String HOMEPAGE_VOICELIST_RCMD = "HOMEPAGE_VOICELIST_RCMD"; //播客合辑
    private final static String HOMEPAGE_BLOCK_VIDEO_PLAYLIST = "HOMEPAGE_BLOCK_VIDEO_PLAYLIST"; //视频合辑


    ConvenientBanner mConvenientBanner;
    @Inject
    FindAdapter mFindAdapter;

    private Fragment fragment;

    public FindAdapter(@Nullable List<GetFindInfo.BlocksBean> data, Fragment fragment) {
//        super(R.layout.home_recycle_item_article, data);
        super(R.layout.find_rv_item_footer, data);
        this.fragment = fragment;
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, GetFindInfo.BlocksBean blocksBean) {
        Timber.i("getBlockCode:" + helper.getAdapterPosition() + "     " + blocksBean.getBlockCode());
        switch (blocksBean.getBlockCode()) {
            //轮播图
            case HOMEPAGE_BANNER:
                banner();
                break;
            //推荐歌单
            case HOMEPAGE_BLOCK_PLAYLIST_RCMD:
                banner();
                break;
            //样式推荐歌单
            case HOMEPAGE_BLOCK_STYLE_RCMD:
                break;
            //音乐日历
            case HOMEPAGE_MUSIC_CALENDAR:
                break;
            //官方专属歌单
            case HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST:
                break;
            //新歌专辑
            case HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG:
                break;
            case HOMEPAGE_YUNBEI_NEW_SONG:
                break;
            //24小时播客
            case HOMEPAGE_PODCAST24:
                break;
            //俱乐部   云村KTV 唱聊等
            case HOMEPAGE_BLOCK_FUN_CLUB:
                break;
            //播客合辑
            case HOMEPAGE_VOICELIST_RCMD:
                break;
            //视频合辑
            case HOMEPAGE_BLOCK_VIDEO_PLAYLIST:
                break;
            default:
                break;
        }
    }

    /**
     * 轮播图
     */
    private void banner() {
//        View bannerView = fragment.getLayoutInflater().inflate(R.layout.find_rv_item_banner, mFindAdapter, false);
//        mConvenientBanner = bannerView.findViewById(R.id.cb_convenient_banner);
//        mFindAdapter.addHeaderView(bannerView);
    }
}
