package com.example.tarea_nextor.Utils

class abilities (ability : ability, is_hidden : Boolean, slot : Int){
    var ability:ability?= null
    var is_hidden: Boolean = true
    var slot:Int = 0

    init {
        this.ability = ability
        this.is_hidden = is_hidden
        this.slot = slot
    }
}