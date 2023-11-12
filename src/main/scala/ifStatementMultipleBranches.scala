import scala.io.StdIn

object ifStatementMultipleBranches {
  def main(args:Array[String]): Unit = {
    println(s"Please enter an animal:")
    val animal = StdIn.readLine()

    val action = if (animal == "dog")
      "pet it"
    else if (animal == "cat")
      "feed it"
    else if (animal == "crocodile")
      "run away"
    else
      "google it"

    println(action)
  }
}
