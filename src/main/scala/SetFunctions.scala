object SetFunctions {
  def main(args:Array[String]): Unit ={
    val items = Set(3,4,true,"hi")
    println(items.size)
    println(items.contains(4))
    println(items.contains(5))
    println(items.isEmpty)
    println(items.nonEmpty)
    println(items.head)
    println(items.tail)
  }
}
