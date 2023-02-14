package com.example.laba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun test (view: View) {
        val MyIntent = Intent(this, MainActivity2::class.java)
        val MyString = "hello!"
        MyIntent.putExtra(MainActivity2.MY_TEXT, MyString)
        startActivity(MyIntent)

    }
}