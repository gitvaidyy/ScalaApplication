import scala.io.StdIn

object challengePatternMatching {
  def main(args:Array[String]): Unit = {
    println("Enter the current hour: ")
    val hour = StdIn.readLine().toInt
    hour match {
      case a if 6 to 11 contains(hour) => println("Morning")
      case b if 12 to 14 contains(hour)=> println("noon")
      case c if 15 to 17 contains(hour)=> println("afternoon")
      case d if 18 to 21 contains(hour)=> println("evening")
      case e if 22 to 5 contains(hour) => println("night")
      case _ => println("Good day")
    }

  }
}
