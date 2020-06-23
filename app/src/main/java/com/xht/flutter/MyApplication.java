package com.xht.flutter;

import android.app.Application;

import com.xht.flutter.boost.BoostHelper;

/**
 * Created by xht on 2020/6/23
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BoostHelper.initBoost(this);
    }
}
