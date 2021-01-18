package inherite
//pewarisan

open class Manusia(nama: String, umur: Int) {
    init {
        println("Nama saya adalah $nama")
        println("Umur saya $umur")
    }
}

class Dosen(nama: String, umur: Int): Manusia(nama, umur) {
    /* println("Nama saya adalah $nama")
     println("Umur saya $umur") */
    fun mengajar() {
        println("Saya bekerja sebagai Dosen")
    }
}

class Dokter(nama: String, umur: Int): Manusia(nama, umur) {
    /* println("Nama saya adalah $nama")
         println("Umur saya $umur") */
    fun mendiagnosis() {
        println("Saya bekerja sebagai Dokter")
    }
}

fun main() {
    val dosen = Dosen("Budi", 25)
    dosen.mengajar()

    println()

    val dokter = Dokter("Siti", 27)
    dokter.mendiagnosis()
}