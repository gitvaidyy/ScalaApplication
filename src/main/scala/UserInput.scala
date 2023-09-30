import scala.io.StdIn
import scala.util.Random

object UserInput {
  def main(args:Array[String]): Unit ={
    println("Type Something:")
    val input = StdIn.readLine()
    println(input)

    val number = input.toInt
    println(number*2)

    println(Random.nextInt())
    println(Random.nextInt(100))

    //Random.nextString() is not advised at it mostly generates chinese characters
    println(Random.nextPrintableChar())
    println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
  }

}
