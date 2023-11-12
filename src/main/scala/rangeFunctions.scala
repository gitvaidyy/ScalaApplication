import scala.io.StdIn

object rangeFunctions {
  def main(args:Array[String]): Unit = {
    val r = 1 to 10 by 2
    println(s"Guess a number in the range.. ")
    val nb = StdIn.readLine().toInt
    if (r.contains(nb))
      println("Good guess")
    else
      println("Wrong")

    println(r.step)
    println(r.head)
    println(r.tail)
    println(r.last)
    println(r.end)
    println(r.indexOf(3))
    println(r.indexOf(4))
    println(r.length)
  }
}
