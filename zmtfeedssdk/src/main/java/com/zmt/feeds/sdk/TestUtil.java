package com.zmt.feeds.sdk;

import android.content.Context;

import com.zmeng.zmtfeeds.fragment.ZMTNewsFragment;
import com.zmeng.zmtfeeds.zmt.ZMTNewsFeedsSDK;
import com.zmeng.zmtfeeds.zmt.ZMTNewsFeedsUI;

/**
 * 作者：王东一
 * 创建时间：2017/12/14.
 */

public class TestUtil {
    public static void iniSDK(Context context, String app_key, String app_secret) {
        new ZMTNewsFeedsSDK.Builder().setContext(context).setAppKey(app_key).setAppSecret(app_secret).build().init();

    }

    public static ZMTNewsFragment getFragment() {
        return ZMTNewsFeedsUI.createFeedsFragment(null, null);
    }
}
