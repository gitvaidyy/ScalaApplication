import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object challengeWhileLoop {
  def main(args:Array[String]): Unit = {
    val userNames = ArrayBuffer("Johnson","Bob","Alice")
    var continue = true
    while (continue){
      println(s"Please enter your desired username:")
      val uName = StdIn.readLine()
      if (!userNames.contains(uName)) {
        userNames.addOne(uName)
        continue= false
      }
      else
        println(s"Your username already exists. Choose another")
    }
    println(s"$userNames")
  }
}
