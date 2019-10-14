package com.bitconch.io.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.idlefish.flutterboost.containers.BoostFlutterActivity
import java.io.File

class KimFlutterActivity : BoostFlutterActivity() {

    override fun getContainerUrl(): String {
        return "kim"
    }

    override fun getContainerUrlParams(): MutableMap<Any?, Any?> {

        val params = HashMap<String,String>()
        params.put("kim","kim")
        return params as MutableMap<Any?, Any?>
    }
}
