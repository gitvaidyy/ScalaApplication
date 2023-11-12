object functionReturn {
  def main(args:Array[String]): Unit = {
    val r = 64
    val area = calculateCircleArea(r)
    println(s"A circle with the radius of $r has an area of $area")

    val clients = List("Ana","Bob","William")
    for (client <- clients) {
      val greeting = personalisedGreeting(client)
      println(greeting)
    }
  }
//  private def calculateCircleArea(radius:Int): Double ={
//    val pi = 3.14159
//    pi * radius * radius
//  }

  private def calculateCircleArea(radius: Int) = 3.14159 * radius * radius

  private def personalisedGreeting(person:String): String = {
    person(0) match {
      case 'A' => s"Are you ok $person"
      case 'W' => s"What's up $person"
      case _ => s"Hi $person"
    }
  }
}
