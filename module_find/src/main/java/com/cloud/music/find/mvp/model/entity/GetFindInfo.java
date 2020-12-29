package com.cloud.music.find.mvp.model.entity;

import java.util.List;

public class GetFindInfo {


    /**
     * cursor : {"offset":5,"blockCodeOrderList":["HOMEPAGE_BANNER","HOMEPAGE_NEW_USER_WELCOME","HOMEPAGE_BLOCK_PLAYLIST_RCMD","HOMEPAGE_BLOCK_STYLE_RCMD","HOMEPAGE_MUSIC_CALENDAR","HOMEPAGE_BLOCK_OFFICIAL_PLAYLIST","HOMEPAGE_BLOCK_LISTEN_LIVE","HOMEPAGE_BLOCK_NEW_ALBUM_NEW_SONG","HOMEPAGE_BLOCK_TOPLIST","HOMEPAGE_PODCAST24","HOMEPAGE_BLOCK_FUN_CLUB","HOMEPAGE_VOICELIST_RCMD","HOMEPAGE_BLOCK_VIDEO_PLAYLIST"]}
     * blocks : [{"blockCode":"HOMEPAGE_BANNER","showType":"BANNER","extInfo":{"banners":[{"adLocation":null,"monitorImpress":null,"bannerId":"1609082955846932","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/Ji5IEpb3qLoJ3ClvaAoJmg==/109951165573103381.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":{"maxVideoPlayCount":3,"resourceId":"6ad13fdfb1f547e88da2fd43c449904b","videoUrl":"http://vodkgeyttp8.vod.126.net/cloudmusic/obj/w5vDksKTw6vClDrDicKx/5468727945/1759/dffe/68b9/026460d62e315dbb98de9a717ce06afa.mp4?wsSecret=6fbd5983472fd8701a5d090cfa0fb678&wsTime=1609153835","urlExpireTimeInMills":1609153835935},"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1339439.2122290791.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"独家策划","url":"https://st.music.163.com/c/year2020/index.html?refer=banner&full_screen=true","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":"10002","monitorImpress":"","bannerId":null,"extMonitor":[{"monitorImpress":"http://iad.service.163.org/adx/me.gif?adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=&dsp=10001&zz=303663&yy=90000003&pp=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&act=__ACT__&ua=__UA__&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&av=__APPVER__","monitorClick":"http://iad.service.163.org/adx/mc.gif?adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=&dsp=10001&zz=303663&yy=90000003&pp=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&act=__ACT__&ua=__UA__&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&av=__APPVER__","monitorType":"adx.inter","monitorConversion":null},{"monitorImpress":"http://iad.service.163.org/me.gif?ytgReq=A01SKPxxktu8Pb2N5IEldsTwm9FADar7Br4gWvvIDkmP4LMEmiW4kPlCM0m74hvdqHNsf3o_qPpxJRKIIUb7qDPuwp7-PAehbNKLR6FkJEO9g98zRVCiKGP70xF00EmgxrFIMakzlMQ8OLRDR-6x0nAUtIJ0Hf2zttAW-px9M_Mag8mWNDgaI3RXBi3Ohf2n74me_UrC1M4-vZxCDsQbsc3grCX6z-CpOM1uVw6y56twzSv4LlKaaH1ocMht-adBcsk9EtPB9D5-YOg2KhiNG9HkLW84oPLybzA-42dJGtY10k=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&o=__LP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&ua=__UA__&wp=3Fs5XEvTjxh_7bzVvICn0U86AtNEvR1HXcRycW8xiHjNQ_hFtOXtXli5_GrtDHj1GlBMs85p1aE6HiVVE5hLa-foX19QiTnKg5_ptjFAxygDLn49otVg263X3lIt3QMv85RFFd6-X_7hvV6oIPEd2QIEAzd_Rx88oZBzDTwVZetqnsrjgVnGuaXKOz4epl17&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&zz=303663&yy=90000003","monitorClick":"http://iad.service.163.org/mc.gif?ytgReq=A01SKPxxktu8Pb2N5IEldsTwm9FADar7Br4gWvvIDkmP4LMEmiW4kPlCM0m74hvdqHNsf3o_qPpxJRKIIUb7qDPuwp7-PAehbNKLR6FkJEO9g98zRVCiKGP70xF00EmgxrFIMakzlMQ8OLRDR-6x0nAUtIJ0Hf2zttAW-px9M_Mag8mWNDgaI3RXBi3Ohf2n74me_UrC1M4-vZxCDsQbsc3grCX6z-CpOM1uVw6y56twzSv4LlKaaH1ocMht-adBcsk9EtPB9D5-YOg2KhiNG9HkLW84oPLybzA-42dJGtY10k=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&o=__LP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&ua=__UA__&wp=3Fs5XEvTjxh_7bzVvICn0U86AtNEvR1HXcRycW8xiHjNQ_hFtOXtXli5_GrtDHj1GlBMs85p1aE6HiVVE5hLa-foX19QiTnKg5_ptjFAxygDLn49otVg263X3lIt3QMv85RFFd6-X_7hvV6oIPEd2QIEAzd_Rx88oZBzDTwVZetqnsrjgVnGuaXKOz4epl17&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&zz=303663&yy=90000003","monitorType":"ytg.inter","monitorConversion":null}],"pid":"4002","pic":"http://iadmusicmat.music.126.net/e2ad9efcc8f94a3db1f6c8f343acd072.jpg","program":null,"video":null,"adurlV2":"https://mz.tanzhouedu.com/?s=fd1a5e83114f71ba&maisuiCb=https%3A%2F%2Fad-effect.music.163.com%2Fad%2Feffect%3Fsource%3D__SOURCE__%26req%3DA01pWLrDgfC_goyTeLon15yqKgUVtXdECfCOWYnkA12cPbN3zKs9Gi0k32IVg7cV8zTSrKK2oVTzUvx08chxYPhiNfagrQd8URm87Hv-rUe86W11MXlE3_khXCXmHbeuTF1k3jf_LFHt35z0m1xyj8B3A%26convTime%3D__CONV_TIME__%26event%3D__EVENT__%26sign%3D__SIGN__%26adx_req%3DA0167S1w12Ap8P50mCQj97oIEzUHtOzQZ3SGd7Rofzjc3BDhp_LjnpQMTQzIb6Cs_qJOiA9QY0bDHv9sArXbHAWKA","adDispatchJson":"{\"sourceType\":0,\"pkgName\":\"\",\"monitorConversionList\":[],\"adMaterial\":{\"picList\":[],\"videoList\":[]},\"creativeType\":1}","dynamicVideoData":null,"monitorType":null,"adid":"8825067562187480151","titleColor":"blue","requestId":"540982408980475905","exclusive":false,"scm":"","event":null,"alg":null,"song":null,"targetId":8825067562187480000,"showAdTag":true,"adSource":"1","showContext":"了解更多","targetType":3000,"typeTitle":"广告","url":"https://mz.tanzhouedu.com/?s=fd1a5e83114f71ba&maisuiCb=https%3A%2F%2Fad-effect.music.163.com%2Fad%2Feffect%3Fsource%3D__SOURCE__%26req%3DA01pWLrDgfC_goyTeLon15yqKgUVtXdECfCOWYnkA12cPbN3zKs9Gi0k32IVg7cV8zTSrKK2oVTzUvx08chxYPhiNfagrQd8URm87Hv-rUe86W11MXlE3_khXCXmHbeuTF1k3jf_LFHt35z0m1xyj8B3A%26convTime%3D__CONV_TIME__%26event%3D__EVENT__%26sign%3D__SIGN__%26adx_req%3DA0167S1w12Ap8P50mCQj97oIEzUHtOzQZ3SGd7Rofzjc3BDhp_LjnpQMTQzIb6Cs_qJOiA9QY0bDHv9sArXbHAWKA","encodeId":"8825067562187480151","extMonitorInfo":{"aliAdId":"","reqId":"adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=","requestid":"","orderId":"","ad_type":"","dspId":"1","price":"","refer":"","needClickPosInfo":false,"mode":"","scm":"","spm":"","displayMd5Sign":"","monitorType":"1"},"monitorClick":"","monitorImpressList":[],"monitorBlackList":null,"monitorClickList":[]},{"adLocation":null,"monitorImpress":null,"bannerId":"1609083553358732","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/6Hvbz205syTAwyRfRrYAuQ==/109951165573138725.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1336451.2122408102.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"数字单曲","url":"https://music.163.com/store/newalbum/detail?id=120876623","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609083166165762","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/iJ6dX79ID1yDld2GqJZ-3A==/109951165573116353.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1334452.2122375173.null","event":null,"alg":null,"song":{"name":"Alien","id":1806926198,"pst":0,"t":0,"ar":[{"id":12078093,"name":"Jerry.P(TSP)","tns":[],"alias":[]},{"id":1038099,"name":"VaVa毛衍七","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":120859068,"name":"Hero mixtape","picUrl":"http://p4.music.126.net/-n3UQYRg-M6IYmGxpe9MFw==/109951165566414444.jpg","tns":[],"pic_str":"109951165566414444","pic":109951165566414450},"dt":204431,"h":{"br":320000,"fid":0,"size":8179505,"vd":-1866},"m":{"br":192000,"fid":0,"size":4907720,"vd":727},"l":{"br":128000,"fid":0,"size":3271828,"vd":2366},"a":null,"cd":"01","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":270336,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1418013,"mv":0,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":null}},"targetId":1806926198,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806926198","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609113890844796","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/H8M9mIJc4NfIOOXZ86hjgw==/109951165573590973.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1318440.2122348393.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"独家","url":"https://music.163.com/m/at/5f3e3df2fbd4b6cb97cb888d","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609081111018180","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/apgyMCGi9qSG5Ipf8R6BAw==/109951165573009058.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1322447.-624270121.null","event":null,"alg":null,"song":{"name":"奥秘","id":1501717293,"pst":0,"t":0,"ar":[{"id":28389406,"name":"段奥娟","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":8,"crbt":null,"cf":"","al":{"id":99324326,"name":"半熟·秘密","picUrl":"http://p4.music.126.net/ig1zE_ji1BSgmCqslWu08Q==/109951165529535306.jpg","tns":[],"pic_str":"109951165529535306","pic":109951165529535310},"dt":202142,"h":{"br":320002,"fid":0,"size":8088045,"vd":-52660},"m":{"br":192002,"fid":0,"size":4852845,"vd":-50163},"l":{"br":128002,"fid":0,"size":3235245,"vd":-48768},"a":null,"cd":"01","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1418072,"mv":0,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":null}},"targetId":1501717293,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1501717293","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609122648044254","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/Bwvy4ACQvCs_p6K6yeolsw==/109951165574765187.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1319461.-624270863.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"直播","url":"https://h5.iplay.163.com/st/column/home.html?id=1273201","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609142073940743","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/nhBmATCrtTwbM5PAlKLePw==/109951165580189871.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327446.2122284842.null","event":null,"alg":null,"song":{"name":"2020","id":1806966877,"pst":0,"t":0,"ar":[{"id":12270,"name":"面孔乐队","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":4,"crbt":null,"cf":"","al":{"id":120861791,"name":"2020","picUrl":"http://p4.music.126.net/QMLZtzBzok-XFfyEsGXVGg==/109951165572037725.jpg","tns":[],"pic_str":"109951165572037725","pic":109951165572037730},"dt":418248,"h":{"br":320000,"fid":0,"size":16731885,"vd":-54865},"m":{"br":192000,"fid":0,"size":10039149,"vd":-52309},"l":{"br":128000,"fid":0,"size":6692781,"vd":-50742},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1416873,"mv":14217560,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":{"vid":"14217560","type":0,"title":"2020","playTime":12395,"coverUrl":"http://p3.music.126.net/cFUwhXdfakm1POe5K_gCwg==/109951165571781314.jpg","publishTime":1609084800007,"artists":null,"alias":null}}},"targetId":1806966877,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806966877","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609084328812538","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/4MpdkprJNVveDoeuhdqSow==/109951165573180646.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327444.-624276754.null","event":null,"alg":null,"song":{"name":"圣尼古拉斯的雪天","id":1806476169,"pst":0,"t":0,"ar":[{"id":12798217,"name":"刘思鉴","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":3,"crbt":null,"cf":"","al":{"id":120277658,"name":"圣尼古拉斯的雪天","picUrl":"http://p4.music.126.net/WfXBQ4v8cLAxN722UvDUIw==/109951165560718212.jpg","tns":[],"pic_str":"109951165560718212","pic":109951165560718200},"dt":138616,"h":{"br":320000,"fid":0,"size":5546925,"vd":-52022},"m":{"br":192000,"fid":0,"size":3328173,"vd":-49408},"l":{"br":128000,"fid":0,"size":2218797,"vd":-47680},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":0,"mv":14216140,"publishTime":1608739200000,"videoInfo":{"moreThanOne":false,"video":{"vid":"14216140","type":0,"title":"圣尼古拉斯的雪天","playTime":18604,"coverUrl":"http://p4.music.126.net/WJNN8kJReGIdnfUu1IT7CQ==/109951165566487947.jpg","publishTime":1608825600007,"artists":null,"alias":null}}},"targetId":1806476169,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806476169","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609084396208545","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/SryMoOGgyEE002fLoANAmA==/109951165573187113.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327445.2122286946.null","event":null,"alg":null,"song":null,"targetId":120618796,"showAdTag":true,"adSource":null,"showContext":null,"targetType":10,"typeTitle":"独家","url":null,"encodeId":"120618796","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null}]},"canClose":false},{"blockCode":"HOMEPAGE_BLOCK_PLAYLIST_RCMD","showType":"HOMEPAGE_SLIDE_PLAYLIST","action":"orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"subTitle":{"title":"推荐歌单"},"button":{"action":"orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","text":"更多","iconUrl":null}},"creatives":[{"creativeType":"list","creativeId":"5309469822","action":"orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]},"resources":[{"uiElement":{"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]},"resourceType":"list","resourceId":"5309469822","resourceUrl":null,"resourceExtInfo":{"playCount":2289120,"highQuality":false},"action":"orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"featured","logInfo":null}],"alg":"featured","position":0},{"creativeType":"list","creativeId":"2248764279","action":"orpheus://playlist/2248764279?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"【高燃】剪辑踩点爆燃高能"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/iMAHsxQ6zuWo5NT74flYBA==/109951163932798337.jpg"},"labelTexts":["学习"]},"resources":[{"uiElement":{"mainTitle":{"title":"【高燃】剪辑踩点爆燃高能"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/iMAHsxQ6zuWo5NT74flYBA==/109951163932798337.jpg"},"labelTexts":["学习"]},"resourceType":"list","resourceId":"2248764279","resourceUrl":null,"resourceExtInfo":{"playCount":6742857,"highQuality":false},"action":"orpheus://playlist/2248764279?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"itembased","logInfo":null}],"alg":"itembased","position":0},{"creativeType":"list","creativeId":"635903110","action":"orpheus://playlist/635903110?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"一个天蝎座的听歌列表"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/jdE6eU2UFtobe5Kr1mSvCg==/109951163088559334.jpg"},"labelTexts":["华语","说唱","浪漫"]},"resources":[{"uiElement":{"mainTitle":{"title":"一个天蝎座的听歌列表"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/jdE6eU2UFtobe5Kr1mSvCg==/109951163088559334.jpg"},"labelTexts":["华语","说唱","浪漫"]},"resourceType":"list","resourceId":"635903110","resourceUrl":null,"resourceExtInfo":{"playCount":64208188,"highQuality":false},"action":"orpheus://playlist/635903110?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2382819181","action":"orpheus://playlist/2382819181?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"本人写作业学习歌单"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/u4OlLiqZyLpgUoL7sQbMSg==/109951163794555147.jpg"},"labelTexts":["流行","学习","翻唱"]},"resources":[{"uiElement":{"mainTitle":{"title":"本人写作业学习歌单"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/u4OlLiqZyLpgUoL7sQbMSg==/109951163794555147.jpg"},"labelTexts":["流行","学习","翻唱"]},"resourceType":"list","resourceId":"2382819181","resourceUrl":null,"resourceExtInfo":{"playCount":128587400,"highQuality":false},"action":"orpheus://playlist/2382819181?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2385384236","action":"orpheus://playlist/2385384236?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"失恋必听歌单 | 因为你突然听懂了很多歌"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/8BvBZSaI3SgEbRMVuQlKjQ==/109951163513812808.jpg"},"labelTexts":["思念","伤感","华语"]},"resources":[{"uiElement":{"mainTitle":{"title":"失恋必听歌单 | 因为你突然听懂了很多歌"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/8BvBZSaI3SgEbRMVuQlKjQ==/109951163513812808.jpg"},"labelTexts":["思念","伤感","华语"]},"resourceType":"list","resourceId":"2385384236","resourceUrl":null,"resourceExtInfo":{"playCount":139551760,"highQuality":false},"action":"orpheus://playlist/2385384236?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2732710018","action":"orpheus://playlist/2732710018?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"经典粤语合集【无损音质】黑胶会员专属"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/UBFfYqjvwr5_faX8MIT_JA==/109951165516763165.jpg"},"labelTexts":["粤语","怀旧","经典"]},"resources":[{"uiElement":{"mainTitle":{"title":"经典粤语合集【无损音质】黑胶会员专属"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/UBFfYqjvwr5_faX8MIT_JA==/109951165516763165.jpg"},"labelTexts":["粤语","怀旧","经典"]},"resourceType":"list","resourceId":"2732710018","resourceUrl":null,"resourceExtInfo":{"playCount":1198453,"highQuality":false},"action":"orpheus://playlist/2732710018?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"itembased","logInfo":null}],"alg":"itembased","position":0}],"canClose":false},{"blockCode":"HOMEPAGE_BLOCK_STYLE_RCMD","showType":"HOMEPAGE_SLIDE_SONGLIST_ALIGN","uiElement":{"mainTitle":{"title":"私人定制"},"subTitle":{"title":"一入电音深似海"},"button":{"action":"play_all_song","actionType":"client_customized","text":"播放","iconUrl":null}},"creatives":[{"creativeType":"SONG_LIST_HOMEPAGE","uiElement":{},"resources":[{"uiElement":{"mainTitle":{"title":"Sunburst"},"subTitle":{"title":"超24%人收藏","titleType":"songRcmdTag"},"image":{"imageUrl":"http://p1.music.126.net/KQ_MoqD1NhL2-CndmKd-rA==/109951164239509808.jpg"}},"resourceType":"song","resourceId":"28830411","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Tobu","id":964486,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Itro","id":1049096,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Sunburst","id":28830411,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":1416074,"disc":"1","no":1,"artists":[{"name":"Tobu","id":964486,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Itro","id":1049096,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Sunburst","id":2901139,"type":"EP/Single","size":1,"picId":109951164239509810,"blurPicUrl":"http://p4.music.126.net/KQ_MoqD1NhL2-CndmKd-rA==/109951164239509808.jpg","companyId":0,"pic":109951164239509810,"picUrl":"http://p4.music.126.net/KQ_MoqD1NhL2-CndmKd-rA==/109951164239509808.jpg","publishTime":1398528000000,"description":"","tags":"","company":"Tobu","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":1416074,"commentThreadId":"R_AL_3_2901139","artists":[{"name":"Tobu","id":964486,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951164239509808"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":189428,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_28830411","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":2,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":5343793,"hMusic":{"name":null,"id":3875981048,"size":7579733,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":189428,"volumeDelta":-74717},"mMusic":{"name":null,"id":3875981049,"size":4547857,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":189428,"volumeDelta":-72267},"lMusic":{"name":null,"id":3875981050,"size":3031919,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":189428,"volumeDelta":-70678},"bMusic":{"name":null,"id":3875981050,"size":3031919,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":189428,"volumeDelta":-70678},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":28830411,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":260,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Fade"},"subTitle":{"title":"美到窒息的弹电","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/6Skxbgl8cfIjFGV-MzGi0Q==/109951163787691327.jpg"}},"resourceType":"song","resourceId":"29947420","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Alan Walker","id":1045123,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Fade","id":29947420,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":743010,"disc":"01","no":1,"artists":[{"name":"Alan Walker","id":1045123,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Fade","id":3087270,"type":"Single","size":1,"picId":109951163787691330,"blurPicUrl":"http://p4.music.126.net/6Skxbgl8cfIjFGV-MzGi0Q==/109951163787691327.jpg","companyId":0,"pic":109951163787691330,"picUrl":"http://p4.music.126.net/6Skxbgl8cfIjFGV-MzGi0Q==/109951163787691327.jpg","publishTime":1416326400000,"description":"","tags":"","company":"NCS","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":743010,"commentThreadId":"R_AL_3_3087270","artists":[{"name":"Alan Walker","id":1045123,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163787691327"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":264013,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_29947420","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":2,"transName":null,"sign":null,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":3579214270,"size":10562917,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":264013,"volumeDelta":-2},"mMusic":{"name":null,"id":3579214271,"size":6337768,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":264013,"volumeDelta":-2},"lMusic":{"name":null,"id":3579214272,"size":4225193,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":264013,"volumeDelta":-2},"bMusic":{"name":null,"id":3579214272,"size":4225193,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":264013,"volumeDelta":-2},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":29947420,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":261,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"美到窒息的弹电","commentId":8365902,"threadId":"R_SO_4_29947420","userId":37245360,"userName":"帐号已注销"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Touch The Sky"},"subTitle":{"title":"白茶清欢无别事 我在等风也等你","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/ruDpbxMjJmIkHahv1JPhRg==/109951163242829675.jpg"}},"resourceType":"song","resourceId":"552145020","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Cedric Gervais","id":30871,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Dallas Austin","id":13188875,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Digital Farm Animals","id":840929,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Touch The Sky","id":552145020,"position":0,"alias":[],"status":0,"fee":8,"copyrightId":665010,"disc":"02","no":6,"artists":[{"name":"Cedric Gervais","id":30871,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Dallas Austin","id":13188875,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Digital Farm Animals","id":840929,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Armada Music Top 100 (Mini Mix 001)","id":38316632,"type":"专辑","size":20,"picId":109951163242829680,"blurPicUrl":"http://p3.music.126.net/ruDpbxMjJmIkHahv1JPhRg==/109951163242829675.jpg","companyId":0,"pic":109951163242829680,"picUrl":"http://p3.music.126.net/ruDpbxMjJmIkHahv1JPhRg==/109951163242829675.jpg","publishTime":1497542400007,"description":"","tags":"","company":"ARVA","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":1,"copyrightId":665010,"commentThreadId":"R_AL_3_38316632","artists":[{"name":"Various Artists","id":104700,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"混音版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163242829675"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":155962,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_552145020","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":1,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":1453035836,"size":6241219,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":155962,"volumeDelta":-34900},"mMusic":{"name":null,"id":1453035837,"size":3744749,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":155962,"volumeDelta":-32400},"lMusic":{"name":null,"id":1453035838,"size":2496514,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":155962,"volumeDelta":-31099},"bMusic":{"name":null,"id":1453035838,"size":2496514,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":155962,"volumeDelta":-31099},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":552145020,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":261,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"白茶清欢无别事 我在等风也等你","commentId":1617441357,"threadId":"R_SO_4_552145020","userId":282127024,"userName":"众人齐跪"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"}],"position":0},{"creativeType":"SONG_LIST_HOMEPAGE","uiElement":{},"resources":[{"uiElement":{"mainTitle":{"title":"Firework"},"subTitle":{"title":"黑暗一直都想将你吞没只是畏惧光芒","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/LZLP-yjyhpQHGebZ7_wYIg==/7878000814135641.jpg"}},"resourceType":"song","resourceId":"2871217","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Katy Perry","id":62888,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Firework","id":2871217,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":7003,"disc":"1","no":1,"artists":[{"name":"Katy Perry","id":62888,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Firework","id":289915,"type":"专辑","size":9,"picId":7878000814135641,"blurPicUrl":"http://p3.music.126.net/LZLP-yjyhpQHGebZ7_wYIg==/7878000814135641.jpg","companyId":0,"pic":7878000814135641,"picUrl":"http://p3.music.126.net/LZLP-yjyhpQHGebZ7_wYIg==/7878000814135641.jpg","publishTime":1288022400007,"description":"","tags":"","company":"环球唱片","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":1,"copyrightId":7003,"commentThreadId":"R_AL_3_289915","artists":[{"name":"Katy Perry","id":62888,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"混音版","transName":null,"onSale":false,"mark":0},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":227000,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_2871217","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":1,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":5058,"hMusic":{"name":null,"id":64643907,"size":9118969,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":227000,"volumeDelta":-13500},"mMusic":{"name":null,"id":93033256,"size":5471439,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":227000,"volumeDelta":-11000},"lMusic":{"name":null,"id":64643908,"size":3647674,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":227000,"volumeDelta":-9400},"bMusic":{"name":null,"id":64643908,"size":3647674,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":227000,"volumeDelta":-9400},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":2871217,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"pc":null,"toast":false,"flag":4,"paidBigBang":false,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"黑暗一直都想将你吞没只是畏惧光芒","commentId":1548274266,"threadId":"R_SO_4_2871217","userId":550919914,"userName":"蓝色薄荷糖Kyu"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Journey旅程"},"subTitle":{"title":"闲云野鹤写写景 苦劳奔波写拼命","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/nQF_HnM3-QDe1_GuspH2LQ==/109951163990005507.jpg"}},"resourceType":"song","resourceId":"1357945010","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"肖恩Shaun Gibson","id":1044241,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Journey旅程","id":1357945010,"position":0,"alias":[],"status":0,"fee":8,"copyrightId":0,"disc":"01","no":1,"artists":[{"name":"肖恩Shaun Gibson","id":1044241,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Journey旅程","id":78403999,"type":"EP/Single","size":1,"picId":109951163990005500,"blurPicUrl":"http://p3.music.126.net/nQF_HnM3-QDe1_GuspH2LQ==/109951163990005507.jpg","companyId":0,"pic":109951163990005500,"picUrl":"http://p3.music.126.net/nQF_HnM3-QDe1_GuspH2LQ==/109951163990005507.jpg","publishTime":1554825600000,"description":"","tags":"","company":null,"briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":0,"commentThreadId":"R_AL_3_78403999","artists":[{"name":"肖恩Shaun Gibson","id":1044241,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163990005507"},"starred":false,"popularity":95,"score":95,"starredNum":0,"duration":220819,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_1357945010","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":0,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":3741345564,"size":8835701,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":220819,"volumeDelta":-15599},"mMusic":{"name":null,"id":3741345565,"size":5301438,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":220819,"volumeDelta":-12900},"lMusic":{"name":null,"id":3741345566,"size":3534306,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":220819,"volumeDelta":-11200},"bMusic":{"name":null,"id":3741345566,"size":3534306,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":220819,"volumeDelta":-11200},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":1357945010,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":2,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"闲云野鹤写写景 苦劳奔波写拼命","commentId":1449625161,"threadId":"R_SO_4_1357945010","userId":112366861,"userName":"梦影_"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Happy"},"subTitle":{"title":"有情不必终老 暗香浮动恰好","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/CiZTgd1Frwf6dgVJIJxLfA==/109951164724862545.jpg"}},"resourceType":"song","resourceId":"26548584","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Pharrell Williams","id":41151,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Happy","id":26548584,"position":4,"alias":["电影《神偷奶爸2》插曲"],"status":0,"fee":8,"copyrightId":743010,"disc":"1","no":4,"artists":[{"name":"Pharrell Williams","id":41151,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Despicable Me 2 (Original Motion Picture Soundtrack)","id":2522067,"type":"专辑","size":24,"picId":109951164724862540,"blurPicUrl":"http://p4.music.126.net/CiZTgd1Frwf6dgVJIJxLfA==/109951164724862545.jpg","companyId":0,"pic":109951164724862540,"picUrl":"http://p4.music.126.net/CiZTgd1Frwf6dgVJIJxLfA==/109951164724862545.jpg","publishTime":1371484800000,"description":"","tags":"","company":"Back Lot Music","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":["神偷奶爸2"],"status":1,"copyrightId":743010,"commentThreadId":"R_AL_3_2522067","artists":[{"name":"Various Artists","id":104700,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":"神偷奶爸2","onSale":false,"mark":0,"picId_str":"109951164724862545","transNames":["神偷奶爸2"]},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":233305,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_26548584","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":1,"transName":null,"sign":null,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":206025,"hMusic":{"name":null,"id":4517796675,"size":9335162,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":233305,"volumeDelta":-44875},"mMusic":{"name":null,"id":4517796676,"size":5601115,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":233305,"volumeDelta":-42343},"lMusic":{"name":null,"id":4517796677,"size":3734091,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":233305,"volumeDelta":-40749},"bMusic":{"name":null,"id":4517796677,"size":3734091,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":233305,"volumeDelta":-40749},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":26548584,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":261,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"有情不必终老 暗香浮动恰好","commentId":622308784,"threadId":"R_SO_4_26548584","userId":356778056,"userName":"無極大大"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"}],"position":0},{"creativeType":"SONG_LIST_HOMEPAGE","uiElement":{},"resources":[{"uiElement":{"mainTitle":{"title":"Coincidance (抖肩舞)"},"subTitle":{"title":"看到你的 我笑成了你口中的牌","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/hOiQAsK7NCVzMUz14HoT6w==/109951163064418511.jpg"}},"resourceType":"song","resourceId":"519250197","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Handsome Dancer","id":12870416,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Coincidance (抖肩舞)","id":519250197,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":1416618,"disc":"1","no":1,"artists":[{"name":"Handsome Dancer","id":12870416,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Coincidance (抖肩舞)","id":36784334,"type":"EP/Single","size":1,"picId":109951163064418510,"blurPicUrl":"http://p4.music.126.net/hOiQAsK7NCVzMUz14HoT6w==/109951163064418511.jpg","companyId":0,"pic":109951163064418510,"picUrl":"http://p4.music.126.net/hOiQAsK7NCVzMUz14HoT6w==/109951163064418511.jpg","publishTime":1554048000000,"description":"","tags":"","company":"音尚律动","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":1416618,"commentThreadId":"R_AL_3_36784334","artists":[{"name":"Handsome Dancer","id":12870416,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163064418511"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":144230,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_519250197","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":0,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":null,"mMusic":{"name":null,"id":5202406845,"size":3463253,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":144230,"volumeDelta":-28433},"lMusic":null,"bMusic":null,"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":519250197,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":4,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"看到你的 我笑成了你口中的牌","commentId":1361729676,"threadId":"R_SO_4_519250197","userId":563707683,"userName":"亚兰特斯丶"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Imagine Me Without You"},"subTitle":{"title":"前奏跪完开口跪系列","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/wjYi7Muo2weqcxv2QpkTaA==/1762517139330107.jpg"}},"resourceType":"song","resourceId":"2781188","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Jaci Velasquez","id":60984,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Imagine Me Without You","id":2781188,"position":14,"alias":[],"status":0,"fee":8,"copyrightId":7002,"disc":"1","no":14,"artists":[{"name":"Jaci Velasquez","id":60984,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Diamond (Deluxe Edition)","id":280412,"type":"专辑","size":14,"picId":1762517139330107,"blurPicUrl":"http://p4.music.126.net/wjYi7Muo2weqcxv2QpkTaA==/1762517139330107.jpg","companyId":0,"pic":1762517139330107,"picUrl":"http://p3.music.126.net/wjYi7Muo2weqcxv2QpkTaA==/1762517139330107.jpg","publishTime":1328198400007,"description":"","tags":"","company":"Inpop Records","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":1,"copyrightId":0,"commentThreadId":"R_AL_3_280412","artists":[{"name":"Jaci Velasquez","id":60984,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":247000,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_2781188","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":2,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":64692730,"size":9919278,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":247000,"volumeDelta":-2},"mMusic":{"name":null,"id":92913712,"size":5951591,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":247000,"volumeDelta":-2},"lMusic":{"name":null,"id":64692731,"size":3967748,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":247000,"volumeDelta":-2},"bMusic":{"name":null,"id":64692731,"size":3967748,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":247000,"volumeDelta":-2},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":2781188,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"pc":null,"toast":false,"flag":0,"paidBigBang":false,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"前奏跪完开口跪系列","commentId":9019679,"threadId":"R_SO_4_2781188","userId":19005952,"userName":"橙光的海角"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"We Can't Stop"},"subTitle":{"title":"用欢快的节奏掩饰失落和孤寂","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/lrlXAvlod8XF62-ENxK_HQ==/109951163168819865.jpg"}},"resourceType":"song","resourceId":"26429346","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Miley Cyrus","id":66361,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"We Can't Stop","id":26429346,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":7001,"disc":"1","no":1,"artists":[{"name":"Miley Cyrus","id":66361,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"We Can't Stop - Single","id":2499063,"type":"EP/Single","size":1,"picId":109951163168819870,"blurPicUrl":"http://p3.music.126.net/lrlXAvlod8XF62-ENxK_HQ==/109951163168819865.jpg","companyId":0,"pic":109951163168819870,"picUrl":"http://p4.music.126.net/lrlXAvlod8XF62-ENxK_HQ==/109951163168819865.jpg","publishTime":1370275200007,"description":"","tags":"","company":"RCA Records","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":3,"copyrightId":7001,"commentThreadId":"R_AL_3_2499063","artists":[{"name":"Miley Cyrus","id":66361,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163168819865"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":232000,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":"","crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_26429346","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":1,"transName":null,"sign":null,"mark":0,"originCoverType":1,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":148016,"hMusic":{"name":null,"id":64654661,"size":9300832,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":232000,"volumeDelta":-15700},"mMusic":{"name":null,"id":92017759,"size":5580578,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":232000,"volumeDelta":-13300},"lMusic":{"name":null,"id":64654662,"size":3720450,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":232000,"volumeDelta":-12300},"bMusic":{"name":null,"id":64654662,"size":3720450,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":232000,"volumeDelta":-12300},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":26429346,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"pc":null,"toast":false,"flag":260,"paidBigBang":false,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"用欢快的节奏掩饰失落和孤寂","commentId":510199499,"threadId":"R_SO_4_26429346","userId":106468675,"userName":"SpinWithYouTogether"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_off_src","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"}],"position":0},{"creativeType":"SONG_LIST_HOMEPAGE","uiElement":{},"resources":[{"uiElement":{"mainTitle":{"title":"Earthquake"},"subTitle":{"title":"硬好与Harrison继Sally第二次合作","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/xkrAKO_Ka5nmJUTHhQMefg==/109951163293124028.jpg"}},"resourceType":"song","resourceId":"557584485","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Hardwell","id":34994,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Harrison","id":34714,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Earthquake","id":557584485,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":743010,"disc":"01","no":1,"artists":[{"name":"Hardwell","id":34994,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Harrison","id":34714,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Earthquake","id":38595158,"type":"EP/Single","size":2,"picId":109951163293124030,"blurPicUrl":"http://p3.music.126.net/xkrAKO_Ka5nmJUTHhQMefg==/109951163293124028.jpg","companyId":0,"pic":109951163293124030,"picUrl":"http://p4.music.126.net/xkrAKO_Ka5nmJUTHhQMefg==/109951163293124028.jpg","publishTime":1525968000007,"description":"","tags":"","company":"Revealed Recordings","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":0,"commentThreadId":"R_AL_3_38595158","artists":[{"name":"Hardwell","id":34994,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},{"name":"Harrison","id":34714,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163293124028"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":177266,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_557584485","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":0,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":5910106,"hMusic":{"name":null,"id":1467694560,"size":7092811,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":177266,"volumeDelta":-33400},"mMusic":{"name":null,"id":1467694561,"size":4255704,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":177266,"volumeDelta":-30900},"lMusic":{"name":null,"id":1467694562,"size":2837151,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":177266,"volumeDelta":-30300},"bMusic":{"name":null,"id":1467694562,"size":2837151,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":177266,"volumeDelta":-30300},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":557584485,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":128000,"pc":null,"toast":false,"flag":261,"paidBigBang":false,"preSell":false,"playMaxbr":320000,"downloadMaxbr":320000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"硬好与Harrison继Sally第二次合作","commentId":0,"threadId":null,"userId":0,"userName":null}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_red","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Heist"},"subTitle":{"title":"绝地求生精彩集锦必备BGM","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/yyaEioqbZqq2gZMtSHrgbg==/109951163311323380.jpg"}},"resourceType":"song","resourceId":"35331692","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Noisestorm","id":98081,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Heist","id":35331692,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":729016,"disc":"1","no":1,"artists":[{"name":"Noisestorm","id":98081,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Heist","id":3319069,"type":"EP/Single","size":1,"picId":109951163311323380,"blurPicUrl":"http://p4.music.126.net/yyaEioqbZqq2gZMtSHrgbg==/109951163311323380.jpg","companyId":0,"pic":109951163311323380,"picUrl":"http://p3.music.126.net/yyaEioqbZqq2gZMtSHrgbg==/109951163311323380.jpg","publishTime":1444003200000,"description":"","tags":"","company":"Monstercat","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":729016,"commentThreadId":"R_AL_3_3319069","artists":[{"name":"Noisestorm","id":98081,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163311323380"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":182117,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_35331692","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":0,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":1482439021,"size":7287162,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":182117,"volumeDelta":-48500},"mMusic":{"name":null,"id":1482439022,"size":4372315,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":182117,"volumeDelta":-46600},"lMusic":{"name":null,"id":1482439023,"size":2914891,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":182117,"volumeDelta":-44699},"bMusic":{"name":null,"id":1482439023,"size":2914891,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":182117,"volumeDelta":-44699},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":35331692,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":4,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"绝地求生精彩集锦必备BGM","commentId":1080701992,"threadId":"R_SO_4_35331692","userId":605060133,"userName":"卦中无双"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_red","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"},{"uiElement":{"mainTitle":{"title":"Big Words"},"subTitle":{"title":"你无需哗众取宠 这才是我需要的","titleType":"songRcmdFromComment"},"image":{"imageUrl":"http://p1.music.126.net/NuEIlD9iObN9expbWfcmjw==/109951163324110475.jpg"}},"resourceType":"song","resourceId":"569870379","resourceUrl":null,"resourceExtInfo":{"artists":[{"name":"Klaas","id":106210,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"songData":{"name":"Big Words","id":569870379,"position":1,"alias":[],"status":0,"fee":8,"copyrightId":679014,"disc":"1","no":1,"artists":[{"name":"Klaas","id":106210,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"album":{"name":"Big Words","id":39391421,"type":"EP/Single","size":2,"picId":109951163324110480,"blurPicUrl":"http://p4.music.126.net/NuEIlD9iObN9expbWfcmjw==/109951163324110475.jpg","companyId":0,"pic":109951163324110480,"picUrl":"http://p4.music.126.net/NuEIlD9iObN9expbWfcmjw==/109951163324110475.jpg","publishTime":1525392000000,"description":"","tags":"","company":"You Love Dance","briefDesc":"","artist":{"name":"","id":0,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0},"songs":[],"alias":[],"status":0,"copyrightId":679014,"commentThreadId":"R_AL_3_39391421","artists":[{"name":"Klaas","id":106210,"picId":0,"img1v1Id":0,"briefDesc":"","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","albumSize":0,"alias":[],"trans":"","musicSize":0,"topicPerson":0}],"subType":"录音室版","transName":null,"onSale":false,"mark":0,"picId_str":"109951163324110475"},"starred":false,"popularity":100,"score":100,"starredNum":0,"duration":202857,"playedNum":0,"dayPlays":0,"hearTime":0,"ringtone":null,"crbt":null,"audition":null,"copyFrom":"","commentThreadId":"R_SO_4_569870379","rtUrl":null,"ftype":0,"rtUrls":[],"copyright":1,"transName":null,"sign":null,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mvid":0,"hMusic":{"name":null,"id":3425332388,"size":8116811,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":320000,"playTime":202857,"volumeDelta":-16100},"mMusic":{"name":null,"id":3425332389,"size":4870104,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":192000,"playTime":202857,"volumeDelta":-13700},"lMusic":{"name":null,"id":3425332390,"size":3246751,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":202857,"volumeDelta":-12300},"bMusic":{"name":null,"id":3425332390,"size":3246751,"extension":"mp3","sr":44100,"dfsId":0,"bitrate":128000,"playTime":202857,"volumeDelta":-12300},"mp3Url":null,"rtype":0,"rurl":null},"songPrivilege":{"id":569870379,"fee":8,"payed":0,"realPayed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"pc":null,"toast":false,"flag":68,"paidBigBang":false,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000,"chargeInfoList":[{"rate":128000,"chargeUrl":null,"chargeMessage":null,"chargeType":0},{"rate":192000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":320000,"chargeUrl":null,"chargeMessage":null,"chargeType":1},{"rate":999000,"chargeUrl":null,"chargeMessage":null,"chargeType":1}]},"commentSimpleData":{"content":"你无需哗众取宠 这才是我需要的","commentId":1342938877,"threadId":"R_SO_4_569870379","userId":1492515783,"userName":"_世间美好与你环环相扣l"}},"action":"play_all_song_from_current_index","actionType":"client_customized","valid":true,"alg":"alg_hp_tr_tag_ns","logInfo":"{\"category1\":\"tag\",\"category2\":\"ELECTRONIC\"}"}],"position":0}],"canClose":false},{"blockCode":"HOMEPAGE_MUSIC_CALENDAR","showType":"SHUFFLE_MUSIC_CALENDAR","uiElement":{"subTitle":{"title":"音乐日历"},"button":{"action":"orpheus://nm/musicCalendar/detail?eventRefer=recommendpersonal","actionType":"orpheus","text":"更多","iconUrl":null}},"creatives":[{"creativeType":"HOMEPAGE_MUSIC_EVENT","creativeId":"artistPreviewEvent_12091048_336104","actionType":"orpheus","code":"HOMEPAGE_MUSIC_CALENDAR","resources":[{"uiElement":{"mainTitle":{"title":"预告-王泽科的最新作品「你 · 我」"},"image":{"imageUrl":"http://p1.music.126.net/iiq4M_MmaXf4v567jOgp4Q==/109951165579958306.jpg"},"labelTexts":["大事件"]},"resourceType":"ALBUM","resourceId":"120924404","resourceUrl":"orpheus://nm/musicCalendar/eventDetail?eventID=artistPreviewEvent_12091048_336104&eventType=REP_TRAILER&eventRefer=inside_click","resourceExtInfo":{"startTime":1609156800000,"endTime":1609156800000,"subCount":53,"subed":false,"canSubscribe":true,"bigEvent":true,"eventId":"artistPreviewEvent_12091048_336104","eventType":"REP_TRAILER"},"action":"orpheus://nm/musicCalendar/detail?date=1609156800000&eventID=artistPreviewEvent_12091048_336104&eventRefer=recommendpersonal","actionType":"orpheus","valid":true,"alg":null,"logInfo":null}],"position":0},{"creativeType":"HOMEPAGE_MUSIC_EVENT","creativeId":"artistPreviewEvent_12871618_333113","actionType":"orpheus","code":"HOMEPAGE_MUSIC_CALENDAR","resources":[{"uiElement":{"mainTitle":{"title":"预告-王一博的最新作品「我的世界守则」"},"image":{"imageUrl":"http://p1.music.126.net/sTr-8_GakG4BiAitk8IqZg==/109951165564610917.jpg"}},"resourceType":"ALBUM","resourceId":"","resourceUrl":"orpheus://nm/musicCalendar/eventDetail?eventID=artistPreviewEvent_12871618_333113&eventType=REP_TRAILER&eventRefer=inside_click","resourceExtInfo":{"startTime":1609300800000,"endTime":1609300800000,"subCount":116262,"subed":false,"canSubscribe":true,"bigEvent":true,"eventId":"artistPreviewEvent_12871618_333113","eventType":"REP_TRAILER"},"action":"orpheus://nm/musicCalendar/detail?date=1609300800000&eventID=artistPreviewEvent_12871618_333113&eventRefer=recommendpersonal","actionType":"orpheus","valid":true,"alg":null,"logInfo":null}],"position":0}],"canClose":false}]
     * hasMore : true
     * blockUUIDs : null
     * pageConfig : {"refreshToast":"","nodataToast":"到底啦~","refreshInterval":600000,"title":null,"fullscreen":false,"abtest":["homepage-v7.3","homepage-v7.4","hp-list2-v2","sunny-vip-rpc2","fm-hp7-all2","fm-hp7-all","daily-flow2","daily-health2","mp-mgc-new","list-reason-new","list-cover-new","sunny-playlist2","mgc-sunny2","playlist-rank","hp-dailyrec","HP-alg-apollo","playlist-page","hp-title-3","mp-vip-playlist","hp-calendar-3","server-op-sunny","mp-mgc-new2","newuserevent1","hp-yunquan-1","yunbei-all-test","radar-yuncun","hy-enhance","hp-mod-sort-v1","alg-hp7-t1","scene-playlist","mp-radar","alg-list-square","hy-playlist-rk","alg-hp7-t2","hy-mgc-radar","total-intent","mgc-square","FH-style-flow","mgc-mystery","style-rec-flow","mp-filter","mgc-list","mgc-artist","mgc-time","mgc-newsong","mgc-tail","mgc-new-tail-test"],"songLabelMarkPriority":["trial","vip","exclusive","sq","pre_sale"],"songLabelMarkLimit":1,"homepageMode":"RCMD_MODE","showModeEntry":false}
     * guideToast : {"hasGuideToast":false,"toastList":[]}
     */

