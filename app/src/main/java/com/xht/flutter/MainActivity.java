package com.xht.flutter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xht.flutter.boost.PageRouter;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnGotoFlutter;
    private Button btnGotoNaFlutter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnGotoFlutter = findViewById(R.id.btn_goto_flutter);
        btnGotoNaFlutter = findViewById(R.id.btn_goto_na_flutter);
        btnGotoFlutter.setOnClickListener(this);
        btnGotoNaFlutter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_goto_flutter:
                HashMap<String, String> params = new HashMap<>();
                params.put("Firstkey", "我是参数->A");
                PageRouter.openPageByUrl(MainActivity.this, PageRouter.FirstPageUrl, params);
                break;
            case R.id.btn_goto_na_flutter:
                startActivity(new Intent(MainActivity.this, NativeAndFlutterActivity.class));
                break;
        }
    }
}
