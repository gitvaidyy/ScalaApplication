import scala.io.StdIn

object Expressions {
  def main(args:Array[String]): Unit = {
    if (326 / 72 * 15 + 93 % 13 == 65)
      println("Math is hard")
    else
      println("Math is easy")

    val haveCat = true
    val haveCatFood = true
    if (haveCat && haveCatFood)
      println("Cat is happy")
    else
      println("Oh ! noo")

    val age = StdIn.readLine().toInt
    if (age >= 18)
      println("Can drink alcohol")
    else
      println("Its illegal to drink alcohol")
  }
}
