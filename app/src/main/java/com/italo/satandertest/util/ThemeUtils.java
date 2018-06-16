package com.italo.satandertest.util;

import android.graphics.Color;
import android.support.v4.widget.SwipeRefreshLayout;

public class ThemeUtils {

    public static void changeColorProgressSwipeRefresh(SwipeRefreshLayout swipeRefreshLayout) {
        //BaseColor
        int color = Color.parseColor("#EA0404");
        swipeRefreshLayout.setColorSchemeColors(color);
    }
}
