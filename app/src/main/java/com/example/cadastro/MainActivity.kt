package com.example.cadastro

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amd: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amd.main)

        amd.btSave.setOnClickListener { v: View ->
            val nomeCompleto = amd.nomeCompletoEt.text.toString()
            val telefone = amd.telefoneEt.text.toString()

            Toast.makeText(
                this@MainActivity,
                "Nome: $nomeCompleto \n" +
                        "Telefone: $telefone",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}