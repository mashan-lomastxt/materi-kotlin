package KUIS

abstract class Pegawai() {
    abstract fun gaji() : Double
}

class Tetap(val tetap: Double, val tunjangan: Double, val komisi: Double): Pegawai() {
    override fun gaji(): Double {
        return tetap + tunjangan + komisi
    }
}

class Kontrak(val tetap: Double, val tunjangan: Double, val lembur: Double): Pegawai() {
    override fun gaji(): Double {
        return tetap + tunjangan + lembur
    }
}

fun main() {
    println("--------------------")
    println("Nama : Riska Handika")
    println("Nim  : 19.12.1102")
    println("--------------------")
    val t = Tetap(1500000.0, 250000.0, 50000.0)
    println("==============================")
    println("Gaji Tetap Sebesar ${t.gaji()}")
    println("==============================")
    val k = Kontrak(1000000.0, 200000.0, 75000.0)
    println("Gaji Kontrak Sebesar ${k.gaji()}")
    println("==============================")
}