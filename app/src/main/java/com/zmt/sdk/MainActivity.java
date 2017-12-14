package com.zmt.sdk;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.zmt.feeds.sdk.TestUtil;


public class MainActivity extends AppCompatActivity {
    private String app_key = "2b7ca456c34744a79cdb1f643c134f2f";
    private String app_secret = "0cd05f8b730a400aaf854d1df641ff61";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniSDK();
        initView();
    }
    private void initView() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.linearLayout,  TestUtil.getFragment());
        ft.commitAllowingStateLoss();
    }

    private void iniSDK() {
        TestUtil.iniSDK(MainActivity.this,app_key,app_secret);
    }
}
