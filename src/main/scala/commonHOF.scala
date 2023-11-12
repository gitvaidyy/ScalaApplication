object commonHOF {
  def main(args:Array[String]): Unit = {
    val clients = List("Johnson","David","Anna","Bob")
    clients.foreach { client =>
      println(s"Hello $client")
    }
    clients.filter(_.length <= 4).foreach {client =>
      println(client)
    }
    println(clients.filter(_.length <= 4))

    val sizes = clients.map(_.length)
    println(sizes)

    val sorted = clients.sortBy(_.length)
    println(sorted)

    val max = clients.maxBy(_.length)
    println(max)

    val min = clients.minBy(_.length)
    println(min)
  }
}
