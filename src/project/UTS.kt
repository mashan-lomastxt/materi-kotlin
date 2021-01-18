package project

import java.util.*

object kasir {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val barang : Int
        val harga : Int
        val jumlah : Int
        val total : Int
        println("Nama : Triko Prasetyo ")
        println("Nim  : 19.12.1009 ")
        println("==========================================")
        println("Daftar Barang :")
        println("1. Daging Slice 250gr")
        println("2. Daging Slice Lemak 250gr")
        println("3. Daging Has Dalam 1Kg")
        println("4. Daging nomer 1 1Kg")
        println("5. Bakso Nomer 1 1KG")
        println("______________")
        print("Masukan Pilihan Barang : ")
        barang = input.nextInt()
        when (barang) {
            1 -> {
                harga = 37000
            }
            2 -> {
                harga = 30000
            }
            3 -> {
                harga = 135000
            }
            4 -> {
                harga = 130000
            }
            5 -> {
                harga = 120000
            }
            else -> {
                harga = 0
            }
        }
        print("Masukan Jumlah barang  : ")
        jumlah = input.nextInt()
        total = (harga*jumlah)
        println("______________")
        println("total Harga : $total")

    }
}