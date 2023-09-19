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
open class AllRounder(
    override val name: String,
    override var age: Int,
    override val nationality: String,
    override var wickets: Int,
    override var bowlerRanking: Int,
    override var score: Int,
    override var batsmanRanking: Int,
    private var ranking: Int
) : Bowler, Batsman {
    override fun getRanking(): Int {
        return ranking
    }
    override fun print() {
        super<Bowler>.print()
        super<Batsman>.print()
        println("Allrounder Ranking: ${getRanking()}")
    }

}
fun main()
{
    val allRounder = AllRounder("Shahid Afridi", 39, "Pakistani", 108, 10, 3490, 2,1)
    allRounder.print()
}