    private String cursor;
    private boolean hasMore;
    private Object blockUUIDs;
    private PageConfigBean pageConfig;
    private GuideToastBean guideToast;
    private List<BlocksBean> blocks;

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Object getBlockUUIDs() {
        return blockUUIDs;
    }

    public void setBlockUUIDs(Object blockUUIDs) {
        this.blockUUIDs = blockUUIDs;
    }

    public PageConfigBean getPageConfig() {
        return pageConfig;
    }

    public void setPageConfig(PageConfigBean pageConfig) {
        this.pageConfig = pageConfig;
    }

    public GuideToastBean getGuideToast() {
        return guideToast;
    }

    public void setGuideToast(GuideToastBean guideToast) {
        this.guideToast = guideToast;
    }

    public List<BlocksBean> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlocksBean> blocks) {
        this.blocks = blocks;
    }

    public static class PageConfigBean {
        /**
         * refreshToast :
         * nodataToast : 到底啦~
         * refreshInterval : 600000
         * title : null
         * fullscreen : false
         * abtest : ["homepage-v7.3","homepage-v7.4","hp-list2-v2","sunny-vip-rpc2","fm-hp7-all2","fm-hp7-all","daily-flow2","daily-health2","mp-mgc-new","list-reason-new","list-cover-new","sunny-playlist2","mgc-sunny2","playlist-rank","hp-dailyrec","HP-alg-apollo","playlist-page","hp-title-3","mp-vip-playlist","hp-calendar-3","server-op-sunny","mp-mgc-new2","newuserevent1","hp-yunquan-1","yunbei-all-test","radar-yuncun","hy-enhance","hp-mod-sort-v1","alg-hp7-t1","scene-playlist","mp-radar","alg-list-square","hy-playlist-rk","alg-hp7-t2","hy-mgc-radar","total-intent","mgc-square","FH-style-flow","mgc-mystery","style-rec-flow","mp-filter","mgc-list","mgc-artist","mgc-time","mgc-newsong","mgc-tail","mgc-new-tail-test"]
         * songLabelMarkPriority : ["trial","vip","exclusive","sq","pre_sale"]
         * songLabelMarkLimit : 1
         * homepageMode : RCMD_MODE
         * showModeEntry : false
         */

        private String refreshToast;
        private String nodataToast;
        private int refreshInterval;
        private Object title;
        private boolean fullscreen;
        private int songLabelMarkLimit;
        private String homepageMode;
        private boolean showModeEntry;
        private List<String> abtest;
        private List<String> songLabelMarkPriority;

        public String getRefreshToast() {
            return refreshToast;
        }

        public void setRefreshToast(String refreshToast) {
            this.refreshToast = refreshToast;
        }

        public String getNodataToast() {
            return nodataToast;
        }

        public void setNodataToast(String nodataToast) {
            this.nodataToast = nodataToast;
        }

        public int getRefreshInterval() {
            return refreshInterval;
        }

        public void setRefreshInterval(int refreshInterval) {
            this.refreshInterval = refreshInterval;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
        }

        public boolean isFullscreen() {
            return fullscreen;
        }

        public void setFullscreen(boolean fullscreen) {
            this.fullscreen = fullscreen;
        }

        public int getSongLabelMarkLimit() {
            return songLabelMarkLimit;
        }

        public void setSongLabelMarkLimit(int songLabelMarkLimit) {
            this.songLabelMarkLimit = songLabelMarkLimit;
        }

        public String getHomepageMode() {
            return homepageMode;
        }

        public void setHomepageMode(String homepageMode) {
            this.homepageMode = homepageMode;
        }

        public boolean isShowModeEntry() {
            return showModeEntry;
        }

        public void setShowModeEntry(boolean showModeEntry) {
            this.showModeEntry = showModeEntry;
        }

        public List<String> getAbtest() {
            return abtest;
        }

        public void setAbtest(List<String> abtest) {
            this.abtest = abtest;
        }

        public List<String> getSongLabelMarkPriority() {
            return songLabelMarkPriority;
        }

        public void setSongLabelMarkPriority(List<String> songLabelMarkPriority) {
            this.songLabelMarkPriority = songLabelMarkPriority;
        }
    }

    public static class GuideToastBean {
        /**
         * hasGuideToast : false
         * toastList : []
         */

        private boolean hasGuideToast;
        private List<?> toastList;

        public boolean isHasGuideToast() {
            return hasGuideToast;
        }

        public void setHasGuideToast(boolean hasGuideToast) {
            this.hasGuideToast = hasGuideToast;
        }

        public List<?> getToastList() {
            return toastList;
        }

        public void setToastList(List<?> toastList) {
            this.toastList = toastList;
        }
    }

    public static class BlocksBean {
        /**
         * blockCode : HOMEPAGE_BANNER
         * showType : BANNER
         * extInfo : {"banners":[{"adLocation":null,"monitorImpress":null,"bannerId":"1609082955846932","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/Ji5IEpb3qLoJ3ClvaAoJmg==/109951165573103381.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":{"maxVideoPlayCount":3,"resourceId":"6ad13fdfb1f547e88da2fd43c449904b","videoUrl":"http://vodkgeyttp8.vod.126.net/cloudmusic/obj/w5vDksKTw6vClDrDicKx/5468727945/1759/dffe/68b9/026460d62e315dbb98de9a717ce06afa.mp4?wsSecret=6fbd5983472fd8701a5d090cfa0fb678&wsTime=1609153835","urlExpireTimeInMills":1609153835935},"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1339439.2122290791.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"独家策划","url":"https://st.music.163.com/c/year2020/index.html?refer=banner&full_screen=true","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":"10002","monitorImpress":"","bannerId":null,"extMonitor":[{"monitorImpress":"http://iad.service.163.org/adx/me.gif?adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=&dsp=10001&zz=303663&yy=90000003&pp=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&act=__ACT__&ua=__UA__&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&av=__APPVER__","monitorClick":"http://iad.service.163.org/adx/mc.gif?adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=&dsp=10001&zz=303663&yy=90000003&pp=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&act=__ACT__&ua=__UA__&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&av=__APPVER__","monitorType":"adx.inter","monitorConversion":null},{"monitorImpress":"http://iad.service.163.org/me.gif?ytgReq=A01SKPxxktu8Pb2N5IEldsTwm9FADar7Br4gWvvIDkmP4LMEmiW4kPlCM0m74hvdqHNsf3o_qPpxJRKIIUb7qDPuwp7-PAehbNKLR6FkJEO9g98zRVCiKGP70xF00EmgxrFIMakzlMQ8OLRDR-6x0nAUtIJ0Hf2zttAW-px9M_Mag8mWNDgaI3RXBi3Ohf2n74me_UrC1M4-vZxCDsQbsc3grCX6z-CpOM1uVw6y56twzSv4LlKaaH1ocMht-adBcsk9EtPB9D5-YOg2KhiNG9HkLW84oPLybzA-42dJGtY10k=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&o=__LP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&ua=__UA__&wp=3Fs5XEvTjxh_7bzVvICn0U86AtNEvR1HXcRycW8xiHjNQ_hFtOXtXli5_GrtDHj1GlBMs85p1aE6HiVVE5hLa-foX19QiTnKg5_ptjFAxygDLn49otVg263X3lIt3QMv85RFFd6-X_7hvV6oIPEd2QIEAzd_Rx88oZBzDTwVZetqnsrjgVnGuaXKOz4epl17&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&zz=303663&yy=90000003","monitorClick":"http://iad.service.163.org/mc.gif?ytgReq=A01SKPxxktu8Pb2N5IEldsTwm9FADar7Br4gWvvIDkmP4LMEmiW4kPlCM0m74hvdqHNsf3o_qPpxJRKIIUb7qDPuwp7-PAehbNKLR6FkJEO9g98zRVCiKGP70xF00EmgxrFIMakzlMQ8OLRDR-6x0nAUtIJ0Hf2zttAW-px9M_Mag8mWNDgaI3RXBi3Ohf2n74me_UrC1M4-vZxCDsQbsc3grCX6z-CpOM1uVw6y56twzSv4LlKaaH1ocMht-adBcsk9EtPB9D5-YOg2KhiNG9HkLW84oPLybzA-42dJGtY10k=&t=__TIME__&ni=__IESID__&mo=__OS__&ns=__IP__&m0=__OPENUDID__&m0a=__DUID__&m1=__ANDROIDID1__&m1a=__ANDROIDID__&m2=__IMEI__&m4=__AAID__&m5=__IDFA__&m6=__MAC1__&m6a=__MAC__&nn=__APP__&ur=__URS__&mu=__MURS__&mo1=__OS1__&nws=__NWS__&op=__OP__&o=__LP__&la=__LA__&lo=__LO__&laot=__LAOT__&meid=__MEID__&mcid=__MCID__&ua=__UA__&wp=3Fs5XEvTjxh_7bzVvICn0U86AtNEvR1HXcRycW8xiHjNQ_hFtOXtXli5_GrtDHj1GlBMs85p1aE6HiVVE5hLa-foX19QiTnKg5_ptjFAxygDLn49otVg263X3lIt3QMv85RFFd6-X_7hvV6oIPEd2QIEAzd_Rx88oZBzDTwVZetqnsrjgVnGuaXKOz4epl17&ugcId=__UGCID__&ugcType=__UGCTYPE__&m2md5=__IMEIMD5__&m5md5=__IDFAMD5__&deviceId=__DEVICE_ID__&oaid=__OAID__&target=__TARGET__&zz=303663&yy=90000003","monitorType":"ytg.inter","monitorConversion":null}],"pid":"4002","pic":"http://iadmusicmat.music.126.net/e2ad9efcc8f94a3db1f6c8f343acd072.jpg","program":null,"video":null,"adurlV2":"https://mz.tanzhouedu.com/?s=fd1a5e83114f71ba&maisuiCb=https%3A%2F%2Fad-effect.music.163.com%2Fad%2Feffect%3Fsource%3D__SOURCE__%26req%3DA01pWLrDgfC_goyTeLon15yqKgUVtXdECfCOWYnkA12cPbN3zKs9Gi0k32IVg7cV8zTSrKK2oVTzUvx08chxYPhiNfagrQd8URm87Hv-rUe86W11MXlE3_khXCXmHbeuTF1k3jf_LFHt35z0m1xyj8B3A%26convTime%3D__CONV_TIME__%26event%3D__EVENT__%26sign%3D__SIGN__%26adx_req%3DA0167S1w12Ap8P50mCQj97oIEzUHtOzQZ3SGd7Rofzjc3BDhp_LjnpQMTQzIb6Cs_qJOiA9QY0bDHv9sArXbHAWKA","adDispatchJson":"{\"sourceType\":0,\"pkgName\":\"\",\"monitorConversionList\":[],\"adMaterial\":{\"picList\":[],\"videoList\":[]},\"creativeType\":1}","dynamicVideoData":null,"monitorType":null,"adid":"8825067562187480151","titleColor":"blue","requestId":"540982408980475905","exclusive":false,"scm":"","event":null,"alg":null,"song":null,"targetId":8825067562187480000,"showAdTag":true,"adSource":"1","showContext":"了解更多","targetType":3000,"typeTitle":"广告","url":"https://mz.tanzhouedu.com/?s=fd1a5e83114f71ba&maisuiCb=https%3A%2F%2Fad-effect.music.163.com%2Fad%2Feffect%3Fsource%3D__SOURCE__%26req%3DA01pWLrDgfC_goyTeLon15yqKgUVtXdECfCOWYnkA12cPbN3zKs9Gi0k32IVg7cV8zTSrKK2oVTzUvx08chxYPhiNfagrQd8URm87Hv-rUe86W11MXlE3_khXCXmHbeuTF1k3jf_LFHt35z0m1xyj8B3A%26convTime%3D__CONV_TIME__%26event%3D__EVENT__%26sign%3D__SIGN__%26adx_req%3DA0167S1w12Ap8P50mCQj97oIEzUHtOzQZ3SGd7Rofzjc3BDhp_LjnpQMTQzIb6Cs_qJOiA9QY0bDHv9sArXbHAWKA","encodeId":"8825067562187480151","extMonitorInfo":{"aliAdId":"","reqId":"adx_req=wNiXE0XRdDjAne1kwNOO1TIlDvR_nIOIC437kR4PCzMnzRKO4b7rsBOQDE9U4rm0Rp_hQI6y7WBSF1k_-7d1J32YYvaDEivLRYscDkzDhQdzmp-1oXkFDp3O0-w6uGhYxU2vV66sYKHfnLffx6yCMU4gi_ya0IW7aVW_2APqj8l47-a3Ddyy9_tYtfHuI7yNCEMNQny9MF_dJkEU4rT1wIPOc-6LlfF1XB1uX06wjEwtic_EfSQR9Q0HRXYakAq94f1DLIwd7brZD0bJ3-LGDKJLUkX7MbjDxTlK5Y4vxUyoXvTLEMhupbBX1hqYXoYOpWVipx5Fz5DcVMnGX444XdILPaQpRw45iuqbcXmBr-LwtFddu6LCWoF1XKtnhKuResxBNEBO4mjcWdATbdIyI7wm75lKrJUzNV46A5mN1ik3ySaj-0k2FlJe7-gTSqGC9TVWnRqd1Rv-S0cyWcnhTUBQFlFfOM3W--zSMBNT7f0=","requestid":"","orderId":"","ad_type":"","dspId":"1","price":"","refer":"","needClickPosInfo":false,"mode":"","scm":"","spm":"","displayMd5Sign":"","monitorType":"1"},"monitorClick":"","monitorImpressList":[],"monitorBlackList":null,"monitorClickList":[]},{"adLocation":null,"monitorImpress":null,"bannerId":"1609083553358732","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/6Hvbz205syTAwyRfRrYAuQ==/109951165573138725.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1336451.2122408102.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"数字单曲","url":"https://music.163.com/store/newalbum/detail?id=120876623","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609083166165762","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/iJ6dX79ID1yDld2GqJZ-3A==/109951165573116353.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1334452.2122375173.null","event":null,"alg":null,"song":{"name":"Alien","id":1806926198,"pst":0,"t":0,"ar":[{"id":12078093,"name":"Jerry.P(TSP)","tns":[],"alias":[]},{"id":1038099,"name":"VaVa毛衍七","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":3,"crbt":null,"cf":"","al":{"id":120859068,"name":"Hero mixtape","picUrl":"http://p4.music.126.net/-n3UQYRg-M6IYmGxpe9MFw==/109951165566414444.jpg","tns":[],"pic_str":"109951165566414444","pic":109951165566414450},"dt":204431,"h":{"br":320000,"fid":0,"size":8179505,"vd":-1866},"m":{"br":192000,"fid":0,"size":4907720,"vd":727},"l":{"br":128000,"fid":0,"size":3271828,"vd":2366},"a":null,"cd":"01","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":270336,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1418013,"mv":0,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":null}},"targetId":1806926198,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806926198","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609113890844796","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/H8M9mIJc4NfIOOXZ86hjgw==/109951165573590973.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1318440.2122348393.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"独家","url":"https://music.163.com/m/at/5f3e3df2fbd4b6cb97cb888d","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609081111018180","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/apgyMCGi9qSG5Ipf8R6BAw==/109951165573009058.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1322447.-624270121.null","event":null,"alg":null,"song":{"name":"奥秘","id":1501717293,"pst":0,"t":0,"ar":[{"id":28389406,"name":"段奥娟","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":8,"crbt":null,"cf":"","al":{"id":99324326,"name":"半熟·秘密","picUrl":"http://p4.music.126.net/ig1zE_ji1BSgmCqslWu08Q==/109951165529535306.jpg","tns":[],"pic_str":"109951165529535306","pic":109951165529535310},"dt":202142,"h":{"br":320002,"fid":0,"size":8088045,"vd":-52660},"m":{"br":192002,"fid":0,"size":4852845,"vd":-50163},"l":{"br":128002,"fid":0,"size":3235245,"vd":-48768},"a":null,"cd":"01","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1418072,"mv":0,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":null}},"targetId":1501717293,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1501717293","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609122648044254","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/Bwvy4ACQvCs_p6K6yeolsw==/109951165574765187.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"blue","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1319461.-624270863.null","event":null,"alg":null,"song":null,"targetId":0,"showAdTag":true,"adSource":null,"showContext":null,"targetType":3000,"typeTitle":"直播","url":"https://h5.iplay.163.com/st/column/home.html?id=1273201","encodeId":"0","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609142073940743","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/nhBmATCrtTwbM5PAlKLePw==/109951165580189871.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327446.2122284842.null","event":null,"alg":null,"song":{"name":"2020","id":1806966877,"pst":0,"t":0,"ar":[{"id":12270,"name":"面孔乐队","tns":[],"alias":[]}],"alia":[],"pop":5,"st":0,"rt":"","fee":8,"v":4,"crbt":null,"cf":"","al":{"id":120861791,"name":"2020","picUrl":"http://p4.music.126.net/QMLZtzBzok-XFfyEsGXVGg==/109951165572037725.jpg","tns":[],"pic_str":"109951165572037725","pic":109951165572037730},"dt":418248,"h":{"br":320000,"fid":0,"size":16731885,"vd":-54865},"m":{"br":192000,"fid":0,"size":10039149,"vd":-52309},"l":{"br":128000,"fid":0,"size":6692781,"vd":-50742},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mark":8192,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":1416873,"mv":14217560,"publishTime":1609084800000,"videoInfo":{"moreThanOne":false,"video":{"vid":"14217560","type":0,"title":"2020","playTime":12395,"coverUrl":"http://p3.music.126.net/cFUwhXdfakm1POe5K_gCwg==/109951165571781314.jpg","publishTime":1609084800007,"artists":null,"alias":null}}},"targetId":1806966877,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806966877","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609084328812538","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/4MpdkprJNVveDoeuhdqSow==/109951165573180646.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327444.-624276754.null","event":null,"alg":null,"song":{"name":"圣尼古拉斯的雪天","id":1806476169,"pst":0,"t":0,"ar":[{"id":12798217,"name":"刘思鉴","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":3,"crbt":null,"cf":"","al":{"id":120277658,"name":"圣尼古拉斯的雪天","picUrl":"http://p4.music.126.net/WfXBQ4v8cLAxN722UvDUIw==/109951165560718212.jpg","tns":[],"pic_str":"109951165560718212","pic":109951165560718200},"dt":138616,"h":{"br":320000,"fid":0,"size":5546925,"vd":-52022},"m":{"br":192000,"fid":0,"size":3328173,"vd":-49408},"l":{"br":128000,"fid":0,"size":2218797,"vd":-47680},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"originCoverType":0,"originSongSimpleData":null,"single":0,"noCopyrightRcmd":null,"mst":9,"rtype":0,"rurl":null,"cp":0,"mv":14216140,"publishTime":1608739200000,"videoInfo":{"moreThanOne":false,"video":{"vid":"14216140","type":0,"title":"圣尼古拉斯的雪天","playTime":18604,"coverUrl":"http://p4.music.126.net/WJNN8kJReGIdnfUu1IT7CQ==/109951165566487947.jpg","publishTime":1608825600007,"artists":null,"alias":null}}},"targetId":1806476169,"showAdTag":true,"adSource":null,"showContext":null,"targetType":1,"typeTitle":"独家","url":null,"encodeId":"1806476169","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null},{"adLocation":null,"monitorImpress":null,"bannerId":"1609084396208545","extMonitor":null,"pid":null,"pic":"http://p1.music.126.net/SryMoOGgyEE002fLoANAmA==/109951165573187113.jpg","program":null,"video":null,"adurlV2":null,"adDispatchJson":null,"dynamicVideoData":null,"monitorType":null,"adid":null,"titleColor":"red","requestId":"","exclusive":false,"scm":"1.music-homepage.homepage_banner_force.banner.1327445.2122286946.null","event":null,"alg":null,"song":null,"targetId":120618796,"showAdTag":true,"adSource":null,"showContext":null,"targetType":10,"typeTitle":"独家","url":null,"encodeId":"120618796","extMonitorInfo":null,"monitorClick":null,"monitorImpressList":null,"monitorBlackList":null,"monitorClickList":null}]}
         * canClose : false
         * action : orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD
         * actionType : orpheus
         * uiElement : {"subTitle":{"title":"推荐歌单"},"button":{"action":"orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","text":"更多","iconUrl":null}}
         * creatives : [{"creativeType":"list","creativeId":"5309469822","action":"orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]},"resources":[{"uiElement":{"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]},"resourceType":"list","resourceId":"5309469822","resourceUrl":null,"resourceExtInfo":{"playCount":2289120,"highQuality":false},"action":"orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"featured","logInfo":null}],"alg":"featured","position":0},{"creativeType":"list","creativeId":"2248764279","action":"orpheus://playlist/2248764279?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"【高燃】剪辑踩点爆燃高能"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/iMAHsxQ6zuWo5NT74flYBA==/109951163932798337.jpg"},"labelTexts":["学习"]},"resources":[{"uiElement":{"mainTitle":{"title":"【高燃】剪辑踩点爆燃高能"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/iMAHsxQ6zuWo5NT74flYBA==/109951163932798337.jpg"},"labelTexts":["学习"]},"resourceType":"list","resourceId":"2248764279","resourceUrl":null,"resourceExtInfo":{"playCount":6742857,"highQuality":false},"action":"orpheus://playlist/2248764279?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"itembased","logInfo":null}],"alg":"itembased","position":0},{"creativeType":"list","creativeId":"635903110","action":"orpheus://playlist/635903110?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"一个天蝎座的听歌列表"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/jdE6eU2UFtobe5Kr1mSvCg==/109951163088559334.jpg"},"labelTexts":["华语","说唱","浪漫"]},"resources":[{"uiElement":{"mainTitle":{"title":"一个天蝎座的听歌列表"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/jdE6eU2UFtobe5Kr1mSvCg==/109951163088559334.jpg"},"labelTexts":["华语","说唱","浪漫"]},"resourceType":"list","resourceId":"635903110","resourceUrl":null,"resourceExtInfo":{"playCount":64208188,"highQuality":false},"action":"orpheus://playlist/635903110?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2382819181","action":"orpheus://playlist/2382819181?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"本人写作业学习歌单"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/u4OlLiqZyLpgUoL7sQbMSg==/109951163794555147.jpg"},"labelTexts":["流行","学习","翻唱"]},"resources":[{"uiElement":{"mainTitle":{"title":"本人写作业学习歌单"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/u4OlLiqZyLpgUoL7sQbMSg==/109951163794555147.jpg"},"labelTexts":["流行","学习","翻唱"]},"resourceType":"list","resourceId":"2382819181","resourceUrl":null,"resourceExtInfo":{"playCount":128587400,"highQuality":false},"action":"orpheus://playlist/2382819181?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2385384236","action":"orpheus://playlist/2385384236?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"失恋必听歌单 | 因为你突然听懂了很多歌"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/8BvBZSaI3SgEbRMVuQlKjQ==/109951163513812808.jpg"},"labelTexts":["思念","伤感","华语"]},"resources":[{"uiElement":{"mainTitle":{"title":"失恋必听歌单 | 因为你突然听懂了很多歌"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/8BvBZSaI3SgEbRMVuQlKjQ==/109951163513812808.jpg"},"labelTexts":["思念","伤感","华语"]},"resourceType":"list","resourceId":"2385384236","resourceUrl":null,"resourceExtInfo":{"playCount":139551760,"highQuality":false},"action":"orpheus://playlist/2385384236?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"bysong_rt","logInfo":null}],"alg":"bysong_rt","position":0},{"creativeType":"list","creativeId":"2732710018","action":"orpheus://playlist/2732710018?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","uiElement":{"mainTitle":{"title":"经典粤语合集【无损音质】黑胶会员专属"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/UBFfYqjvwr5_faX8MIT_JA==/109951165516763165.jpg"},"labelTexts":["粤语","怀旧","经典"]},"resources":[{"uiElement":{"mainTitle":{"title":"经典粤语合集【无损音质】黑胶会员专属"},"subTitle":{},"image":{"imageUrl":"http://p1.music.126.net/UBFfYqjvwr5_faX8MIT_JA==/109951165516763165.jpg"},"labelTexts":["粤语","怀旧","经典"]},"resourceType":"list","resourceId":"2732710018","resourceUrl":null,"resourceExtInfo":{"playCount":1198453,"highQuality":false},"action":"orpheus://playlist/2732710018?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"itembased","logInfo":null}],"alg":"itembased","position":0}]
         */

        private String blockCode;
        private String showType;
        private ExtInfoBean extInfo;
        private boolean canClose;
        private String action;
        private String actionType;
        private UiElementBean uiElement;
        private List<CreativesBean> creatives;

        public String getBlockCode() {
            return blockCode;
        }

        public void setBlockCode(String blockCode) {
            this.blockCode = blockCode;
        }

        public String getShowType() {
            return showType;
        }

        public void setShowType(String showType) {
            this.showType = showType;
        }

        public ExtInfoBean getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(ExtInfoBean extInfo) {
            this.extInfo = extInfo;
        }

        public boolean isCanClose() {
            return canClose;
        }

        public void setCanClose(boolean canClose) {
            this.canClose = canClose;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getActionType() {
            return actionType;
        }

        public void setActionType(String actionType) {
            this.actionType = actionType;
        }

        public UiElementBean getUiElement() {
            return uiElement;
        }

        public void setUiElement(UiElementBean uiElement) {
            this.uiElement = uiElement;
        }

        public List<CreativesBean> getCreatives() {
            return creatives;
        }

        public void setCreatives(List<CreativesBean> creatives) {
            this.creatives = creatives;
        }

        public static class ExtInfoBean {
            private List<BannersBean> banners;

            public List<BannersBean> getBanners() {
                return banners;
            }

            public void setBanners(List<BannersBean> banners) {
                this.banners = banners;
            }

            public static class BannersBean {
                /**
                 * adLocation : null
                 * monitorImpress : null
                 * bannerId : 1609082955846932
                 * extMonitor : null
                 * pid : null
                 * pic : http://p1.music.126.net/Ji5IEpb3qLoJ3ClvaAoJmg==/109951165573103381.jpg
                 * program : null
                 * video : null
                 * adurlV2 : null
                 * adDispatchJson : null
                 * dynamicVideoData : {"maxVideoPlayCount":3,"resourceId":"6ad13fdfb1f547e88da2fd43c449904b","videoUrl":"http://vodkgeyttp8.vod.126.net/cloudmusic/obj/w5vDksKTw6vClDrDicKx/5468727945/1759/dffe/68b9/026460d62e315dbb98de9a717ce06afa.mp4?wsSecret=6fbd5983472fd8701a5d090cfa0fb678&wsTime=1609153835","urlExpireTimeInMills":1609153835935}
                 * monitorType : null
                 * adid : null
                 * titleColor : blue
                 * requestId :
                 * exclusive : false
                 * scm : 1.music-homepage.homepage_banner_force.banner.1339439.2122290791.null
                 * event : null
                 * alg : null
                 * song : null
                 * targetId : 0
                 * showAdTag : true
                 * adSource : null
                 * showContext : null
                 * targetType : 3000
                 * typeTitle : 独家策划
                 * url : https://st.music.163.com/c/year2020/index.html?refer=banner&full_screen=true
                 * encodeId : 0
                 * extMonitorInfo : null
                 * monitorClick : null
                 * monitorImpressList : null
                 * monitorBlackList : null
                 * monitorClickList : null
                 */

                private Object adLocation;
                private Object monitorImpress;
                private String bannerId;
                private Object extMonitor;
                private Object pid;
                private String pic;
                private Object program;
                private Object video;
                private Object adurlV2;
                private Object adDispatchJson;
                private DynamicVideoDataBean dynamicVideoData;
                private Object monitorType;
                private Object adid;
                private String titleColor;
                private String requestId;
                private boolean exclusive;
                private String scm;
                private Object event;
                private Object alg;
                private Object song;
                private int targetId;
                private boolean showAdTag;
                private Object adSource;
                private Object showContext;
                private int targetType;
                private String typeTitle;
                private String url;
                private String encodeId;
                private Object extMonitorInfo;
                private Object monitorClick;
                private Object monitorImpressList;
                private Object monitorBlackList;
                private Object monitorClickList;

                public Object getAdLocation() {
                    return adLocation;
                }

                public void setAdLocation(Object adLocation) {
                    this.adLocation = adLocation;
                }

                public Object getMonitorImpress() {
                    return monitorImpress;
                }

                public void setMonitorImpress(Object monitorImpress) {
                    this.monitorImpress = monitorImpress;
                }

                public String getBannerId() {
                    return bannerId;
                }

                public void setBannerId(String bannerId) {
                    this.bannerId = bannerId;
                }

                public Object getExtMonitor() {
                    return extMonitor;
                }

                public void setExtMonitor(Object extMonitor) {
                    this.extMonitor = extMonitor;
                }

                public Object getPid() {
                    return pid;
                }

                public void setPid(Object pid) {
                    this.pid = pid;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public Object getProgram() {
                    return program;
                }

                public void setProgram(Object program) {
                    this.program = program;
                }

                public Object getVideo() {
                    return video;
                }

                public void setVideo(Object video) {
                    this.video = video;
                }

                public Object getAdurlV2() {
                    return adurlV2;
                }

                public void setAdurlV2(Object adurlV2) {
                    this.adurlV2 = adurlV2;
                }

                public Object getAdDispatchJson() {
                    return adDispatchJson;
                }

                public void setAdDispatchJson(Object adDispatchJson) {
                    this.adDispatchJson = adDispatchJson;
                }

                public DynamicVideoDataBean getDynamicVideoData() {
                    return dynamicVideoData;
                }

                public void setDynamicVideoData(DynamicVideoDataBean dynamicVideoData) {
                    this.dynamicVideoData = dynamicVideoData;
                }

                public Object getMonitorType() {
                    return monitorType;
                }

                public void setMonitorType(Object monitorType) {
                    this.monitorType = monitorType;
                }

                public Object getAdid() {
                    return adid;
                }

                public void setAdid(Object adid) {
                    this.adid = adid;
                }

                public String getTitleColor() {
                    return titleColor;
                }

                public void setTitleColor(String titleColor) {
                    this.titleColor = titleColor;
                }

                public String getRequestId() {
                    return requestId;
                }

                public void setRequestId(String requestId) {
                    this.requestId = requestId;
                }

                public boolean isExclusive() {
                    return exclusive;
                }

                public void setExclusive(boolean exclusive) {
                    this.exclusive = exclusive;
                }

                public String getScm() {
                    return scm;
                }

                public void setScm(String scm) {
                    this.scm = scm;
                }

                public Object getEvent() {
                    return event;
                }

                public void setEvent(Object event) {
                    this.event = event;
                }

                public Object getAlg() {
                    return alg;
                }

                public void setAlg(Object alg) {
                    this.alg = alg;
                }

                public Object getSong() {
                    return song;
                }

                public void setSong(Object song) {
                    this.song = song;
                }

                public int getTargetId() {
                    return targetId;
                }

                public void setTargetId(int targetId) {
                    this.targetId = targetId;
                }

                public boolean isShowAdTag() {
                    return showAdTag;
                }

                public void setShowAdTag(boolean showAdTag) {
                    this.showAdTag = showAdTag;
                }

                public Object getAdSource() {
                    return adSource;
                }

                public void setAdSource(Object adSource) {
                    this.adSource = adSource;
                }

                public Object getShowContext() {
                    return showContext;
                }

                public void setShowContext(Object showContext) {
                    this.showContext = showContext;
                }

                public int getTargetType() {
                    return targetType;
                }

                public void setTargetType(int targetType) {
                    this.targetType = targetType;
                }

                public String getTypeTitle() {
                    return typeTitle;
                }

                public void setTypeTitle(String typeTitle) {
                    this.typeTitle = typeTitle;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getEncodeId() {
                    return encodeId;
                }

                public void setEncodeId(String encodeId) {
                    this.encodeId = encodeId;
                }

                public Object getExtMonitorInfo() {
                    return extMonitorInfo;
                }

                public void setExtMonitorInfo(Object extMonitorInfo) {
                    this.extMonitorInfo = extMonitorInfo;
                }

                public Object getMonitorClick() {
                    return monitorClick;
                }

                public void setMonitorClick(Object monitorClick) {
                    this.monitorClick = monitorClick;
                }

                public Object getMonitorImpressList() {
                    return monitorImpressList;
                }

                public void setMonitorImpressList(Object monitorImpressList) {
                    this.monitorImpressList = monitorImpressList;
                }

                public Object getMonitorBlackList() {
                    return monitorBlackList;
                }

                public void setMonitorBlackList(Object monitorBlackList) {
                    this.monitorBlackList = monitorBlackList;
                }

                public Object getMonitorClickList() {
                    return monitorClickList;
                }

                public void setMonitorClickList(Object monitorClickList) {
                    this.monitorClickList = monitorClickList;
                }

                public static class DynamicVideoDataBean {
                    /**
                     * maxVideoPlayCount : 3
                     * resourceId : 6ad13fdfb1f547e88da2fd43c449904b
                     * videoUrl : http://vodkgeyttp8.vod.126.net/cloudmusic/obj/w5vDksKTw6vClDrDicKx/5468727945/1759/dffe/68b9/026460d62e315dbb98de9a717ce06afa.mp4?wsSecret=6fbd5983472fd8701a5d090cfa0fb678&wsTime=1609153835
                     * urlExpireTimeInMills : 1609153835935
                     */

                    private int maxVideoPlayCount;
                    private String resourceId;
                    private String videoUrl;
                    private long urlExpireTimeInMills;

                    public int getMaxVideoPlayCount() {
                        return maxVideoPlayCount;
                    }

                    public void setMaxVideoPlayCount(int maxVideoPlayCount) {
                        this.maxVideoPlayCount = maxVideoPlayCount;
                    }

                    public String getResourceId() {
                        return resourceId;
                    }

                    public void setResourceId(String resourceId) {
                        this.resourceId = resourceId;
                    }

                    public String getVideoUrl() {
                        return videoUrl;
                    }

                    public void setVideoUrl(String videoUrl) {
                        this.videoUrl = videoUrl;
                    }

                    public long getUrlExpireTimeInMills() {
                        return urlExpireTimeInMills;
                    }

                    public void setUrlExpireTimeInMills(long urlExpireTimeInMills) {
                        this.urlExpireTimeInMills = urlExpireTimeInMills;
                    }
                }
            }
        }

        public static class UiElementBean {
            /**
             * subTitle : {"title":"推荐歌单"}
             * button : {"action":"orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","text":"更多","iconUrl":null}
             */

            private SubTitleBean subTitle;
            private ButtonBean button;

            public SubTitleBean getSubTitle() {
                return subTitle;
            }

            public void setSubTitle(SubTitleBean subTitle) {
                this.subTitle = subTitle;
            }

            public ButtonBean getButton() {
                return button;
            }

            public void setButton(ButtonBean button) {
                this.button = button;
            }

            public static class SubTitleBean {
                /**
                 * title : 推荐歌单
                 */

                private String title;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class ButtonBean {
                /**
                 * action : orpheus://playlistCollection?referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD
                 * actionType : orpheus
                 * text : 更多
                 * iconUrl : null
                 */

                private String action;
                private String actionType;
                private String text;
                private Object iconUrl;

                public String getAction() {
                    return action;
                }

                public void setAction(String action) {
                    this.action = action;
                }

                public String getActionType() {
                    return actionType;
                }

                public void setActionType(String actionType) {
                    this.actionType = actionType;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public Object getIconUrl() {
                    return iconUrl;
                }

                public void setIconUrl(Object iconUrl) {
                    this.iconUrl = iconUrl;
                }
            }
        }

        public static class CreativesBean {
            /**
             * creativeType : list
             * creativeId : 5309469822
             * action : orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD
             * actionType : orpheus
             * uiElement : {"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]}
             * resources : [{"uiElement":{"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]},"resourceType":"list","resourceId":"5309469822","resourceUrl":null,"resourceExtInfo":{"playCount":2289120,"highQuality":false},"action":"orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD","actionType":"orpheus","valid":true,"alg":"featured","logInfo":null}]
             * alg : featured
             * position : 0
             */

            private String creativeType;
            private String creativeId;
            private String action;
            private String actionType;
            private UiElementBeanX uiElement;
            private String alg;
            private int position;
            private List<ResourcesBean> resources;

            public String getCreativeType() {
                return creativeType;
            }

            public void setCreativeType(String creativeType) {
                this.creativeType = creativeType;
            }

            public String getCreativeId() {
                return creativeId;
            }

            public void setCreativeId(String creativeId) {
                this.creativeId = creativeId;
            }

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            public String getActionType() {
                return actionType;
            }

            public void setActionType(String actionType) {
                this.actionType = actionType;
            }

            public UiElementBeanX getUiElement() {
                return uiElement;
            }

            public void setUiElement(UiElementBeanX uiElement) {
                this.uiElement = uiElement;
            }

            public String getAlg() {
                return alg;
            }

            public void setAlg(String alg) {
                this.alg = alg;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public List<ResourcesBean> getResources() {
                return resources;
            }

            public void setResources(List<ResourcesBean> resources) {
                this.resources = resources;
            }

            public static class UiElementBeanX {
                /**
                 * mainTitle : {"title":"岁末愉快 | 用一首歌和旧日认真告别"}
                 * image : {"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"}
                 * labelTexts : ["流行","放松"]
                 */

                private MainTitleBean mainTitle;
                private ImageBean image;
                private List<String> labelTexts;

                public MainTitleBean getMainTitle() {
                    return mainTitle;
                }

                public void setMainTitle(MainTitleBean mainTitle) {
                    this.mainTitle = mainTitle;
                }

                public ImageBean getImage() {
                    return image;
                }

                public void setImage(ImageBean image) {
                    this.image = image;
                }

                public List<String> getLabelTexts() {
                    return labelTexts;
                }

                public void setLabelTexts(List<String> labelTexts) {
                    this.labelTexts = labelTexts;
                }

                public static class MainTitleBean {
                    /**
                     * title : 岁末愉快 | 用一首歌和旧日认真告别
                     */

                    private String title;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }
                }

                public static class ImageBean {
                    /**
                     * imageUrl : http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg
                     */

                    private String imageUrl;

                    public String getImageUrl() {
                        return imageUrl;
                    }

                    public void setImageUrl(String imageUrl) {
                        this.imageUrl = imageUrl;
                    }
                }
            }

            public static class ResourcesBean {
                /**
                 * uiElement : {"mainTitle":{"title":"岁末愉快 | 用一首歌和旧日认真告别"},"image":{"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"},"labelTexts":["流行","放松"]}
                 * resourceType : list
                 * resourceId : 5309469822
                 * resourceUrl : null
                 * resourceExtInfo : {"playCount":2289120,"highQuality":false}
                 * action : orpheus://playlist/5309469822?autoplay=0&referLog=HOMEPAGE_BLOCK_PLAYLIST_RCMD
                 * actionType : orpheus
                 * valid : true
                 * alg : featured
                 * logInfo : null
                 */

                private UiElementBeanXX uiElement;
                private String resourceType;
                private String resourceId;
                private Object resourceUrl;
                private ResourceExtInfoBean resourceExtInfo;
                private String action;
                private String actionType;
                private boolean valid;
                private String alg;
                private Object logInfo;

                public UiElementBeanXX getUiElement() {
                    return uiElement;
                }

                public void setUiElement(UiElementBeanXX uiElement) {
                    this.uiElement = uiElement;
                }

                public String getResourceType() {
                    return resourceType;
                }

                public void setResourceType(String resourceType) {
                    this.resourceType = resourceType;
                }

                public String getResourceId() {
                    return resourceId;
                }

                public void setResourceId(String resourceId) {
                    this.resourceId = resourceId;
                }

                public Object getResourceUrl() {
                    return resourceUrl;
                }

                public void setResourceUrl(Object resourceUrl) {
                    this.resourceUrl = resourceUrl;
                }

                public ResourceExtInfoBean getResourceExtInfo() {
                    return resourceExtInfo;
                }

                public void setResourceExtInfo(ResourceExtInfoBean resourceExtInfo) {
                    this.resourceExtInfo = resourceExtInfo;
                }

                public String getAction() {
                    return action;
                }

                public void setAction(String action) {
                    this.action = action;
                }

                public String getActionType() {
                    return actionType;
                }

                public void setActionType(String actionType) {
                    this.actionType = actionType;
                }

                public boolean isValid() {
                    return valid;
                }

                public void setValid(boolean valid) {
                    this.valid = valid;
                }

                public String getAlg() {
                    return alg;
                }

                public void setAlg(String alg) {
                    this.alg = alg;
                }

                public Object getLogInfo() {
                    return logInfo;
                }

                public void setLogInfo(Object logInfo) {
                    this.logInfo = logInfo;
                }

                public static class UiElementBeanXX {
                    /**
                     * mainTitle : {"title":"岁末愉快 | 用一首歌和旧日认真告别"}
                     * image : {"imageUrl":"http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg"}
                     * labelTexts : ["流行","放松"]
                     */

                    private MainTitleBeanX mainTitle;
                    private ImageBeanX image;
                    private List<String> labelTexts;

                    public MainTitleBeanX getMainTitle() {
                        return mainTitle;
                    }

                    public void setMainTitle(MainTitleBeanX mainTitle) {
                        this.mainTitle = mainTitle;
                    }

                    public ImageBeanX getImage() {
                        return image;
                    }

                    public void setImage(ImageBeanX image) {
                        this.image = image;
                    }

                    public List<String> getLabelTexts() {
                        return labelTexts;
                    }

                    public void setLabelTexts(List<String> labelTexts) {
                        this.labelTexts = labelTexts;
                    }

                    public static class MainTitleBeanX {
                        /**
                         * title : 岁末愉快 | 用一首歌和旧日认真告别
                         */

                        private String title;

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }
                    }

                    public static class ImageBeanX {
                        /**
                         * imageUrl : http://p1.music.126.net/hyBYAQp4YBkkz4qOPAFYVg==/109951165566910180.jpg
                         */

                        private String imageUrl;

                        public String getImageUrl() {
                            return imageUrl;
                        }

                        public void setImageUrl(String imageUrl) {
                            this.imageUrl = imageUrl;
                        }
                    }
                }

                public static class ResourceExtInfoBean {
                    /**
                     * playCount : 2289120
                     * highQuality : false
                     */

                    private float playCount;
                    private boolean highQuality;

                    public float getPlayCount() {
                        return playCount;
                    }

                    public void setPlayCount(int playCount) {
                        this.playCount = playCount;
                    }

                    public boolean isHighQuality() {
                        return highQuality;
                    }

                    public void setHighQuality(boolean highQuality) {
                        this.highQuality = highQuality;
                    }
                }
            }
        }
    }
}
