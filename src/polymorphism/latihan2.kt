package polymorphism

fun tampilBilangan(n: Number){
    println("Tampil Bilangan Menggunakan (n: Number) = $n")
}

fun tampilBilangan(n: Int){
    println("Tampil Bilangan Menggunakan (n: Int) = $n")
}

fun tampilBilangan(n: Double){
    println("Tampil Bilangan Menggunakan (n: Double) = $n")
}

fun sum(bilangan: List<Number>): Number{
    return bilangan.sumByDouble { it.toDouble() }
}

fun main(){
    val a : Number = 99
    val b = 1
    val c = 3.1

    //using compile time polymorphism
    tampilBilangan(a)
    tampilBilangan(b)
    tampilBilangan(c)

    //Using runtime polymorphism
    print("Total Penjumlahan Bilangan = ")
    println(sum(listOf(a, b, c)))
}