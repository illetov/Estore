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

import android.view.MotionEvent;

public interface GestureDetector {

    public boolean onTouchEvent(MotionEvent ev);

    public boolean isScaling();

    public boolean isDragging();

    public void setOnGestureListener(OnGestureListener listener);

}
