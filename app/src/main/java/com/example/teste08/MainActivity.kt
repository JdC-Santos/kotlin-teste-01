package com.example.teste08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText;
    lateinit var campo2: EditText;

    lateinit var btnSomar: Button;
    lateinit var btnSubtrair: Button;
    lateinit var btnMultiplicar: Button;
    lateinit var btnDividir: Button;
    lateinit var resultado: TextView;


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

        btnSomar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                var res = Integer.parseInt(campo1.text.toString()) + Integer.parseInt(campo2.text.toString())
                resultado.text = res.toString()
            }
        });

        btnSubtrair.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                var res = Integer.parseInt(campo1.text.toString()) - Integer.parseInt(campo2.text.toString())
                resultado.text = res.toString()
            }
        });

        btnMultiplicar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                var res = Integer.parseInt(campo1.text.toString()) * Integer.parseInt(campo2.text.toString())
                resultado.text = res.toString()
            }
        });

        btnDividir.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                var res = Integer.parseInt(campo1.text.toString()) / Integer.parseInt(campo2.text.toString())
                resultado.text = res.toString()
            }
        });
    }
}