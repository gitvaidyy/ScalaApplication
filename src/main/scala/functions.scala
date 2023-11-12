object functions {
  def main(args:Array[String]): Unit = {
    for (i <- 1 to 10)
      sayHello()
    var i = 5
    while (i > 0) {
      printAlphabet()
      i -= 1
    }
  }
  private def sayHello(): Unit = {
    println(s"Hello everyone")
  }

  private def printAlphabet(): Unit = {
    println(s"A B C D E.....X Y Z")
  }
}
