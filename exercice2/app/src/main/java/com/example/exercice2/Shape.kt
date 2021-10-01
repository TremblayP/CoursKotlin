package com.example.exercice2

abstract class Shape(_color:String,_filled:Boolean) {
    constructor():this("red",false)
        //constructor(color:String,filled:Boolean):this(color,filled)

    var color:String="red"
        get() = field
        set(value) {field=value}
    init {
        this.color =_color + " "
    }

    var filled:Boolean = false
        get() = field
        set(value) {field=value}
    init {
        this.filled =_filled
    }

    abstract public fun getArea():Double
    abstract public fun getPerimeter():Double
    override abstract public fun toString():String


}