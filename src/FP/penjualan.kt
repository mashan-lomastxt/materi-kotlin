package FP

import java.util.*

interface Sepatu{
    val nama    : String
    val kualitas : String
    val harga   : Int
}

class Nike : Sepatu{
    override val nama: String = "Nike Air Monarch Training Shoes"
    override val kualitas: String = "Original"
    override val harga: Int = 2500000
}

class Adidas : Sepatu{
    override val nama: String = "Adidas Campus Shoes"
    override val kualitas: String = "Second"
    override val harga: Int = 500000
}

class Converse : Sepatu{
    override val nama: String = "Converse All Star"
    override val kualitas: String = "Original"
    override val harga: Int = 1300000
}

class Rebook : Sepatu{
    override val nama: String = "Rebook Retro Running"
    override val kualitas: String = "Second"
    override val harga: Int = 650000
}

class Vans : Sepatu{
    override val nama: String = "Vans Classic Tumble Old Skool"
    override val kualitas: String = "Original"
    override val harga: Int = 1500000
}

class Kodachi : Sepatu{
    override val nama: String = "Kodachi Warrior"
    override val kualitas: String = "Original"
    override val harga: Int = 300000
}
fun daftar (){
    println("=====================")
    println("Pilih Jenis Sepatu : ")
    println("=====================")
    val namasepatu = listOf("Null","Nike","Adidas","Converse","Rebook","Vans","Kodachi")
    namasepatu.forEachIndexed{
        index, t ->  println("$index -> $t")
    }
    println("Pilih => ")
}
fun daftarbarang (angka2 :Int){
    if(angka2==1){
        val pilihan = Nike()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
    else if (angka2==2){
        val pilihan = Adidas()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
    else if (angka2==3){
        val pilihan = Converse()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
    else if (angka2==4){
        val pilihan = Rebook()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
    else if (angka2==5){
        val pilihan = Vans()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
    else if (angka2==6){
        val pilihan = Kodachi()
        println("Nama : ${pilihan.nama}")
        println("Kualitas : ${pilihan.kualitas}")
        println("Harga : ${pilihan.harga}")
    }
}
fun total(milih: Int){
    println("Masukkan Jumlah Barang => ")
    var datajumlah = Scanner(System.`in`)
    var jumlah = datajumlah.nextInt()
    if (milih==1) {
        val bantu= Nike()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
    else if (milih==2) {
        val bantu= Adidas()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
    else if (milih==3) {
        val bantu= Converse()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
    else if (milih==4) {
        val bantu= Rebook()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
    else if (milih==5) {
        val bantu= Vans()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
    else if (milih==6) {
        val bantu= Kodachi()
        var totalharga = jumlah* bantu.harga;
        println("Total harga = $totalharga")
    }
}
fun main(){
    daftar()
    var data = Scanner(System.`in`)
    var angka = data.nextInt()
    daftarbarang(angka)
    total(angka)
    println("Lanjutkan Pembelian ? [y/t]")
    var datajawab = Scanner(System.`in`)
    var jawab = datajawab.nextLine()
    if (jawab=="y" || jawab =="Y"){
        main()
    }
    else {
        println("Terima kasih telah Berbelanja di TOKO kami")
    }
}