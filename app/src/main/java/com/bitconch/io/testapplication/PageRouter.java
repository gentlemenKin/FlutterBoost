package com.bitconch.io.testapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Administrator on 2019/10/14.
 */

public class PageRouter {

    public static final String NATIVE_PAGE_URL = "sample://nativePage";
    public static final String FLUTTER_PAGE_URL = "sample://flutterPage";
    public static final String FLUTTER_FRAGMENT_PAGE_URL = "sample://flutterFragmentPage";


    public static final String KIM_TEST_URL = "kim://kimFlutter";
    public static boolean openPageByUrl(Context context, String url, Map params) {
        return openPageByUrl(context, url,params, 0);
    }

    public static boolean openPageByUrl(Context context, String url, Map params, int requestCode) {
        try {
            if (url.startsWith(FLUTTER_PAGE_URL)) {
                context.startActivity(new Intent(context, FlutterPageActivity.class));
                return true;
            } else if (url.startsWith(FLUTTER_FRAGMENT_PAGE_URL)) {

                context.startActivity(new Intent(context, FlutterFragmentPageActivity.class));
                return true;
            } else if (url.startsWith(NATIVE_PAGE_URL)) {
                Intent intent = new Intent(context, NativePageActivity.class);
                intent.putExtra("query",(Serializable)params.get("query"));
                context.startActivity(intent);
                return true;
            } else if (url.startsWith(KIM_TEST_URL)){
                context.startActivity(new Intent(context,KimFlutterActivity.class));
                return true;
            }
            else {
                return false;
            }
        } catch (Throwable t) {
            return false;
        }
    }
}

