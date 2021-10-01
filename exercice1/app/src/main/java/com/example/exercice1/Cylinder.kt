package com.example.exercice1

open class Cylinder(_color:String,_radius:Double,_height:Double):Circle(_color,_radius) {
    constructor():this("red",1.0,1.0)
        constructor(radius:Double):this("red",1.0,radius)
        constructor(radius: Double,height: Double):this("red",1.0,height)

    var height:Double=1.0
        get() = field
        set(value) {field=value}
    init {
        this.height = _height;
    }

    public fun getVolume():Double{
        var vol:Double = this.getArea()*this.height
        return vol
    }

    override public fun toString():String{
        var str:String = "Je suis un cylindre avec un volume de " + this.getVolume().toString()
        return str
    }
}