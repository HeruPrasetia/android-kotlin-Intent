package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_daftar.*

class DaftarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        btnProsesDaftar.setOnClickListener {
            if (edtNama.text.toString() != "" && edtTTL.text.toString() != "" && edtDaftarEmail.text.toString() != "" && edtDaftarPwd.text.toString() !== ""){
                Toast.makeText(this, "Selamat Pendaftaran Anda Berhasil", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Data Harus Terisi Semua", Toast.LENGTH_SHORT).show()
            }
        }

        btnBatal.setOnClickListener {
            finish()
        }
    }
}
