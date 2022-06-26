package com.example.meuapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.tbrCadastro))
        setTitle("Nova Busca")

        val botaoSalvar = findViewById<Button>(R.id.btnBuscar)
        botao.setOnClickListener {
            finish()
        }
        val botao = findViewById<Button>(R.id.btnCancelar)
        botao.setOnClickListener {
            finish()
        }

    }
}