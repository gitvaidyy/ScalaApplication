object ListFunctions {
  def main(args:Array[String]): Unit ={
    val colors = List("blue","red","green","blue")
    println(colors.isEmpty)
    println(colors.length)
    println(colors.contains("red"))
    println(colors.contains("pink"))
    println(colors.indexOf("red"))
    println(colors.indexOf("blue"))
    println(colors.lastIndexOf("blue"))
  }

}
