package com.example.circleapplication

import android.os.Bundle
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var imageIcon: ImageView
    private lateinit var imageIcon2: ImageView
    private lateinit var imageIcon3: ImageView
    private lateinit var imageIcon4: ImageView
    private lateinit var imageIcon5: ImageView
    private lateinit var imageIcon6: ImageView
    private lateinit var imageIcon7: ImageView
    private lateinit var imageIcon8: ImageView
    private lateinit var crossGame: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageIcon = findViewById(R.id.imageView3)
        imageIcon2 = findViewById(R.id.imageView4)
        imageIcon3 = findViewById(R.id.imageView10)
        imageIcon4 = findViewById(R.id.imageView9)
        imageIcon5 = findViewById(R.id.imageView8)
        imageIcon6 = findViewById(R.id.imageView7)
        imageIcon7 = findViewById(R.id.imageView6)
        imageIcon8 = findViewById(R.id.imageView5)
        crossGame = findViewById(R.id.imageView11)
        val arrayOfImages = arrayOf(imageIcon, imageIcon2, imageIcon3, imageIcon4, imageIcon5, imageIcon6, imageIcon7, imageIcon8)

        fun animateIcons(pivotXValue: Float, pivotYValue: Float, imageViewIcon:ImageView){
            var animationCoordinates = RotateAnimation(
                0.0f,
                -360f,
                0,
                pivotXValue,
                0,
                pivotYValue
            )
            animationCoordinates.duration = 1500
            animationCoordinates.repeatCount = 6
            imageViewIcon.startAnimation(animationCoordinates)
        }

        for(iconsForAnimation in arrayOfImages){
            when(iconsForAnimation){
                imageIcon -> animateIcons(-280f,90f, imageIcon)
                imageIcon2 -> animateIcons(-170f,360f, imageIcon2)
                imageIcon3 -> animateIcons(-170f,-180f,imageIcon3)
                imageIcon4 -> animateIcons(70f, -270f, imageIcon4)
                imageIcon5 -> animateIcons(360f,-170f, imageIcon5)
                imageIcon6 -> animateIcons(470f, 70f, imageIcon6)
                imageIcon7 -> animateIcons(360f, 330f, imageIcon7)
                imageIcon8 -> animateIcons(90f, 450f, imageIcon8)

            }
        }
        crossGame.animate().apply {
            duration = 14000
            rotationXBy(5000f)
            rotationYBy(5000f)
        }.start()

    }
}