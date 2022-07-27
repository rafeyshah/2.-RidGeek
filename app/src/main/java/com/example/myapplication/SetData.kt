package com.example.myapplication

// Same like static for singleton
object SetData {
    fun getQuestion(): ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            1,
            "Jadu's father has three sons- Shapr I and Shapr II. Can you guess the name of the third son? ",
            "Shapr III",
            "Shapr 3",
            "Jadu",
            "Jadu III",
            3
        )
        var q2 = QuestionData(
            2,
            "How many months have 28 days?",
            "2",
            "1",
            "None",
            "All of them",
            4
        )
        var q3 = QuestionData(
            3,
            "How many 0.5cm slices can you cut from a bread that is 25cm long?",
            "50",
            "25",
            "39",
            "None",
            1
        )
        var q4 = QuestionData(
            4,
            "The Answer is Really Big.",
            "The Answer",
            "Really Big",
            "Elephant",
            "Data given is insufficient",
            1
        )
        var q5 = QuestionData(
            5,
            "Divide 30 by half and add ten.",
            "40.5",
            "50",
            "70",
            "I know this is a trick question, so NONE. Ha!",
            3
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)

        return que

    }
}