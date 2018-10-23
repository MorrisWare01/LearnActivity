package com.morrisware.android.learnactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.single_instance_activity.*

/**
 * Created by MorrisWare on 2018/10/23.
 * Email: MorrisWare01@gmail.com
 */
class SingleInstanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.single_instance_activity)
        gotoOtherSingleInstance.setOnClickListener {
            startActivity(Intent(this, OtherSingleInstanceActivity::class.java))
        }
        gotoMainActivity.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}