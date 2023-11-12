import scala.io.StdIn

object moreMatching {
  def main(args:Array[String]): Unit = {
    println("Type a animal: ")
    val input = StdIn.readLine()

    val action = input match {
      case "dog" | "hamster" | "rabbit" =>"pet it"
      case "cat" =>"feed it"
      case _ => "google it"
    }
    println(action)

    val number = List(1,2,3)
    number match {
      case List(1,2,3) => println("Single digit")
      case List(10,11,12) => println("Double digit")
      case _ => println("Unknown")
    }

    val animalFeed = ("cat","cat food")
    animalFeed match {
      case ("cat",_) => println("Cat info")
      case ("dog",_) => println("Dog info")
      case _ => println("random tuple")
    }
  }
}
