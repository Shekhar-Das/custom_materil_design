package com.das.bd.custom_material_design.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.das.bd.custom_material_design.MainActivity
import com.das.bd.custom_material_design.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hiding title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        //4 second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@SplashActivity , MainActivity::class.java))
            //finish this activity
            finish()
        },4000)
    }
}