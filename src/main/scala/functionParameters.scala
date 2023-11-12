object functionParameters {
  def main(args:Array[String]): Unit = {
    for (i <- 1 to 10)
      double(i)
    val clients = List("Ana","Johnson","Michelle")
    sayHello(clients)
    double(5,"5 *2=")
    double(17)
  }
//  private def double(number:Int): Unit = {
//    println(s"Double of $number is ${number*2}")
//  }
  private def double(number:Int, message:String="Double is "): Unit = {
    println(s"$message ${number *2}")
  }
  private def sayHello(people:List[String]): Unit = {
    for (person <- people)
      println(s"Hi $person")
  }
}
