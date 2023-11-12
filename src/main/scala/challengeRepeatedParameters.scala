object challengeRepeatedParameters {
  def main(args:Array[String]): Unit = {
    sayHello(3,"Johnson","Alice","Bob")
  }
  def sayHello(count:Int, clientNames:String*): Unit = {
    for (name <- clientNames) {
      for (i <- 1 to count) {
        println(s"Hello $name")
      }
      println()
    }
  }
}
