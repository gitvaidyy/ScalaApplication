import scala.io.StdIn

object practiceExpressions {
  def main(args:Array[String]): Unit = {
//    val guestLists = List("Johnson","Alice","Bob","Carol")
//    println(s"Please enter your name:")
//    val guest = StdIn.readLine()
//    if (guestLists.contains(guest))
//      println(s"Hi ${guest}, please come in")
//    else
//      println(s"Sorry you are not on the guest list.")

    val animals = List("cat","dog")
    if (animals.isEmpty)
      println(s"Thank you for going home to all our pets")
    else
      println(s"Please come in and adopt a pet. we have ${animals}")
  }
}
