import scala.io.StdIn

object practicePatternMatching2 {
  def main(args:Array[String]): Unit = {
    println("Enter your name: ")
    val name = StdIn.readLine()
    name(0) match {
      case 'A'|'B'|'C' => println(s"Hello ${name} welcome")
      case x if 'D' to 'H' contains(name(0)) => println(s"Hi ${name} how are you?")
      case _ => println("Hi..")
    }
  }
}
