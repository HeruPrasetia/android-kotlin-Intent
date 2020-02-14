package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if(intent.extras != null)
        {
            lblEmail.setText(intent.getStringExtra("email"))
            lblPwd.setText(intent.getStringExtra("pwd"))
        }else{
            lblEmail.setText("Tidak Ada Data")
            lblPwd.setText("Tidak Ada Data")
        }

        btnKeluar.setOnClickListener {
            finish()
        }
    }
}
