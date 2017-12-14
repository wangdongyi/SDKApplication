package com.zmt.sdk;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zmeng.zmtfeeds.fragment.ZMTNewsFragment;
import com.zmeng.zmtfeeds.zmt.ZMTNewsFeedsSDK;
import com.zmeng.zmtfeeds.zmt.ZMTNewsFeedsUI;

public class MainActivity extends AppCompatActivity {
    private ZMTNewsFragment zmtNewsFragment;
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
        zmtNewsFragment = ZMTNewsFeedsUI.createFeedsFragment(null, null);
        ft.replace(R.id.linearLayout, zmtNewsFragment);
        ft.commitAllowingStateLoss();
    }

    private void iniSDK() {
        new ZMTNewsFeedsSDK.Builder().setContext(this).setAppKey(app_key).setAppSecret(app_secret).build().init();
    }
}
