import scala.io.StdIn

object practicePatternMatching {
  def main(args: Array[String]): Unit = {
    println(s"How many meals a day do you have per day ? ")
    val meals = StdIn.readLine().toInt
    meals match {
      case x if 0 to 2 contains (meals) => println(s"You should eat more.")
      case 3 => println(s"Its perfect")
      case _ => println(s"You should eat less")
    }
  }
}
