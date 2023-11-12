object localFunctions {
  def main(args:Array[String]): Unit = {
    listAnimals()
    //listOneAnimal()
  }
  private def listAnimals(): Unit = {
    def listOneAnimal(animal:String): Unit = {
      println(s"I have a $animal")
    }
    val myAnimals = List("cat","dog","cow","horse")
    for (animal <- myAnimals){
      listOneAnimal(animal)
    }
  }
}
