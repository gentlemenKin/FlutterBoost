package com.bitconch.io.testapplication;

import io.flutter.app.FlutterPluginRegistry;
import io.flutter.plugin.common.StandardMessageCodec;

/**
 * Created by Administrator on 2019/10/14.
 */

public class TextPlatformViewPlugin {
    public static void register(FlutterPluginRegistry registry) {
        registry.getPlatformViewsController().getRegistry().registerViewFactory("plugins.test/view",
                new TextPlatformViewFactory(StandardMessageCodec.INSTANCE));
    }
}
