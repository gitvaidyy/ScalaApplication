import scala.io.StdIn

object ChallengeIfStatement {
  def main(args:Array[String]): Unit = {
    println(s"")
    var hasEggs = false // Read user input
    var hasBacon = false // Read user input

    println(s"Does the market has eggs? ")
    val inputEggs = StdIn.readLine()
    if (inputEggs == "yes")
      hasEggs = true

    println(s"Does the market has bacon? ")
    val inputBacon = StdIn.readLine()
    if (inputBacon == "yes")
      hasBacon = true

    val eggPrice = 5
    val baconPrice = 20
    var total = 0

    if (hasEggs) {
      total += eggPrice * 12
      if (hasBacon)
        total += baconPrice * 20
      else
        println(s"No bacon available")
    }
    else {
      println(s"No eggs available")
    }
    println(total)
  }
}
