import scala.io.StdIn

object practiceFunctions {
  def main(args:Array[String]): Unit = {
    for (i <- 1 to 10)
      hello()
    for (i<- 1 to 3)
      multiplyBy17()
  }
  private def hello(): Unit = {
    println("Hello..")
  }
  private def multiplyBy17(): Unit = {
    println(s"Please enter a number: ")
    val number = StdIn.readLine().toInt
    val result = number * 17
    println(s"The result of $number is $result")
  }
}
