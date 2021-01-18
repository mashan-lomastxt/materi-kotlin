package project

import java.util.Scanner

fun nilaiAngka(a: Double, b: Double, c: Double, d: Double) : Double {
    return (a * 0.15) + (b * 0.2) + (c * 0.3) + (d * 0.35)
}

fun nilaiHuruf(a: Double) : String {
    val n: String
    val b = a.toInt()
    if ((b<=100)&&(b>=81)){
        n = "Grade Nilai Anda : A"
    } else if((b<=80)&&(b>=61)){
        n = "Grade Nilai Anda : B"
    } else if((b<=60)&&(b>=41)){
        n = "Grade Nilai Anda : C"
    } else if((b<=40)&&(b>=21)){
        n = "Grade Nilai Anda : D"
    } else {
        n = "Grade Nilai Anda : E"
    }

    return n
}

fun main() {
    val reader = Scanner(System.`in`)
    val nama:String
    val nim:String
    val tugas:Double
    val res:Double
    val mid:Double
    val uas:Double

    print("Masukkan Nama Mahasiswa : ")
    nama = readLine().toString()
    print("Masukkan Nim Mahasiswa : ")
    nim = readLine().toString()
    print("Nilai Tugas : ")
    tugas = reader.nextDouble()
    print("Nilai Responsi : ")
    res = reader.nextDouble()
    print("Nilai MID : ")
    mid = reader.nextDouble()
    print("Nilai UAS : ")
    uas = reader.nextDouble()

    println("Nama Mahasiswa\t: $nama")
    println("Nim Mahasiswa\t: $nim")
    val nilaiA = nilaiAngka(tugas, res, mid, uas)
    println("Nilai Anda : $nilaiA")
    val nilaiH = nilaiHuruf(nilaiA)
    println("Grade Nilai Anda : $nilaiH")
}