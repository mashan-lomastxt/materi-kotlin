package uas

import java.util.*

interface gaji {
    val jabatan: String
    val tunjanganistri: Int
    val gajipokok: Int
    val uangmakan: Int
    val tunjangananak: Int
    val pajak: Float
}
class gajidirektur : gaji{
    override val jabatan: String = "Direktur"
    override val gajipokok: Int = 10000000
    override val tunjanganistri: Int = 700000
    override val uangmakan: Int = 85000
    override val tunjangananak: Int = 2500000
    override val pajak: Float= 0.05F
}
class gajimanager : gaji{
    override val jabatan: String = "Manager"
    override val gajipokok: Int = 7000000
    override val tunjanganistri: Int = 600000
    override val uangmakan: Int = 65000
    override val tunjangananak: Int = 1500000
    override val pajak: Float= 0.05F
}

fun totalgaji (pilih:Int,state:Int,jmlhanak: Int, presensi: Int){
    if (pilih==1){
        if (state==1) {
            val bantu = gajidirektur()
            var totalgaji =
                    bantu.gajipokok + (bantu.uangmakan * presensi)
            var totalpajak = bantu.pajak * totalgaji
            println("Total Gaji         : $totalgaji")
            println("Pajak              : $totalpajak")
        }
        else if (state==2){
            val bantu = gajimanager()
            var totalgaji =
                    bantu.gajipokok + (bantu.uangmakan * presensi) + (bantu.tunjangananak * jmlhanak) + bantu.tunjanganistri
            var totalpajak = bantu.pajak * totalgaji
            println("Total Gaji         : $totalgaji")
            println("Pajak              : $totalpajak")
        }
    }
    else if (pilih==2){
        if (state==1){
            val bantu= gajimanager()
            var totalgaji =
                    bantu.gajipokok + (bantu.uangmakan * presensi)
            var totalpajak = bantu.pajak * totalgaji
            println("Total Gaji         : $totalgaji")
            println("Pajak              : $totalpajak")
        }
        else if (state==2){
            val bantu= gajimanager()
            var totalgaji =
                    bantu.gajipokok + (bantu.uangmakan * presensi) + (bantu.tunjangananak * jmlhanak) + bantu.tunjanganistri
            var totalpajak = bantu.pajak * totalgaji
            println("Total Gaji         : $totalgaji")
            println("Pajak              : $totalpajak")
        }
    }
}
fun daftar() {
    println("Kode Angka Jabatan:")
    println("[1] Direktur")
    println("[2] Manager")
    println(" ")
    println("Kode Angka Status:")
    println("[1] Lajang")
    println("[2] Menikah")

}
fun main() {
    daftar()
    println("Masukkan Nama          =")
    val datanama = Scanner(System.`in`)
    var nama = datanama.nextLine()
    println("Masukkan NIP         =")
    val datanip = Scanner(System.`in`)
    var nip = datanip.nextInt()
    println("Masukkan Jumlah Anak   =")
    val dataanak = Scanner(System.`in`)
    var anak = dataanak.nextInt()
    println("Masukkan Jumlah Presensi=")
    val datapresensi = Scanner(System.`in`)
    var presensi = datapresensi.nextInt()
    println("Masukkan nama jabatan (1/2)")
    val datastatus = Scanner(System.`in`)
    var status = datastatus.nextInt()
    println("Masukkan status (1/2)")
    val datajabatan = Scanner(System.`in`)
    var jabatan = datajabatan.nextInt()
    println("-------------------------")
    println("-------------------------")
    println("Nama             =$nama ")
    println("NIP              =$nip")
    println("Jabatan [angka]  =$jabatan")
    println("Status [angka]   =$status")
    println("Jumlah anak            =$anak")
    println("Jumlah presensi        =$presensi")
    println("------------------------")
    totalgaji(jabatan,status,anak,presensi)

}