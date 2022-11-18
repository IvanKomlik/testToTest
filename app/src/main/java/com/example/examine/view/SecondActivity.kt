package com.example.examine.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.examine.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun callToSupport(view: View){
        val callNumber = Uri.parse("tel: +84951112233")
        var intentCallToSupport = Intent(Intent.ACTION_CALL, callNumber)
        startActivity(intentCallToSupport)
    }
}