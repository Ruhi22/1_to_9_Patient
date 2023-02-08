package com.example.a1_to_9_patient.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1_to_9_patient.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference = getSharedPreferences("LOGIN_CHECK", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()
        editor.putString("username","Ruhi")
        editor.putString("isLogged","true")
        editor.putLong("l",100L)
        editor.commit()

        var username: String? = sharedPreference.getString("username","defaultName")
        var loggedIn: String? = sharedPreference.getString("isLogged","defaultName")
        sharedPreference.getLong("l",1L)


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}