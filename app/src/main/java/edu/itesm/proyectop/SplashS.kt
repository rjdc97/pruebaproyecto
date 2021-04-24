package edu.itesm.proyectop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class SplashS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_s)
        Handler().postDelayed({

            startActivity(Intent(this,LoginActivity::class.java))

            // close this activity
            finish()
        }, 2500)
    }
}