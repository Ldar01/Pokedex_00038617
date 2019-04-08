package com.example.tarea_nextor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tarea_nextor.Utils.AppConstants
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intento: Intent = this.intent

        if (intento != null){
            nombre_pokemon.text = intento.getStringExtra(AppConstants.TEXT_KEY_POKEMON_NAME)
            tipo_pokemon.text = intento.getStringExtra(AppConstants.TEXT_KEY_POKEMON_TYPE)
            habilidad_pokemon.text = intento.getStringExtra(AppConstants.TEXT_KEY_POKEMON_ABILITIES)
        }

    }
}
