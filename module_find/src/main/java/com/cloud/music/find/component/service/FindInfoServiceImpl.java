/*
 * Copyright 2018 JessYan
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
package com.cloud.music.find.component.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cloud.music.commonservice.find.service.FindInfoService;
import com.jess.arms.utils.ArmsUtils;

import com.cloud.music.commonsdk.core.RouterHub;
import com.cloud.music.commonservice.find.bean.FindInfo;
import com.cloud.music.find.R;

/**
 * ================================================
 * 向外提供服务的接口实现类, 在此类中实现一些具有特定功能的方法提供给外部, 即可让一个组件与其他组件或宿主进行交互
 *
 * @see <a href="https://github.com/JessYanCoding/ArmsComponent/wiki#2.2.3.2">CommonService wiki 官方文档</a>
 * Created by JessYan on 2018/4/27 14:27
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
@Route(path = RouterHub.FIND_SERVICE_FINDINFOSERVICE, name = "发现信息服务")
public class FindInfoServiceImpl implements FindInfoService {
    private Context mContext;

    @Override
    public FindInfo getInfo() {
        return new FindInfo(ArmsUtils.getString(mContext, R.string.public_name_gank));
    }

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
