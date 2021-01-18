package Interface

interface Mahasiswa1 {
    //Properti dengan implementasi pengaksesan
    val nama: String
        get() = "Budi"
}

class ImplemntMahasiswa1 : Mahasiswa1{
    //Class body
}

fun main() {
    val obj = ImplemntMahasiswa1()

    println(obj.nama)
}