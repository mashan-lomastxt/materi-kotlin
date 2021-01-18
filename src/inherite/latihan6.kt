package inherite
//pewarisan

open class Manusia4() {
    open fun tampilUmur(umur: Int) {
        println("Umur saya $umur tahun")
    }
}

class Dosen4: Manusia4() {
    override fun tampilUmur(umur: Int) {

        super.tampilUmur(umur)

        println("Umur saya pada 5 tahun yang lalu adalah ${umur - 5} tahun")
    }
}

fun main() {
    val dosen = Dosen4()
    dosen.tampilUmur(31)
}