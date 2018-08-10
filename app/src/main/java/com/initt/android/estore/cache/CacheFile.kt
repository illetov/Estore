package com.initt.android.estore.cache

import android.content.Context
import java.io.File

class CacheFile(context: Context) {
    private lateinit var cacheDir: File

    init {
        if (android.os.Environment.getExternalStorageDirectory().equals(android.os.Environment.MEDIA_MOUNTED)) {
            cacheDir = File(android.os.Environment.getExternalStorageDirectory(), "estorage_cache")
        } else {
            cacheDir = context.cacheDir
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs()
        }
    }

    fun getCacheDir() = cacheDir

    fun getFile(fileName: String): File? {
        val fileHash = fileName.hashCode().toString()
        val file = File(cacheDir, fileHash)

        return if (file.exists()) file else null
    }

    fun clearCache() {
        val files = cacheDir.listFiles() ?: return

        for (f in files) {
            f.delete()
        }
    }
}