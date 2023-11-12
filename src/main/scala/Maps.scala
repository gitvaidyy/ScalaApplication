object Maps {
  def main(args:Array[String]): Unit = {
    val count = Map(1->"One",2->"Two",3->"Three")
    val count2 = Map((1,"One"),(2,"Two"),(3,"Three"))
    println(count)
    println(count2)

    val count3 = Map[Int,String]((1,"One"),(2,"Two"),(3,"Three"))
    println(count3)

    val count4 = Map()
    println(count4)

    println(count(2))
    println(count.keySet)
    println(count.keys)
    println(count.values)
  }
}
