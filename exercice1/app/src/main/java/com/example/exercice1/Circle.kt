package com.example.exercice1

    open class Circle(_color:String, _radius:Double)  {


        constructor():this("red",1.0)
            constructor(radius: Double):this("red",radius)
            //constructor(_color: String, _radius: Double):this(color,radius)

        var radius:Double=0.0
        get() = field
        set(value) {field=value}

        init {
            this.radius = _radius
        }

        var color:String = ""
        get() = field
        set(value){field=value}

        init{
            this.color = _color+" "
        }


        public fun getArea():Double{
            return Math.PI*Math.pow(this.radius,2.0)
        }

        /*public fun getPerimeter():Double{
            return 2*Math.PI*this.radius
        }*/

        override public fun toString():String{
            var str:String = "Je suis un cercle "+ this.color +"de " + this.radius.toString() + " de rayon et j'ai une aire de " + this.getArea().toString()
            return str
        }



}