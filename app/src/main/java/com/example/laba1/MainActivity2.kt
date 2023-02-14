package com.example.laba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var show: TextView
    companion object {

        const val MY_TEXT = ""

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        show = findViewById(R.id.show1)
        show()
    }
    fun show(){
        val text = intent.getStringExtra(MY_TEXT)
        show.text=text.toString()
    }
}