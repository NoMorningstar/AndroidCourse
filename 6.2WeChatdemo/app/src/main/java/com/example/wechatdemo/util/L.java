package com.example.wechatdemo.util;

import android.util.Log;

import com.example.wechatdemo.BuildConfig;


public class L {
    private static final String TAG = "UMX";

    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String msg) {
        if (DEBUG) {
            Log.d(TAG, msg);
        }
    }
}