object stringsFunctions {
  def main(args:Array[String])= {
    val myPet = "Crocodile"
    println(myPet.length)

    val myName = "vaidyanathan"
    println(myName.capitalize)

    val myAnimal = "Giraffe"
    println(myAnimal.toLowerCase())

    val myText = "     there are too many spaces      "
    println(myText.trim)

    println(myPet(3))
    println(myPet.charAt(3))

    println(myText.trim.substring(3))
    println(myPet.substring(3,6))
  }
}
