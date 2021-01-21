package responsi

import java.util.*

interface gajiPegawai {
    val jabatan: String
    val gaji: Int
    val tunjAnak: Int
    val tunjIstri: Int
    val makan: Int
    val pajakgaji: Float
}
class Direktur : gajiPegawai {
    override val jabatan: String = "Direktur"
    override val gaji: Int = 10000000
    override val tunjIstri: Int = 1500000
    override val tunjAnak: Int = 700000
    override val makan: Int = 85000
    override val pajakgaji: Float= 0.05F
}
class Manager : gajiPegawai {
    override val jabatan: String = "Manager"
    override val gaji: Int = 7000000
    override val tunjIstri: Int = 1000000
    override val tunjAnak: Int = 600000
    override val makan: Int = 65000
    override val pajakgaji: Float= 0.05F
}

fun daftarjabatan (){
    println("Pilihan Jabatan =>")
    println("[1] Direktur")
    println("[2] Manager")
    println(" ")
    println("Pilih Status =>")
    println("[1] Lajang")
    println("[2] Menikah")
}

fun totalgaji (nmjabatan: Int,jumlahAnak: Int, jmlpresensi: Int){
    if (nmjabatan==1){
        val totalbayar1= Direktur()
        var totalgaji1= totalbayar1.gaji + (totalbayar1.tunjAnak * jumlahAnak) + (totalbayar1.makan * jmlpresensi)
        var totalpajak1= totalbayar1.pajakgaji * totalgaji1
        println("Total Gaji         : $totalgaji1")
        println("Pajak              : $totalpajak1")
    }
    else if (nmjabatan==2){
        val totalbayar2= Manager()
        var totalgaji2= totalbayar2.gaji + (totalbayar2.tunjAnak * jumlahAnak) + (totalbayar2.makan * jmlpresensi)
        var totalpajak2= totalbayar2.pajakgaji * totalgaji2
        println("Total Gaji     Rp. : $totalgaji2" )
        println("Pajak          Rp. : $totalpajak2")
    }
}
fun main() {
    daftarjabatan()
    println("Masukkan Nama            = ")
    val listnama = Scanner(System.`in`)
    var namapegawai = listnama.nextLine()
    println("Masukkan NIP             = ")
    val listnip = Scanner(System.`in`)
    var kodenip = listnip.nextInt()
    println("Masukkan Jumlah Anak     = ")
    val listanak = Scanner(System.`in`)
    var jmlanak = listanak.nextInt()
    println("Masukkan Jumlah Presensi = ")
    val listpresensi = Scanner(System.`in`)
    var jmlpresensi = listpresensi.nextInt()
    println("Masukkan nama jabatan (1/2)")
    val listjabatan = Scanner(System.`in`)
    var namajabatan = listjabatan.nextInt()
    println("Masukkan status (1/2)")
    val datajabatan = Scanner(System.`in`)
    var jabatan = datajabatan.nextInt()
    println("-------------------------")
    println("-------------------------")
    println("Nama             = $namapegawai ")
    println("NIP              = $kodenip")
    println("Jabatan          = $namajabatan")
    println("Status           = $jabatan")
    println("Jumlah anak      = $jmlanak")
    println("Jumlah presensi  = $jmlpresensi")
    println("------------------------")
    uas.totalgaji(namajabatan, jabatan, jmlanak, jmlpresensi)

}