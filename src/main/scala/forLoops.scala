object forLoops {
  def main(args:Array[String]): Unit = {
    val collection = List(1,2,3)
    for (x <- collection)
      println(x)

    val animals = List("cat","dog","mouse","horse")
    for (animal <- animals)
      println(s"Feeding the ${animal}")

    for (i <- 1 to 12) {
      var month:String = i match {
        case 1 => "January"
        case 2 => "February"
        case 3 => "March"
        case 4 => "April"
        case 5 => "May"
        case 6 => "June"
        case 7 => "July"
        case 8 => "August"
        case 9 => "Sep"
        case 10 => "Oct"
        case 11 => "Nov"
        case 12 => "Dec"
        case _ => ""
      }
      println(s"Month ${i} is called ${month}")
    }
  }
}
