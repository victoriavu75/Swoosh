package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener{
            //intent is an object that allows you to interact with
            //other applications or actions in your own
            //explicit intent: specify component that is the target class
                //example: going from 1 activity to another just like here
            //implicit intent: specify action type and will serve up app(s) to answer intent (options)
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            //context: background information of environment needed to function
            //application context
            //activity context
            startActivity(leagueIntent)
        }
    }
}