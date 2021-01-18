package inherite

open class biayaKuliah(nama: String, prodi: String, biaya: Int){
    init {
        println("Nama   : $nama")
        println("prodi  : $prodi")
        println("biaya  : $biaya")
    }
}

class MahasiswaReguler(nama: String, prodi: String, biaya: Int): biayaKuliah(nama,prodi,biaya){
}