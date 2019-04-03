package com.example.tarea_nextor.Utils

class Pokemon (id: Int, name: String,  types: ArrayList<types>, abilities: ArrayList<abilities>) {
    var id: Int = 0
    var name: String = ""
    var types: ArrayList<types>? = null
    var abilities: ArrayList<abilities>? = null

    init {
        this.id = id
        this.name = name
        this.types = types
        this.abilities = abilities
    }
}