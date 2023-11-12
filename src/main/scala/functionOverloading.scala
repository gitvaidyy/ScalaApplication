object functionOverloading {
  def main(args:Array[String]): Unit = {
    println(multiply(7))
    println(multiply(7,3))
    sayHello("Johnson")
    sayHello(List("Ana","Bob","Carol"))
  }
  private def multiply(number:Int) = number * 2

  private def multiply(number:Int, multiplier:Int) = number * multiplier

  def sayHello(person:String) = println(s"Hi $person")

  def sayHello(people:Iterable[String]) ={
    for (person <- people)
      println(s"Hi $person")
  }
}
