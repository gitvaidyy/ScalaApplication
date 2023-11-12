import scala.collection.mutable
object PracticeMap {
  def main(args:Array[String]): Unit = {
    val count = mutable.HashMap(1->"un",2->"deux",3->"trois")
    println(count(2))
    println(count(3))
    count += (4->"quatre")
    println(count)

    val customers = mutable.HashMap("John"->1, "Alice"->5, "Bob"->3)
    println(customers.contains("Alice"))
    println(customers("Alice"))
    println(customers.contains("Michael"))
  }
}
