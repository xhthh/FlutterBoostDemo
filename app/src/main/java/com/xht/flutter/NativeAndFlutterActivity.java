package com.xht.flutter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.idlefish.flutterboost.containers.FlutterFragment;

/**
 * Created by xht on 2020/6/23
 * 安卓和原生混合页面
 */
public class NativeAndFlutterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_native_flutter);

        init();
    }

    public void init() {
        //将Flutter页面作为Fragment添加到FrameLayout上
        FlutterFragment flutterFragment = new FlutterFragment.NewEngineFragmentBuilder().url("fragmentPage").build();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_stub, flutterFragment).commit();
    }
}
