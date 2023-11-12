object practiceIf2 {
  def main (args:Array[String]): Unit = {
    val response: Int = 404
    if (response.toString.startsWith("1"))
      println("Information Response")
    else if (response.toString.startsWith("2"))
      println("Success")
    else if (response.toString.startsWith("3"))
      println("Redirect")
    else if (response.toString.startsWith("4"))
      println("Client error")
    else if (response.toString.startsWith("5"))
      println("Server error")
    else
      println("Error")
  }
}
