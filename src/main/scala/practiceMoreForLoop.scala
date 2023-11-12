import scala.io.StdIn

object practiceMoreForLoop {
  def main(args:Array[String]): Unit = {
//    println(s"Please enter a number: ")
//    val maxValue = StdIn.readLine().toInt
//    for (i <- maxValue to 0 by -1; if i%7 == 0 ) {
//      println(s"$i\t")
//    }

    for (i <- 1 to 10)
      for (j <- 1 to i)
        print("\uD83D\uDE00")
      println()
  }
}
