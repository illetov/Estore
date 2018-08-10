/*
 * Created by Andey Yaroshenko on 8/1/18 11:33 AM
 * inittey@gmail.com
 *
 * Last modifed file: $file.LastModifed
 *
 */

package com.initt.android.estore.cache

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Environment
import com.facebook.cache.disk.DiskCacheConfig
import com.facebook.common.internal.Supplier
import com.facebook.common.util.ByteConstants
import com.facebook.imagepipeline.cache.MemoryCacheParams
import com.facebook.imagepipeline.core.ImagePipelineConfig
import java.io.File

object ImagePipelineConfigFactoryKotlin {
//    val IMAGE_PIPELINE_CACHE_DIR: String = "imagepipeline_cache"
//    lateinit var sImagePipelineConfig: ImagePipelineConfig
//
//    val MAX_HEAP_SIZE = Runtime.getRuntime().maxMemory().toInt()
//
//    val MAX_DISK_CACHE_SIZE = 300 * ByteConstants.MB
//    val MAX_MEMORY_CACHE_SIZE = MAX_HEAP_SIZE / 3
//
//
//    fun getImagePipelineConfig(context: Context): ImagePipelineConfig? {
//        if (sImagePipelineConfig == null) {
//            val configBuilder: ImagePipelineConfig.Builder = ImagePipelineConfig.newBuilder(context)
//            configureCaches(configBuilder, context)
//
//            sImagePipelineConfig = configBuilder.build()
//        }
//        return sImagePipelineConfig;
//    }
//
//    private fun configureCaches(configBuilder: ImagePipelineConfig.Builder, context: Context) {
//
//        val bitmapCacheParams: MemoryCacheParams = MemoryCacheParams(
//                MAX_MEMORY_CACHE_SIZE,
//                Int.MAX_VALUE,
//                MAX_MEMORY_CACHE_SIZE,
//                Int.MAX_VALUE,
//                Int.MAX_VALUE
//        );
//        configBuilder.setBitmapMemoryCacheParamsSupplier(Supplier { return@Supplier bitmapCacheParams })
//                .setMainDiskCacheConfig(DiskCacheConfig.newBuilder(context)
//                        .setBaseDirectoryPath(getExternalCacheDir(context))
//                        .setBaseDirectoryName(IMAGE_PIPELINE_CACHE_DIR)
//                        .setMaxCacheSize(MAX_DISK_CACHE_SIZE.toLong())
//                        .build())
//
//
//    }
//
//    private fun getExternalCacheDir(context: Context): File? {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) return context.externalCacheDir
//
//        val cacheDir = "Android/data/${context.packageName}/cache/"
//        return createFile(Environment.getExternalStorageDirectory().path + cacheDir, "")
//    }
//
//    private fun createFile(folderPath: String, fileName: String): File? {
//        val destdir = File(folderPath)
//
//        if (!destdir.exists()) destdir.mkdirs()
//
//        return File(folderPath, fileName)
//    }
}