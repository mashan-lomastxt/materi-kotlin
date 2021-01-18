package Interface

interface Karnivora2 {

    fun makan() {
        println("Hewan Karnivora memakan daging")
    }
}

interface Herbivora2  {

    fun makan() {
        println("Hewan Karnivora memakan tumbuhan")
    }
}

//Mengimplementasikan interface Karnivora dan Herbivora
class Omnivora2: Karnivora2, Herbivora2{
    override fun makan() {
        super<Karnivora2>.makan()
        super<Herbivora2>.makan()
    }
}

fun main() {
    val ayam = Omnivora2()

    ayam.makan()
}