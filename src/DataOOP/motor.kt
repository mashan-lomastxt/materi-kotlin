package DataOOP

class Motor(CMerk : String , CTahun : Int){
    var PMerk: String =CMerk
    var PTahun: Int =CTahun
}
fun main(){
    val Honda = Motor( CMerk= "Supra-X", CTahun = 2010 )

    println("Motor Merk: "+Honda .PMerk)
    println("Motor Tahun: "+Honda .PTahun)
}
