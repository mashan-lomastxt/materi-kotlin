package polymorphism

open class Pegawai (val nama: String){
    open fun tampilUmur(umur: Int){
        println("Nama Saya Adalah $nama, Berumur $umur")
    }
}

open class Manager(nama: String) : Pegawai(nama){
    final override fun tampilUmur(umur: Int){
        println("Nama Saya Adalah $nama, Berumur $umur")
    }
}

class Direktur(nama: String) : Pegawai(nama){
    override fun tampilUmur(umur: Int) {
        println("Nama Saya Adalah $nama, Berumur $umur")
    }
}

fun main(){
    var pegawai: Pegawai = Pegawai(nama = "Budi")
    pegawai.tampilUmur(umur = 20)

    pegawai = Manager(nama = "Budi")
    pegawai.tampilUmur(umur = 25)

    pegawai = Direktur(nama = "Budi")
    pegawai.tampilUmur(umur = 30)
}