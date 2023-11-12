import scala.collection.mutable
object ChallengeMap {
  def main(args:Array[String]): Unit = {
    val attendance = mutable.HashMap("23/09" -> 3726, "24/09" -> 4735, "25/09" -> 2836)
    attendance += ("26/09"->5000)
    val total = attendance("25/09") + attendance("26/09")
    println(total)
    println(attendance.contains("22/09"))
  }

}
