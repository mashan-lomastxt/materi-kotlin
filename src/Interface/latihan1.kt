package Interface

interface Mahasiswa {

    val nama: String
    val umur: Int

    fun tampilNama() : String
    fun tampilUmur() {
        println(" 20 tahun")
    }
}

class ImplemntMahasiswa : Mahasiswa {

    override val nama: String = "Budi"
    override val umur: Int = 20
    override fun tampilNama() = "Budi Satyawan"
}

fun main() {
    val obj = ImplemntMahasiswa()

    println("Nama = ${obj.nama}")
    println("Umur = ${obj.umur}")

    print("Nama lengkap anda adalah ")
    println(obj.tampilNama())

    print("Umur anda adalah ")
    obj.tampilUmur()
}