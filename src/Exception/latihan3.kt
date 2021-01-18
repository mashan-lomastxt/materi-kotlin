package Exception

fun test(a: Int, b: Int): Any {
    return try{
        a/b
        //println("The Result is: "+ a/b)
    }

    catch (e:Exception){
        println(e)
        "Maaf Tidak diijinkan bilangan pembagi adalah 0"
    }
}

fun main(){
    //invoke test function
    var result1 = test(a = 10, b = 2) //execute try block
    println(result1)
    var result = test(a = 10, b = 8) //execute catch block
    println(result)
}