package com.example.teste08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText;
    lateinit var campo2: EditText;

    lateinit var btnSomar: Button;
    lateinit var btnSubtrair: Button;
    lateinit var btnMultiplicar: Button;
    lateinit var btnDividir: Button;
    lateinit var resultado: EditText;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campo1 = findViewById(R.id.campo1);
        campo2 = findViewById(R.id.campo2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        resultado = findViewById(R.id.resultado);

    }
}