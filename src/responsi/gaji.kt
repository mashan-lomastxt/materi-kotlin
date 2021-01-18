package responsi

import java.util.*

interface gajiPegawai {
    val jabatan: String
    val tunjAnak: Int
    val gaji: Int
    val makan: Int
    val transport: Int
    val tunjJabatan: Int
    val pajakgaji: Float
}
class Manager : gajiPegawai {
    override val jabatan: String = "Manager"
    override val gaji: Int = 7000000
    override val tunjAnak: Int = 600000
    override val makan: Int = 65000
    override val transport: Int = 400000
    override val tunjJabatan: Int = 1500000
    override val pajakgaji: Float= 0.05F
}
class Direktur : gajiPegawai {
    override val jabatan: String = "Direktur"
    override val gaji: Int = 10000000
    override val tunjAnak: Int = 700000
    override val makan: Int = 85000
    override val transport: Int = 500000
    override val tunjJabatan: Int = 2500000
    override val pajakgaji: Float= 0.05F
}

fun daftarjabatan (){
    println("Daftar Jabatan =>")
    println("1. Direktur")
    println("2. Manager")
}
fun totalgaji (nmjabatan:Int,jumlahAnak: Int, jmlpresensi: Int){
    if (nmjabatan==1){
        val totalbayar1= Direktur()
        var totalgaji1= totalbayar1.gaji + (totalbayar1.tunjAnak * jumlahAnak) + (totalbayar1.makan * jmlpresensi) + totalbayar1.transport + totalbayar1.tunjJabatan
        var totalpajak1= totalbayar1.pajakgaji * totalgaji1
        println("Total Gaji         : $totalgaji1")
        println("Pajak              : $totalpajak1")
    }
    else if (nmjabatan==2){
        val totalbayar2= Manager()
        var totalgaji2= totalbayar2.gaji + (totalbayar2.tunjAnak * jumlahAnak) + (totalbayar2.makan * jmlpresensi) + totalbayar2.transport + totalbayar2.tunjJabatan
        var totalpajak2= totalbayar2.pajakgaji * totalgaji2
        println("Total Gaji         : $totalgaji2" )
        println("Pajak              : $totalpajak2")
    }
}
fun main() {
    daftarjabatan()
    println("Masukkan Nama          =")
    val listnama = Scanner(System.`in`)
    var namapegawai = listnama.nextLine()
    println("Masukkan NIP         =")
    val listnip = Scanner(System.`in`)
    var kodenip = listnip.nextInt()
    println("Masukkan Jumlah Anak   =")
    val listanak = Scanner(System.`in`)
    var jmlanak = listanak.nextInt()
    println("Masukkan Jumlah Presensi=")
    val listpresensi = Scanner(System.`in`)
    var jmlpresensi = listpresensi.nextInt()
    println("Masukkan nama jabatan (1/2)")
    val listjabatan = Scanner(System.`in`)
    var namajabatan = listjabatan.nextInt()
    if (namajabatan==1) {
        val pilih3 = Direktur()
        println("Jabatan              = ${pilih3.jabatan}" )
    }
    else if (namajabatan==2){
        val pilih4 = Manager()
        println("Jabatan              = ${pilih4.jabatan}" )
    }
    println("------------------------")
    totalgaji(namajabatan,jmlanak,jmlpresensi)

}