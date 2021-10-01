package com.example.exercice1

open class Rectangle(_color:String,_filled:Boolean,_width:Double, _lenght:Double):Shape(_color,_filled) {
    constructor():this("red",false,0.0,0.0)
        constructor(_width: Double):this("red",false,_width,0.0)
        constructor(_width: Double,_lenght: Double):this("red",false,_width,_lenght)

    private var _width:Double = 0.0;
    private var _lenght:Double = 0.0;

    init {
        this._width = _width;
        this._lenght = _lenght;
    }

    public fun getWidth():Double{return this._width}
    public fun getLength():Double{return this._lenght}
    public fun setWidth(wid:Double){this._width = wid}
    public fun setLength(len:Double){this._width = len}

    public fun getArea():Double{
        return this._width*this._lenght
    }
    public fun getPerimeter():Double{
        return (2*this._width+2*this._lenght)
    }

    /*override public fun toString():String{

    }*/

}