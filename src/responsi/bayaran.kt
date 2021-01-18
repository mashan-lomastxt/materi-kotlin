/*package responsi

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
class Direktur : gajiPegawai {
    override val jabatan: String = "Direktur"
    override val gaji: Int = 10000000
    override val tunjAnak: Int = 700000
    override val makan: Int = 85000
    override val transport: Int = 500000
    override val tunjJabatan: Int = 2500000
    override val pajakgaji: Float= 0.05F
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
public fun totalgaji (pilih:Int,jumlahAnak: Int, presensi: Int){
    if (pilih==1){
        val totalbayar= Direktur()
        var totalgaji1= totalbayar.gaji + (totalbayar.tunjAnak * jumlahAnak) + (totalbayar.makan * presensi) + totalbayar.transport + totalbayar.tunjJabatan
        var totalpajak= totalbayar.pajakgaji * totalgaji1
        println("Total Gaji         : $totalgaji1")
        println("Pajak              : $totalpajak")
    }
    else if (pilih==2){
        val totalbayar= Manager()
        var totalgaji2= totalbayar.gaji + (totalbayar.tunjAnak * jumlahAnak) + (totalbayar.makan * presensi) + totalbayar.transport + totalbayar.tunjJabatan
        var totalpajak2= totalbayar.pajakgaji * totalgaji2
        println("Total Gaji         : $totalgaji2" )
        println("Pajak              : $totalpajak2")
    }
}
fun main() {
    println("Daftar Jabatan =>")
    println("1. Direktur")
    println("2. Manager")
    println("========================")
    println("Masukkan Nama          =")
    val listnama = Scanner(System.`in`)
    var Nama = listnama.nextLine()
    println("Masukkan NIP         =")
    val listnip = Scanner(System.`in`)
    var Nip = listnip.nextInt()
    println("Masukkan Jumlah Anak   =")
    val listanak = Scanner(System.`in`)
    var anak = listanak.nextInt()
    println("Masukkan Jumlah Presensi=")
    val listpresensi = Scanner(System.`in`)
    var presensi = listpresensi.nextInt()
    println("Masukkan nama jabatan (1/2)")
    val listjabatan = Scanner(System.`in`)
    var jabatan = listjabatan.nextInt()
    println("-------------------------")
    println("-------------------------")
    print("Nama             =$Nama")
    print("NIP              =$Nip")
    if (jabatan==1) {
        val pilih3 = Direktur()
        println("Jabatan              = ${pilih3.jabatan}" )
    }
    else if (jabatan==2){
        val pilih4 = Manager()
        println("Jabatan              = ${pilih4.jabatan}" )
    }
    println("Jumlah anak            =$anak")
    println("Jumlah presensi        =$presensi")
    println("------------------------")
    totalgaji(jabatan,anak,presensi)

}*/