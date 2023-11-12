import scala.io.StdIn

object practiceWhileLoop {
  def main(args:Array[String]): Unit = {
    var j = 1
    while (j < 11) {
      println(s"#$j Hello, How are you?")
      j += 1
    }

    val cats = List("Tiger","Smokey","Sassy","Patch","Sammy")
    var i = 0
    while (i < cats.length) {
      println(s"Hello ${cats(i)} !")
      i += 1
    }

    println(s"Please enter a number: ")
    val number = StdIn.readLine().toInt
    var k = 1
    var result: Long = 1L
    while (k <= number) {
      result *= k
      k += 1
    }
    println(s"$number! = $result ")
  }
}
