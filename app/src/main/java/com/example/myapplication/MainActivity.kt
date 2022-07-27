package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        nextButton.setOnClickListener {
            if (inputText.text.toString().isEmpty()){
                Toast.makeText(this, "Freak Out? XD Enter your name!", Toast.LENGTH_SHORT).show()
            } else {
                var intent = Intent(this, QuestionActivity::class.java)
                startActivity(intent)
//              User can't go back to previous activity
                finish()
            }
        }
    }
}