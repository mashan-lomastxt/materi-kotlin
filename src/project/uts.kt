package project

import java.util.*

fun daftarBarang() {
    val barang = listOf(
            7499000,
            5499000,
            5625000,
            15599000,
            18000000
    )
    println("==========================================")
    println("=     Nama : Riska Handika               =")
    println("=     Nim  : 19.12.1102                  =")
    println("==========================================")
    println("Daftar Barang :")
    println("1. Laptop Lenovo IP 330S Rp ${barang[0]}")
    println("2. Laptop Asus M409BA Rp ${barang[1]}")
    println("3. Laptop HP 14s Celeron Rp ${barang[2]}")
    println("4. Laptop Dell XPS Rp ${barang[3]}")
    println("5. Laptop Acer Nitro 16 Rp ${barang[4]}")
}

fun totalBarang(pilihan: Int, jumlah: Int): Int {
    val barang = listOf(
            7499000,
            5499000,
            5625000,
            15599000,
            18000000
    )

    return barang[pilihan-1] * jumlah
}


fun main() {
    val reader = Scanner(System.`in`)
    var again = "y"
    while (again == "y") {

        daftarBarang()

        print("\nMasukkan pilihan barang (angka): ")
        val pilihan = reader.nextInt()
        print("Masukkan jumlah barang: ")
        val jumlah = reader.nextInt()

        print("\nTotal harga: ${totalBarang(pilihan, jumlah)}")

        print("\nApakah ingin transaksi lagi y/n: ")
        again = reader.next()
    }
}