import scala.io.StdIn

object practiceNestedWhileLoop2 {
  def main(args:Array[String]): Unit = {
    var number = 0
    var factorial = 1
    while (factorial < 3_000_000){
      println("Enter a number: ")
      number = StdIn.readLine().toInt
      factorial = 1
      var i = 1
      while (i <= number){
        factorial *= i
        i += 1
      }
      println(s"Factorial $number is $factorial"  )
    }
  }
}
