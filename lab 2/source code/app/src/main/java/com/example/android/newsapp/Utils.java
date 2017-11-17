package com.example.android.newsapp;

import android.view.View;
import android.view.ViewPropertyAnimator;

/**
 * Created by ata6fd on 17-11-2017.
 */

class Utils {

    public final static int DEFAULT_DELAY = 0;

    public static ViewPropertyAnimator showViewByScale(View v) {

        ViewPropertyAnimator propertyAnimator = v.animate().setStartDelay(DEFAULT_DELAY)
                .scaleX(1).scaleY(1);

        return propertyAnimator;
    }

}
