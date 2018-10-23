package com.morrisware.android.learnactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.intent_flag_activity.*

/**
 * Created by MorrisWare on 2018/10/23.
 * Email: MorrisWare01@gmail.com
 */
class IntentFlagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intent_flag_activity)
        testApplicationIntent.setOnClickListener {
            //            val intent = Intent(this, MainActivity::class.java)
            val intent = Intent(this, SingleInstanceActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            application.startActivity(intent)
        }
    }

}