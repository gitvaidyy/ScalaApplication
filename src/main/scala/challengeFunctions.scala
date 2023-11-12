import scala.io.StdIn
import java.time.LocalDate

object challengeFunctions {
  def main(args:Array[String]): Unit = {
    userAge()
  }
  private def userAge(): Unit = {
    println(s"Enter your name: ")
    val name = StdIn.readLine()
    println(s"Enter your year of birth: ")
    val year = StdIn.readLine().toInt
    val currentYear = LocalDate.now.getYear
    val age = currentYear - year
    println(s"Hi $name, your age is $age")
  }
}
