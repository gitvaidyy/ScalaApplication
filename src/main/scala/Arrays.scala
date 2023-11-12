object Arrays {
  def main(args:Array[String]): Unit = {
    val a = Array(1,2,true)
    //println(a)
    a.foreach(println)
    println(a.mkString)
    println(a.toList)
    //can be updated but can't change the
    a(1) = 4
    println(a.toList)

    //Adding elements to an array
  }
}
