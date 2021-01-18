package modifier

open class Kendaraan() {
    var ban = 4 //Secara default sebagai public
    private var spion = 2 //Private untuk kelas Kendaraan
    protected open val jok = 7 //Terlihat dalam Kendaraan dan kelas turunannya (mobil)
    internal val stir = 1 //Terlihat dalam modul yang sama

    protected fun maju() { } //Terlihat dalam Kendaraan dan kelas turunannya (mobil)
}

class Mobil: Kendaraan() {
    //Ban, jok, stir, dan maju dari Kendaraan dapat dilihat
    //Spion tidak dapat dilihat
    override val jok = 4 //Jok sebagai protected
}

fun main() {
    val honda = Kendaraan()

    //Ban dan stir dari Kendaraan dapat dilihat
    //Spion, jok, dan maju dari Kendaraan tidak dapat dilihat

    val toyota = Mobil()
    //Jok dari Mobil tidak dapat dilihat
}