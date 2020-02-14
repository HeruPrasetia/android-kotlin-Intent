package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email = edtEmail.text.toString()
        var pwd = edtPwd.text.toString()

        btnLogin.setOnClickListener {
            if(email == "root" && pwd == "toor") {
                val bundle = Bundle()
                bundle.putString("email", edtEmail.text.toString())
                bundle.putString("pwd", edtPwd.text.toString())

                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Maaf Email atau Password Salah "+edtEmail.text.toString()+" "+edtPwd.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        btnDaftar.setOnClickListener {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }
    }
}
