package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {
    private var questionList:ArrayList<QuestionData>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        SetData.getQuestion()

        questionList = SetData.getQuestion()
        var que = questionList!![0]
        question_text.text = que.question
        opt1.text = que.option_one
        opt1.setOnClickListener{
            opt1.background = ContextCompat.getDrawable(this, R.drawable.selected_question_option)
            
        }
        opt2.text = que.option_two
        opt3.text = que.option_three
        opt4.text = que.option_four

        progess_bar.progress =1
        progess_bar.max = questionList!!.size
    }
}