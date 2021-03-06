package com.xht.flutter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 安卓原生页面
 */
public class NativePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_page);

        init();
    }

    private void init() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) return;
        String str = extras.getString("native");
        TextView textView = findViewById(R.id.tv_text);
        textView.setText(str);
    }
}
