package com.cloud.music.find.mvp.ui.adapter;

import android.view.View;

import androidx.annotation.Nullable;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.music.find.R;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;
import com.cloud.music.find.mvp.ui.holder.BannerHolderView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import timber.log.Timber;

/**
 * 首页动态 适配器
 */

public class FindAdapter extends BaseProviderMultiAdapter<GetFindInfo.BlocksBean> {
    public final static int TYPE_BANNER = 0;
    public final static int TYPE_BLOCK_PLAYLIST_RCMD = 1;
    public final static int TYPE_BLOCK_STYLE_RCMD = 2;
    public final static int TYPE_MUSIC_CALENDAR = 3;
    public final static int TYPE_BLOCK_OFFICIAL_PLAYLIST = 4;
    public final static int TYPE_BLOCK_NEW_ALBUM_NEW_SONG = 5;
    public final static int TYPE_YUNBEI_NEW_SONG = 6;
    public final static int TYPE_PODCAST24 = 7;
    public final static int TYPE_BLOCK_FUN_CLUB = 8;
    public final static int TYPE_VOICELIST_RCMD = 9;
    public final static int TYPE_BLOCK_VIDEO_PLAYLIST = 10;
    public final static String HOMEPAGE_BANNER = "HOMEPAGE_BANNER"; //轮播图
    public final static String HOMEPAGE_BLOCK_PLAYLIST_RCMD = "HOMEPAGE_BLOCK_PLAYLIST_RCMD"; //推荐歌单
    public final static String HOMEPAGE_BLOCK_STYLE_RCMD = "HOMEPAGE_BLOCK_STYLE_RCMD"; //样式推荐歌单
    public final static String HOMEPAGE_MUSIC_CALENDAR = "HOMEPAGE_MUSIC_CALENDAR"; //音乐日历
    public final static String HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST = "HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST"; //官方专属歌单
    public final static String HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG = "HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG"; //新歌专辑
    public final static String HOMEPAGE_YUNBEI_NEW_SONG = "HOMEPAGE_YUNBEI_NEW_SONG"; //
    public final static String HOMEPAGE_PODCAST24 = "HOMEPAGE_PODCAST24"; //24小时播客
    public final static String HOMEPAGE_BLOCK_FUN_CLUB = "HOMEPAGE_BLOCK_FUN_CLUB"; //俱乐部   云村KTV 唱聊等
    public final static String HOMEPAGE_VOICELIST_RCMD = "HOMEPAGE_VOICELIST_RCMD"; //播客合辑
    public final static String HOMEPAGE_BLOCK_VIDEO_PLAYLIST = "HOMEPAGE_BLOCK_VIDEO_PLAYLIST"; //视频合辑


    public FindAdapter(@Nullable List<GetFindInfo.BlocksBean> data) {
        super();
        addItemProvider(new FindBannerAdapter());//轮播图
        addItemProvider(new FindBlockPlayListRCMDAdapter());//推荐歌单

    }

//    @Override
//    protected void convert(@NonNull BaseViewHolder helper, GetFindInfo.BlocksBean blocksBean) {
//        switch (blocksBean.getBlockCode()) {
//            //轮播图
//            case HOMEPAGE_BANNER:
//                banner(blocksBean.getExtInfo().getBanners(), helper);
////                helper.setText(R.id.cb_convenient_banner, blocksBean.getExtInfo().getBanners().get(helper.getAdapterPosition()).getPic());
//                break;
//            //推荐歌单
//            case HOMEPAGE_BLOCK_PLAYLIST_RCMD:
////                banner(blocksBean.getExtInfo().getBanners());
//                helper.setText(R.id.find_refresh, blocksBean.
//                        getCreatives().get(helper.getAdapterPosition())
//                        .getResources().get(helper.getAdapterPosition())
//                        .getActionType());
//                break;
//
//            //样式推荐歌单
//            case HOMEPAGE_BLOCK_STYLE_RCMD:
//                break;
//            //音乐日历
//            case HOMEPAGE_MUSIC_CALENDAR:
//                break;
//            //官方专属歌单
//            case HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST:
//                break;
//            //新歌专辑
//            case HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG:
//                break;
//            case HOMEPAGE_YUNBEI_NEW_SONG:
//                break;
//            //24小时播客
//            case HOMEPAGE_PODCAST24:
//                break;
//            //俱乐部   云村KTV 唱聊等
//            case HOMEPAGE_BLOCK_FUN_CLUB:
//                break;
//            //播客合辑
//            case HOMEPAGE_VOICELIST_RCMD:
//                break;
//            //视频合辑
//            case HOMEPAGE_BLOCK_VIDEO_PLAYLIST:
//                break;
//            default:
//                break;
//        }
//    }



    /**
     * 轮播图
     *
     * @param banners
     * @param helper
     */
//    private void banner(List<GetFindInfo.BlocksBean.ExtInfoBean.BannersBean> banners, BaseViewHolder helper) {
//        ConvenientBanner mConvenientBanner = helper.getView(R.id.cb_convenient_banner);
//        mConvenientBanner.setPages(new CBViewHolderCreator() {
//            @Override
//            public Holder createHolder(View itemView) {
//                return new BannerHolderView(itemView, getContext());
//            }
//
//            @Override
//            public int getLayoutId() {
//                return R.layout.find_item_banner_view;
//            }
//        }, banners);
//        mConvenientBanner.startTurning(3000);
//    }

    @Override
    protected int getItemType(@NotNull List<? extends GetFindInfo.BlocksBean> list, int i) {
        Timber.i("BlockCode:" + list.get(i).getBlockCode());
        switch (list.get(i).getBlockCode()) {
            //轮播图
            case HOMEPAGE_BANNER:
                return TYPE_BANNER;
            //推荐歌单
            case HOMEPAGE_BLOCK_PLAYLIST_RCMD:
                return TYPE_BLOCK_PLAYLIST_RCMD;
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
        return 0;
    }
}
