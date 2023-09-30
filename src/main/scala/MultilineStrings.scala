object MultilineStrings {

  def main(args:Array[String]): Unit ={
    val str1 = "This is a \nMultiline\nString"
    println(str1)

    val str2 =
      """
        |This is a
        |Multiline
        |string
        |""".stripMargin
    println(str2)
  }

}
