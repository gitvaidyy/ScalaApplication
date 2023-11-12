import scala.collection.mutable.ArrayBuffer

object BooleanFunctions {
  def main(args:Array[String]): Unit = {
    val animals = ArrayBuffer[String]()
    if (animals.isEmpty)
      animals.addOne("dog")
    println(animals)

    val animals2 = List("dog","cat","elephant")
    if (animals2.startsWith(List("dog")))
      println(s"I love dogs")

    val pet = "My cat's name is whiskers and she is mischevious"
    if (pet.startsWith("My cat")) {
      println(s"Hello kitty")
    }
  }
}
