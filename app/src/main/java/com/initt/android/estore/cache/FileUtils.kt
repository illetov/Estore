/*
 * Created by Andey Yaroshenko on 8/1/18 12:28 AM
 * inittey@gmail.com
 *
 * Copyright (c) 2018. All right reserved
 *
 * Last modifed file: $file.LatModifed
 *
 */

package com.initt.android.estore.cache

import java.io.InputStream
import java.io.OutputStream

object FileUtils {
    fun copyStream(inputStream: InputStream, outputStream: OutputStream) {
        val bufferSize = 1024
        try {
            val bytes = ByteArray(bufferSize)
            while (true) {
                val count = inputStream.read(bytes, 0, bufferSize)
                if (count == -1)
                    break
                outputStream.write(bytes, 0, count)
            }
        } catch (e: Exception) {

        }

    }
}