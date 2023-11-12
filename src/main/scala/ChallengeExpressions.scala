import scala.io.StdIn

object ChallengeExpressions {
  def main(args:Array[String]): Unit = {
    try{
      println(s"Please enter your age: ")
      val age = StdIn.readLine().toInt
      if (age == 0) age == 1
      if (age < 13)
        println("child")
      else if (age > 13 && age < 18)
        println("teen")
      else
        println("adult")
    }
    catch {
      case exception: Exception =>{
        println(s"Not a number")
        exception.printStackTrace()
      }
    }
  }
}
