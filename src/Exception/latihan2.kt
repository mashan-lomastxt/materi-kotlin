package Exception

fun main(){
    try{
        var num = 10 / 0
    }
    catch (e: ArithmeticException){
        // caught and handles it
        println("Maaf, Tidak diijinkan bilangan pembagi adalah: 0")
    }
}