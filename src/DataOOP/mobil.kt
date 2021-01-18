package DataOOP

/*class Mobil{
}
fun main(){
    val Toyota = Mobil()
    println(Toyota)
} */
//properties

class Mobil {
    var merk:String ="Avanza"
    var tahun:Int =2020
}
fun main(){
    val Toyota = Mobil()
    Toyota.merk = "Yaris"
    Toyota.tahun= 2019
    println("Mobil merk : "+ Toyota.merk)
    println("Mobil tahun : "+ Toyota.tahun)
}