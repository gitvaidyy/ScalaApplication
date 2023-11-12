import scala.collection.mutable
object HashMaps {
  def main(args:Array[String]): Unit = {
    val count = mutable.HashMap(1->"One",2->"Two",3->"Three")
    println(count)

    count += (4->"Four")
    println(count)

    count.addOne(5->"Five")
    println(count)

    count ++= Map(10->"Ten", 11-> "Eleven")
    println(count)

    count.addAll(Map(12->"Twelve", 13-> "Thirteen"))
    println(count)

    count -= 4
    println(count)

    count --= Set(10,12)
    print(count)

    count.remove(5)
    println(count)

    count(11) = "ten plus one"
    println(count)

    count.clear()
    println(count)
  }
}
