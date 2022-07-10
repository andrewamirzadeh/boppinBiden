package edu.seminolestate.boppinbiden

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.media.MediaPlayer
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var bidenHead: ImageView
    lateinit var txt: TextView
    var value1 = R.raw.black
    var value2 = R.raw.indian
    var value3 = R.raw.kids
    lateinit var animatorSet: AnimatorSet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bidenHead = findViewById(R.id.imageView)
        txt = findViewById(R.id.textView2)



        var mediaPlayer = MediaPlayer.create(this, value2)

        val anim = RotateAnimation(
            0.0f,
            360.0f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )

        anim.interpolator = LinearInterpolator()
        anim.repeatCount = Animation.INFINITE //Repeat animation indefinitely

        anim.duration = 700





        bidenHead.setOnClickListener(){


            bidenHead.startAnimation(anim);
          //  bidenHead.startAnimation(anim2)


                mediaPlayer.start()
            txt.text = "If you have a problem figuring out whether you're for " +
                    "me or Trump, then you ain't black"


        }



    }
}