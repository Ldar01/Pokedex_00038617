package com.example.tarea_nextor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tarea_nextor.Utils.AppConstants
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (this.intent!=null){
            nombre_pokemon.text = this.intent.getStringExtra(AppConstants.TEXT_KEY_POKEMON_URL)
        }

    }
}
