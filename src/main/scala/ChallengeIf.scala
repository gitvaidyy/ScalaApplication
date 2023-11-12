import scala.io.StdIn

object ChallengeIf {
  def main (args:Array[String]): Unit = {
    println(s" Enter the student exam points: ")
    val points = StdIn.readLine().toInt

    val grade = if (points >= 90 && points < 100)
      "Grade A"
    else if (points >= 80 && points <89)
      "Grade B"
    else if (points >= 70 && points <79)
      "Grade C"
    else if (points >= 60 && points <69)
      "Grade D"
    else if ((points >= 50 && points <59))
      "Grade E"
    else
      "everything else"

    println(grade)
  }
}
