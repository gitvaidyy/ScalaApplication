object practiceFunctionScope {
  def main(args:Array[String]): Unit = {
    val year=2015
    printYear()
    println(s"The year inside the main is $year")
  }
  def printYear(): Unit = {
    val year=1985
    println(s"The year inside the function is $year")
  }
}
