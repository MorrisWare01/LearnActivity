package com.morrisware.android.learnactivity

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testIntentFlag.setOnClickListener {
            startActivity(Intent(this, IntentFlagActivity::class.java))
        }
        val lis: ListActivity
    }
}
