package com.example.mad_practical_9

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R. id.imageview)
        imageView.setBackgroundColor(R.drawable.alarm_animation_list)
        alarmAnimation = imageView.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmAnimation.start()
        }
        else
            alarmAnimation.stop()
        super.onWindowFocusChanged(hasFocus)
    }
}