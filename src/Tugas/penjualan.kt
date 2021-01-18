package Tugas

import java.util.*

interface Sparepart{
    val nama    : String
    val harga   : Int
}

class Monitor : Sparepart{
    override val nama: String = "Samsung LC24F390"
    override val harga: Int = 1620000
}

class Keyboard : Sparepart{
    override val nama: String = "Nubwo NK-32 Fortune"
    override val harga: Int = 200000
}

class Mouse : Sparepart{
    override val nama: String = "Predator Cestus 320"
    override val harga: Int = 350000
}

fun main(){
    var data = Scanner(System.`in`)
    println("Pilih Sparepart")
    println("1.Monitor")
    println("2.Keyboard")
    println("3.Mouse")
    println("Pilih : ")
    var angka = data.nextInt()
    if(angka==1){
        val pilihan = Monitor()
        println("Nama : ${pilihan.nama}")
        println("Harga : ${pilihan.harga}")
    }
    else if(angka==2){
        val pilihan = Keyboard()
        println("Nama : ${pilihan.nama}")
        println("Harga : ${pilihan.harga}")
    }
    else if(angka==3){
        val pilihan = Mouse()
        println("Nama : ${pilihan.nama}")
        println("Harga : ${pilihan.harga}")
    }
}