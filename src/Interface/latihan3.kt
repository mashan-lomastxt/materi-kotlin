package Interface

interface Karnivora {

    fun makanDaging() {
        println("Hewan Karnivora memakan daging")
    }
}

interface Herbivora  {

    fun makanTumbuhan() {
        println("Hewan Karnivora memakan tumbuhan")
    }
}

//Mengimplementasikan interface Karnivora dan Herbivora
class Omnivora: Karnivora, Herbivora

fun main() {
    val ayam = Omnivora()

    ayam.makanDaging()
    ayam.makanTumbuhan()
}