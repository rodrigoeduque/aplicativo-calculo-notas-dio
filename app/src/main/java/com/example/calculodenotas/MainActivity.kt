package com.example.calculodenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btVerificar = buttonVerificar
        val resultado = textViewResultado
        val btLimparFormularios = buttonLimpar

        btVerificar.setOnClickListener {
            val nota1 = Integer.parseInt(editTextNota1.text.toString())
            val nota2 = Integer.parseInt(editTextNota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(editTextFaltas.text.toString())



            if (media >= 6 && faltas <= 10){
                resultado.text = "Aluno Aprovado! PARABÉNS \n Nota Final: $media \n Faltas: $faltas"
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.text = "Aluno Reprovado \n Nota Final: $media \n Faltas: $faltas"
                resultado.setTextColor(Color.RED)
            }
        }

        btLimparFormularios.setOnClickListener {
            val nota1 = editTextNota1.text.clear()
            val nota2 = editTextNota2.text.clear()
            val faltas = editTextFaltas.text.clear()
            resultado.text = ""
        }


    }
}