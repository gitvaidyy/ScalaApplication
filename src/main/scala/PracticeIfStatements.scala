import scala.io.StdIn

object PracticeIfStatements {
  def main (args:Array[String]): Unit = {
    //println(s"Enter whether the user has car key or not (True / False): ")
    //val hasCarKey = StdIn.readLine().toBoolean
//    var hasCarKey = false
//    println(s"Do you have the keys (yes/no) ? ")
//    val input = StdIn.readLine()
//    if (input == "yes") {
//      hasCarKey = true
//    }
//    else {
//      hasCarKey = false
//    }
//    if (hasCarKey){
//      println(s"Start the car")
//    }
//    else {
//      println(s"You need the key to start the car")
//    }
    println(s"Enter the current time, only hour: ")
    val input = StdIn.readLine()
    try {
      val hour = input.toInt
      if (hour < 12) {
        println(s"Its am")
      }
      else {
        println(s"Its pm")
      }
    }
    catch {
      case e:NumberFormatException =>
        println(s"Cannot read the number")
        e.printStackTrace()
    }
  }
}
