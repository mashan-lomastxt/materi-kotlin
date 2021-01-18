package Latihan

open class Person2(age: Int, name: String) {
    // some code
}

class Footballer2(age: Int, name: String, club: String): Person2(age, name) {
    init {
        println("Football player $name of age $age and plays for $club.")
        //lewat init
        this.playFootball()
    }

    fun playFootball() {
        println("I am playing football.")
    }
}

fun main(args: Array<String>) {
    val f1 = Footballer2(29, "Cristiano", "LA Galaxy")
    //lewat deklarasi object
    //f1.playFootball()
}