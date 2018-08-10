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

public interface OnGestureListener {

    public void onDrag(float dx, float dy);

    public void onFling(float startX, float startY, float velocityX,
                        float velocityY);

    public void onScale(float scaleFactor, float focusX, float focusY);

}