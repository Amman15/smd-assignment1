open class Cricketer(val name: String, val age: Int, val nationality: String) {
    open fun print() {
        println("Name: $name, Age: $age, Nationality: $nationality")
    }
}

fun main(){
    val Player = Cricketer("Babar", 28, "Pakistani")
    Player.print()
}