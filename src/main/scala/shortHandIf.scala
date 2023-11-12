import scala.io.StdIn

object shortHandIf {
  def main(args:Array[String]): Unit = {
    println(s"Enter a number: ")
    val number = StdIn.readLine().toInt
    var isEven:String = null

    isEven = if (number%2 ==0) "Number is Even" else "Number is odd"
    println(isEven)
  }
}
