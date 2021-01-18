package DataOOP

//Riska_Handika
//19.12.1102

import kotlin.math.PI

abstract class bangundatar {
    abstract fun calculateArea() : Double
    abstract fun calculatePerimeter() : Double
}

open class Rectangle(val lebar: Double, val panjang: Double) : bangundatar() {

    override fun calculateArea(): Double {
        return lebar*panjang
    }

    override fun calculatePerimeter(): Double {
        return 2 * (lebar + panjang)
    }
}

class Square(side: Double) : Rectangle(side, side)

class Circle(var radius : Double) : bangundatar() {

    override fun calculateArea(): Double {
        return PI*radius*radius
    }

    override fun calculatePerimeter(): Double {
        return 2*PI*radius
    }
}

fun main(args: Array<String>) {
    //contoh persegi panjang
    val panjang = 8.0
    val lebar = 4.0
    val persegipanjang = Rectangle(panjang, lebar)
    println("Luas persegi panjang : ${persegipanjang.calculateArea()}")

    //contoh persegi
    val sisi = 10.0
    val persegi = Square(sisi)
    println("Luas persegi : ${persegi.calculateArea()}")

    //contoh lingkaran
    val r = 7.0
    val lingkaran = Circle(r)
    println("Luas lingkaran : ${lingkaran.calculateArea()}")
}