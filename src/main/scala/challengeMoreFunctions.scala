import scala.io.StdIn

object challengeMoreFunctions {
  def main(args:Array[String]): Unit = {
    println(s"Please enter an animal name: ")
    val animal = StdIn.readLine()
    val estimatedLifespan = lifeSpan(animal)
    println(s"Estimated lifespan of $animal is $estimatedLifespan")
  }
  def lifeSpan(animal:String):String={
    animal match {
      case "cats" => s"15"
      case "dogs" => s"10"
      case "rabbit" => s"12"
      case _ => s"20"
    }
  }
}
