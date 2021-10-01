package com.example.exercice2

open class Circle(_radius:Double,_color:String,_filled:Boolean):Shape(_color,_filled)  {


    constructor():this(1.0,"red",false)
        constructor(radius: Double):this(radius,"red",false)
        //constructor(radius: Double,color:String,filled:Boolean):this(radius,color,filled)

    var radius:Double=0.0
        get() = field
        set(value) {field=value}

    init {
        this.radius = _radius
    }

    override public fun getArea():Double{
        return Math.PI*Math.pow(this.radius,2.0)
    }

    override public fun getPerimeter():Double{
        return 2*Math.PI*this.radius
    }

    override public fun toString():String{
        var str:String = "Je suis un cercle "+ this.color +"de " + this.radius.toString() + " de rayon et j'ai une aire de " + this.getArea().toString()
        return str
    }



}