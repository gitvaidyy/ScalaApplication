import scala.io.StdIn

object challengeForLoop {
  def main(args:Array[String]): Unit = {
    println(s"Please input a year: ")
    val year = StdIn.readLine().toInt
    for (i <- 1 to 12) {
      val message = i match {
        case 1 => "Jan has 31 days"
        case 2 => if (year%4==0) "Feb has 29 days" else "Feb has 28 days."
        case 3 => "Mar has 31 days"
        case 4 => "Apr has 30 days"
        case 5 => "May has 31 days"
        case 6 => "Jun has 30 days"
        case 7 => "Jul has 31 days"
        case 8 => "Aug has 31 days"
        case 9 => "Sep has 30 days"
        case 10 => "Oct has 31 days"
        case 11 => "Nov has 30 days"
        case 12 => "Dec has 31 days"
      }
      println(message)
    }
  }
}
