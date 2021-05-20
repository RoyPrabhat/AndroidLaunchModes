package com.example.launchmodeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityC: AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvButton.text = "ACTIVITY C"
        tvButton.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvButton->{
                Intent(this, ActivityD::class.java).apply {
                    startActivity(this)
                }
            }

        }
    }
}