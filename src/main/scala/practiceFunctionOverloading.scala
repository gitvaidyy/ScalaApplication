object practiceFunctionOverloading {
  def main(args:Array[String]): Unit = {
    feedAnimal("cat")
    feedAnimal(List("cat","dog","rabbit"))

    printLength(20)
    printLength("Vaidya, how are you?")
  }

  def feedAnimal(animal: String) = {
    println(s"Feeding the $animal")
  }

  def feedAnimal(animals: Iterable[String]): Unit = {
    for (animal <- animals)
      println(s"feeding $animal")
  }

  def printLength(message:String): Unit = {
    println(s"$message has a size of ${message.length}")
  }

  def printLength(length:Int): Unit = {
    var message = ""
    for (i <- 1 to length)
      message += "a"
    println(s"A message of length $length is $message")
  }
}

