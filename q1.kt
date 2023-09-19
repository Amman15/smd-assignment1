interface Cricketer
{
    val name: String
    val age: Int
    val nationality: String
    open fun print() {
        println("Name of cricketer: $name")
        println(" Age: $age")
        println("Nationality: $nationality")
    }
}
interface Bowler : Cricketer
{
    var bowlerRanking : Int
    var wickets : Int
    open fun getRanking(): Int {
        return bowlerRanking
    }
    open override fun print() {
        println("Wickets taken: $wickets")
        println("Bowler Ranking: $bowlerRanking")
    }
}
interface Batsman : Cricketer
{
    var batsmanRanking : Int
    var score: Int
    open fun getRanking(): Int {
        return batsmanRanking
    }
    open override fun print() {
        super.print()
        println("Runs scored: $score")
        println("Batter Ranking: $batsmanRanking")
    }
}

fun main()
{

}
