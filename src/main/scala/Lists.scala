object Lists {
  def main(args:Array[String]): Unit = {
    val a = List(1,2,3,2,5)
    println(a)

    val m= List(1,true, "hello")
    println(m)

    val n= List()
    val o = Nil
    println(n)
    println(o)

    //val p = List[Int](1,2,3,true)
    //println(p)

    var matrix = List(
      List(1,0,0),
      List(0,1,0),
      List(0,0,1)
    )
    println(matrix)

    val colors = List("red","yellow","green")
    //println(colors(0))
    println(colors.head)
    println(colors.tail)
    println(colors.length)

  }

}
