package com.example.exercice2

open class Square(_side:Double,_color:String,_filled:Boolean):Rectangle(_side,_side,_color,_filled) {
    constructor():this(1.0,"red",false)
        constructor(side:Double):this(side,"red",false)

    var side:Double = 1.0
        get() = field
        set(value) {field=value}

    init {
        this.side = _side
    }

    override public fun toString():String{
        return "Carré avec des cotés de " + this.side.toString()
    }

}