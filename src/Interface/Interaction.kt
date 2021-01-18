package Interface

interface Interaction {
    val name : String
    fun Sayhello (name : String)
}

class Human (override val name : String): Interaction{
    override fun Sayhello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }
}