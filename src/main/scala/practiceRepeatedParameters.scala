object practiceRepeatedParameters {
  def main(args:Array[String]): Unit = {
    sum(10,20,30,40,50)
  }
  def sum(number:Int*): Unit = {
    var total = 0
    for (numbers <- number){
      total += numbers
    }
    println(s"Sum of given numbers are: $total")
  }
}
