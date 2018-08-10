/*
 * Created by Andey Yaroshenko on 8/1/18 12:34 AM
 * inittey@gmail.com
 *
 * Copyright (c) 2018. All right reserved
 *
 * Last modifed file: $file.LatModifed
 *
 */

package com.initt.android.estore.startup

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.initt.android.estore.cache.ImagePipelineConfigFactory
import com.initt.android.estore.cache.ImagePipelineConfigFactoryKotlin

class EStoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this, ImagePipelineConfigFactory.getImagePipelineConfig(this))
    }
}