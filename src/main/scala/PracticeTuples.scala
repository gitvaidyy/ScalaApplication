object PracticeTuples {
  def main (args:Array[String]): Unit = {
    val userInfo = ("Alex", "alex@gmail.com", 273615)
    println(userInfo._1, userInfo._3)
    val spendingAmt = (userInfo._1, userInfo._3,5000)
    println(spendingAmt)
  }

}
