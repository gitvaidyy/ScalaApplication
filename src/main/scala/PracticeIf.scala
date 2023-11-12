import scala.io.StdIn

object PracticeIf {
  def main(args:Array[String]): Unit = {
    println(s"Enter a number: ")
    val input = StdIn.readLine().toInt
    val isSingleDigit = if (input <10) "Its a single digit number" else "No, its not"
    println(isSingleDigit)
  }
}
