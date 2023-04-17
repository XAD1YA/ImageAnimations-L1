package org.diyorbek.imageanimations_l12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        //buttons
        val blink: MaterialButton = findViewById(R.id.btnBlink)
        val fadeOut: MaterialButton = findViewById(R.id.btnFadeout)
        val sequential: MaterialButton = findViewById(R.id.btnsequentual)
        val together: MaterialButton = findViewById(R.id.btntogether)
        val bounce: MaterialButton = findViewById(R.id.btnBounce)
        val move: MaterialButton = findViewById(R.id.btnMove)
        val slideDown: MaterialButton = findViewById(R.id.btnSlideDown)
        val zoomIn: MaterialButton = findViewById(R.id.btnZoomIn)
        val fadeIn: MaterialButton = findViewById(R.id.btnFadeIn)
        val rotate: MaterialButton = findViewById(R.id.btnRotate)
        val slideUp: MaterialButton = findViewById(R.id.btnSlideUp)
        val zoomOut: MaterialButton = findViewById(R.id.btnZoomOut)
        val btnNext: MaterialButton = findViewById(R.id.btnToNext)
        val btnStopAnim: MaterialButton = findViewById(R.id.btnStop)
        //animations
        val blinkAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.blink)
        val bounceAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val fadeOutAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        val fadeInAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val moveAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.move)
        val rotateAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val sequentualsAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.sequentual)
        val slideUpAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        val slideDownAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
        val togetherAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.together)
        val zoomInAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val zoomOutAnim: Animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
        val androidImage: ImageView = findViewById(R.id.androidImage)
        //listeners
        blink.setOnClickListener { androidImage.startAnimation(blinkAnim) }
        fadeOut.setOnClickListener { androidImage.startAnimation(fadeOutAnim) }
        sequential.setOnClickListener { androidImage.startAnimation(sequentualsAnim) }
        together.setOnClickListener { androidImage.startAnimation(togetherAnim) }
        bounce.setOnClickListener { androidImage.startAnimation(bounceAnim) }
        move.setOnClickListener { androidImage.startAnimation(moveAnim) }
        slideDown.setOnClickListener { androidImage.startAnimation(slideDownAnim) }
        zoomIn.setOnClickListener { androidImage.startAnimation(zoomInAnim) }
        fadeIn.setOnClickListener { androidImage.startAnimation(fadeInAnim) }
        rotate.setOnClickListener { androidImage.startAnimation(rotateAnim) }
        slideUp.setOnClickListener { androidImage.startAnimation(slideUpAnim) }
        zoomOut.setOnClickListener { androidImage.startAnimation(zoomOutAnim) }
        btnStopAnim.setOnClickListener { androidImage.clearAnimation() }

    }
}