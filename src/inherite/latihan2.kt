package inherite
//pewarisan

open class Manusia1(nama: String, umur: Int) {
    //Body kelas
}

class Dosen1(nama: String, umur: Int, kampus: String): Manusia1(nama, umur) {
    init {
        println("Nama saya $nama berumur $umur dan mengajar di $kampus")
    }

    fun mengajar() {
        println("Saya bekerja sebagai Dosen")
    }
}

fun main() {
    val dosen = Dosen1("Budi", 25, "Universitas AMIKOM Yogyakarta")
    //dosen.mengajar()
}