package com.example.exercice3

class MyComplex(var real: Double, var imag: Double) {
    fun setValue(real: Double, imag: Double) {
        this.real = real
        this.imag = imag
    }

    fun isReal(): Boolean {
        return imag == 0.0
    }

    val isImaginary: Boolean
        get() = real == 0.0

    fun equals(real: Double, imag: Double): Boolean {
        return this.real == real && this.imag == imag
    }

    fun equals(another: MyComplex): Boolean {
        val epsilon = 10E-8
        return real - another.real <= epsilon && imag - another.imag <= epsilon
    }

    fun magnitude(): Double {
        return Math.sqrt(real * real + imag * imag)
    }

    fun argumentInRadians(): Double {
        return Math.atan2(imag, real)
    }

    fun argumentInDegrees(): Int {
        return 0
    }

    fun conjugate(): MyComplex {
        return MyComplex(real, -imag)
    }

    fun add(another: MyComplex): MyComplex {
        return MyComplex(real + another.real, imag + another.imag)
    }

    fun substract(another: MyComplex): MyComplex {
        return MyComplex(real - another.real, imag - another.imag)
    }

    fun multiplyWith(another: MyComplex): MyComplex {
        real = real * another.real - imag * another.imag
        imag = real * another.imag + imag * another.real
        return this
    }

    fun divideBy(another: MyComplex): MyComplex {
        val tmp = multiplyWith(another.conjugate())
        val delimiter = another.real * another.real + another.imag * another.imag
        if (delimiter != 0.0) {
            real = tmp.real / delimiter
            imag = tmp.imag / delimiter
        }
        return this
    }

    override fun toString(): String {
        return "(" + real + " + " + imag + "i)"
    }
}