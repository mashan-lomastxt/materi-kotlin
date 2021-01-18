package inherite
//pewarisan
//abstract Class

abstract class Manusia5(nama: String) {
    init {
        println("Nama saya adalah $nama")
    }

    fun displayNip(nip: Int) {
        println("NIP saya adalah $nip")
    }

    abstract fun tampilPekerjaan(deskripsi: String)
}

class Dosen5(nama: String): Manusia5(nama) {
    override fun tampilPekerjaan(deskripsi: String) {
        println(deskripsi)
    }
}

fun main() {
    val budi = Dosen5("Budi Satyawan")
    budi.tampilPekerjaan("Saya adalah seorang Dosen")
    budi.displayNip(190402255)
}