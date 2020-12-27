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

import com.cloud.music.find.mvp.model.api.Api;
import com.cloud.music.find.mvp.model.entity.BaseResponse;

import java.util.List;

import io.reactivex.Observable;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import static me.jessyan.retrofiturlmanager.RetrofitUrlManager.DOMAIN_NAME_HEADER;

/**
 * ================================================
 * 展示 {@link Retrofit#create(Class)} 中需要传入的 ApiService 的使用方式
 * 存放关于 gank 的一些 API
 * <p>
 * Created by JessYan on 08/05/2016 12:05
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface FindService {
    /**
     * 妹纸列表
     */
//    @Headers({DOMAIN_NAME_HEADER + Api.GANK_DOMAIN_NAME})
//    @GET("data/category/Girl/type/Girl/page/{page}/count/{count}")
//    Observable<BaseResponse<List<GankItemBean>>> getGirlList(@Path("count") int count, @Path("page") int page);

}
