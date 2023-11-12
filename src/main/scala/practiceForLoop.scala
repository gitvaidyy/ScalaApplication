object practiceForLoop {
  def main(args:Array[String]): Unit = {
    for (x <- 1 to 10)
      println(s"$x: How are you?")
    var sum = 0
    for (x <- 1 to 100) {
      sum = sum + x
    }
    println(sum)

    val customers = Map("Alice"->4, "Judy"->8, "Anna"->6)
    for (customerName <- customers.keys) {
      val purchases = customers(customerName)
      println(s"$customerName your purchased $purchases values")
    }
  }
}
