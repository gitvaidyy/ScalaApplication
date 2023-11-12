import scala.io.StdIn

object practiceNestedWhileLoop {
  def main(args:Array[String]): Unit = {
    var number = 0
    while (number < 100) {
      println("Please enter a number: ")
      number = StdIn.readLine().toInt
    }
    println("Thank you for playing")
  }
}
