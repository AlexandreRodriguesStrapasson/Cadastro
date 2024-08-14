package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
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

        val estados = resources.getStringArray(R.array.estados_brasileiros)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, estados)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        amd.spinnerTv.adapter = adapter

        amd.btSave.setOnClickListener {
            val nomeCompleto = amd.nomeCompletoEt.text.toString()
            val telefone = amd.telefoneEt.text.toString()
            val email = amd.emailEt.text.toString()
            val emailListado = if(amd.emailCb.isChecked) "Sim" else "Não"
            var sexo = "Não definido"
            val cidade = amd.cidadeEt.text.toString()
            val uf = amd.spinnerTv.selectedItem.toString()


            if (amd.masculinoRb.isChecked){
                sexo = "Masculino"
            }
            if(amd.femininoRb.isChecked){
                sexo = "Feminino"
            }

            Toast.makeText(
                this@MainActivity,
                "Nome: $nomeCompleto \n" +
                        "Telefone: $telefone \n" +
                        "E-mail: $email \n" +
                        "Inscrito na lista de E-mails: $emailListado \n" +
                        "Sexo: $sexo \n" +
                        "Cidade: $cidade \n" +
                        "UF: $uf",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}