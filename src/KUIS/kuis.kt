package KUIS

class Calc(val angkaSatu: Double, val angkaDua: Double) {

    fun tambah() {
        println("Hasil Pertambahan : ${angkaSatu+angkaDua}")
    }
    fun kurang() {
        println("Hasil Pengurangan : ${angkaSatu-angkaDua}")
    }
    fun bagi() {
        println("Hasil Pembagian : ${angkaSatu/angkaDua}")
    }
    fun kali() {
        println("Hasil Perkalian : ${angkaSatu*angkaDua}")
    }

    fun hasil() {
        this.tambah()
        this.kurang()
        this.bagi()
        this.kali()
    }
}

fun main() {
    val hitung = Calc(60.0, 20.0)
    hitung.hasil()
}