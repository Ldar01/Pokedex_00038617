package com.example.tarea_nextor

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tarea_nextor.Utils.Pokemon
import kotlinx.android.synthetic.main.pokemon_list2.view.*

class PokemonAdapter(val items: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    private var countViews: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pokemon_list2, parent, false)

        view.findViewById<TextView>(R.id.pokemon_id_count).text = countViews.toString()
        countViews++
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Pokemon) = with(itemView) {
            nombre_pokemon.text = item.name
            tipo_pokemon.text = item.types.toString()
            others.text = item.abilities.toString()
        }
    }
}
