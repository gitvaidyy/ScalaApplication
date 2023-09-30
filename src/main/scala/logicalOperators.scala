object logicalOperators {
  def main(args:Array[String]): Unit ={
    println(true && true)
    println(true && false)

    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    println(true || false)
    println(false || false)

    println(!true)
    println(!false)
  }

}
