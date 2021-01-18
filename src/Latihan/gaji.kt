package Latihan

abstract class Pegawai() {
    abstract fun gaji() : Double
}

class Tetap(val tetap: Double, val tunjangan: Double, val bonus: Double): Pegawai() {
    override fun gaji(): Double {
        return tetap + tunjangan + bonus
    }
}

class Kontrak(val tetap: Double, val tunjangan: Double, val lembur: Double): Pegawai() {
    override fun gaji(): Double {
        return tetap + tunjangan + lembur
    }
}

fun main() {
    val t = Tetap(10000.0, 20000.0, 30000.0)
    println("gaji tetap ${t.gaji()}")
    val k = Kontrak(10000.0, 20000.0, 40000.0)
    println("gaji kontrak ${k.gaji()}")
}