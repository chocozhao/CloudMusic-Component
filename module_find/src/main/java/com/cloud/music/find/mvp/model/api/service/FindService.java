/*
 * Copyright 2017 JessYan
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
package com.cloud.music.find.mvp.model.api.service;

import com.cloud.music.commonsdk.http.entity.BaseResponse;
import com.cloud.music.find.mvp.model.entity.GetFindInfo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * ================================================
 * 展示 {@link Retrofit#create(Class)} 中需要传入的 ApiService 的使用方式
 * 存放关于 gank 的一些 API
 * <p>
 * Created by JessYan on 08/05/2016 12:05
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 *  * 请求不一样的接口  可以在AppLifecyclesImpl中通过
 *  * RetrofitUrlManager.getInstance().putDomain(Api.FIND_DOMAIN_NAME, Api.FIND_DOMAIN);
 *  * 配置
 *  *
 *  * 在请求头添加      @Headers({FIND_DOMAIN_NAME + Api.FIND_DOMAIN})
 *  * 比如：
 *  * @Headers({FIND_DOMAIN_NAME + Api.FIND_DOMAIN})
 *  * @GET("data/category/Girl/type/Girl/page/{page}/count/{count}")
 *  * Observable<BasePageResponse<List<GankItemBean>>> getGirlList(@Path("count") int count, @Path("page") int page);
 */
public interface FindService {

    /**
     * 发现页信息
     * @return
     */
    @GET("/homepage/block/page")
    Observable<BaseResponse<GetFindInfo>> getFindData();






}
