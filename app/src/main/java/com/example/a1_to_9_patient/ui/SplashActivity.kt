package com.example.a1_to_9_patient.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a1_to_9_patient.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    val sharedPreference = getSharedPreferences("LOGIN_CHECK", Context.MODE_PRIVATE)
    var editor = sharedPreference.edit()

    var username: String? = sharedPreference.getString("username","defaultName")
    var loggedIn: String? = sharedPreference.getString("isLogged","defaultName")
    var long: Long = sharedPreference.getLong("l",1L)


    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)


    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.end_to_center, R.anim.center_to_start)
    }
}