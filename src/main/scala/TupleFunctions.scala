object TupleFunctions {
  def main(args:Array[String]): Unit = {
    val conn = (80, "www","google.com", true)
    println(conn.toString())
    val conn2 = conn.copy(_2 = "ftp")
    println(conn2)
    println(conn.productArity)  //size

    val conn3 = Tuple2("abc",123)
    println(conn3.swap)

    val info = ("auth","cache")
    //println(conn++info)
  }

}
