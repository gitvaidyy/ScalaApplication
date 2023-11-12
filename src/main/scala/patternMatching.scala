import scala.io.StdIn
import scala.util.Random

object patternMatching {
  def main(args:Array[String]): Unit = {
    println(s"Type an animal: ")
    val input = StdIn.readLine()

    var action = ""
    input match {
      case "dog" => action = "pet it"
      case "cat" => action = "feed it"
      case "crocodile" => action = "run away"
      case _ => action = "google it"
    }
    println(s"when you see a ${input} you $action")

    val number = Random.nextInt(100)

    number % 2 match {
      case 0 => println(s"$number is even")
      case 1 => println(s"$number is odd")
    }
  }
}
