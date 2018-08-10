/*
 * Created by Andey Yaroshenko on 7/31/18 6:18 PM
 * inittey@gmail.com
 *
 * Copyright (c) 2018. All right reserved
 *
 * Last modifed file: $file.LatModifed
 *
 */

package com.initt.android.estore.miscellaneous;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/**
 * Created by 06peng on 15/6/26.
 */
public class CustomProgressbarDrawable extends Drawable {

    private ImageDownloadListener mListener;

    public CustomProgressbarDrawable(ImageDownloadListener listener) {
        mListener = listener;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter cf) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    protected boolean onLevelChange(int level) {
        int progress = (int) ((level / 10000.0) * 100);
        if (mListener != null) {
            mListener.onUpdate(progress);
        }
        return super.onLevelChange(level);
    }
}
