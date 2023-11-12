import scala.io.StdIn

object ifStatements {
  def main(args: Array[String]): Unit = {
    //val night = true
    println("Input a boolean value. Ist it night time? (true/false): ")
    val night = StdIn.readLine().toBoolean

    if (night)
      println("Sleep. Its night time.")
    else
      println("Be active. Its day time")

    println(s"Please enter the funds amount: ")
    var clientFunds = StdIn.readLine().toInt
    val price = 50
    var clientProduct = 0

    if (clientFunds >= price) {
      clientFunds == price
      clientProduct += 1
      println(s"You have purchased $clientProduct")
      println(s"You have $$${clientFunds}")
    }else {
      println(s"You have insufficient funds")
    }
    }
}
