object filterForLoop {
  def main(args:Array[String]): Unit = {
    val clients = List("Alice","Bob","Carol","Britney","Tom")
    for (client <- clients if client.length > 4) {
      println(client)
    }
    println("-------")
    for (client <- clients if client.length > 4; if client.toLowerCase.contains("a"))
      println(client)

    println("-------")
    val output = for (client <- clients; if client.length > 4)
      yield client
    println(output)

  }
}
