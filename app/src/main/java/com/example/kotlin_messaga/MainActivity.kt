package com.example.kotlin_messaga

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun message(view: View){

        val message = AlertDialog.Builder(this);


        message.setTitle("Uyarı");
        message.setMessage("Uygulmadan Çıkmak istediğinize Emin misiniz?");
        message.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this, "Uygulama Kapatılıyor",Toast.LENGTH_SHORT).show();
            System.exit(0)
        })
        message.setNegativeButton( "Hayır", DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this, "Uygulamaya Kaldığınız Yerden Devam Edebilrsiniz",Toast.LENGTH_SHORT).show();

        })

        message.show()
    }
}