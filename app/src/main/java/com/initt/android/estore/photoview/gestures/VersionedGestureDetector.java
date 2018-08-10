/*
 * Created by Andey Yaroshenko on 7/31/18 6:18 PM
 * inittey@gmail.com
 *
 * Copyright (c) 2018. All right reserved
 *
 * Last modifed file: $file.LatModifed
 *
 */

package com.initt.android.estore.photoview.gestures;

import android.content.Context;
import android.os.Build;

public final class VersionedGestureDetector {

    public static GestureDetector newInstance(Context context,
                                              OnGestureListener listener) {
        final int sdkVersion = Build.VERSION.SDK_INT;
        GestureDetector detector;

        if (sdkVersion < Build.VERSION_CODES.ECLAIR) {
            detector = new CupcakeGestureDetector(context);
        } else if (sdkVersion < Build.VERSION_CODES.FROYO) {
            detector = new EclairGestureDetector(context);
        } else {
            detector = new FroyoGestureDetector(context);
        }

        detector.setOnGestureListener(listener);

        return detector;
    }

}