package com.example.meuapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        setTitle("Suas Musicas")
        val botao = findViewById<FloatingActionButton>(R.id.fabAdd)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, ListaActivity::class.java)
            startActivity(intencao)
        }
    }
}