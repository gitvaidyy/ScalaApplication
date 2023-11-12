import scala.io.StdIn

object challengeRanges {
  def main(args:Array[String]): Unit = {
    println(s"Please enter number from 1 to 12:")
    var month = StdIn.readLine().toInt
    if (month < 1 || month > 12)
      month = 1
    val waterFreq = 3
    val days = if (month == 2)
      28
    else if (List[Int](1,3,5,7,8,10,12).contains(month))
      31
    else
      30
    println((1 to days by waterFreq).toList)

  }
}
