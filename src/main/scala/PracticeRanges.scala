import scala.io.StdIn

object PracticeRanges {
  def main(args:Array[String]): Unit = {
    val r1 = 0 to 1000 by 17
    println(r1.toList)
    println(r1.length)

    println(s"Enter how many cats you have? ")
    val nbCats = StdIn.readLine().toInt

    val howMany = if (nbCats == 0)
      "No cats"
    else if (1 to 3 contains(nbCats))
      "Few cats"
    else if (4 to  6 contains(nbCats))
      "Several cats"
    else
      "Many"
    println(s"This person has ${howMany} .")
  }
}
