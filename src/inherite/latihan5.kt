package inherite
//pewarisan

open class Manusia3() {
    open var umur: Int = 0
        get() = field

        set(value) {
            field = value
        }
}

class Dosen3: Manusia3() {
    override var umur: Int = 0
        get() = field

        set(value) {
            field = value - 5
        }
}

fun main() {
    val dosen = Dosen3()
    dosen.umur = 31
    println("Umur saya pada 5 tahun yang lalu adalah ${dosen.umur} tahun")
}