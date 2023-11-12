import scala.io.StdIn

object challengeLocalFunctions {
  def main(args:Array[String]): Unit = {
    printGreeting()
  }
  private def printGreeting(): Unit = {
    def sayHi(name:String): Unit = println(s"Hi $name How are you? ")

    var currentName = "abc"
    while (!currentName.isEmpty){
      println(s"Please enter a name: ")
      currentName = StdIn.readLine()
      if (currentName.isEmpty){
        println(s"Finishing execution")
      } else {
        sayHi(currentName)
      }
    }
  }

}
