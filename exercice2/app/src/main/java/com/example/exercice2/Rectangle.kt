package com.example.exercice2

open class Rectangle(_width:Double,_lenght:Double,_color:String,_filled:Boolean):Shape(_color,_filled) {
    constructor():this(1.0,1.0,"red",false)
    constructor(width: Double):this(width,1.0,"red",false)
    constructor(width: Double,lenght: Double):this(width,lenght,"red",false)

    var width:Double = 0.0
        get() = field
        set(value) {field=value}

    var lenght:Double = 0.0
        get() = field
        set(value) {field=value}

    init {
        this.width = _width;
        this.lenght = _lenght;
    }

    /*public fun getWidth():Double{return this._width}
    public fun getLength():Double{return this._lenght}
    public fun setWidth(wid:Double){this._width = wid}
    public fun setLength(len:Double){this._width = len}*/

    override public fun getArea():Double{
        return this.width*this.lenght
    }
    override public fun getPerimeter():Double{
        return (2*this.width+2*this.lenght)
    }

    override  public fun toString():String{
        var txt:String = ""
        var aire:String = this.getArea().toString()
        var perimetre:String = this.getPerimeter().toString()
        txt = "Je suis un rectangle avec un perimetre de " + perimetre + " et une aire de " + aire
        return txt
    }
}