object MapFunctions {
  def main(args:Array[String]): Unit = {
    val count = Map(1->"One",2->"Two",3->"Three")
    println(count.size)
    println(count.contains(3))
    println(count.contains(5))
    println(count.head)
    println(count.tail)
    println(count.isEmpty)
    println(Map().isEmpty)
    println(count(2))
  }
}
