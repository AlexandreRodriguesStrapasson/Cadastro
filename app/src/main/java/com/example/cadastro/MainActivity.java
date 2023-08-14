package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText inputNome;
    private EditText inputTelefone;
    private CheckBox checkBox;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private EditText inputCidade;
    private EditText inputUf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNome       = findViewById(R.id.inputNome);
        inputTelefone   = findViewById(R.id.inputTelefone);
        checkBox        = findViewById(R.id.checkBox);
        radioButton1    = findViewById(R.id.radioButton1);
        radioButton2    = findViewById(R.id.radioButton2);
        inputCidade     = findViewById(R.id.inputCidade);
        inputUf         = findViewById(R.id.inputUf);

        Button salvarBotao = findViewById(R.id.Bsalvar);
        salvarBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome                 = inputNome.getText().toString();
                String telefone             = inputTelefone.getText().toString();
                Boolean respostaCheckBox    = checkBox.isChecked();
                String sexo                 = radioButton1.isChecked() ? "Masculino" : "Feminino";
                String cidade               = inputCidade.getText().toString();
                String uf                   = inputUf.getText().toString();

                System.out.println("Nome: " + nome);
                System.out.println("Telefone" + telefone);
                System.out.println("Ingressar na lista de E-mails: " + respostaCheckBox);
                System.out.println("Sexo: " + sexo);
                System.out.println("Cidade: " + cidade);
                System.out.println("UF: " + uf);
            }
        });


    }
}