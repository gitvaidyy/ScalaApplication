object stringInterpolations {
  def main(args:Array[String]): Unit ={
    val dogName ="Teddy"
    println(s"My dog's name is ${dogName}, and he is a good boy")

    println(s"I have ${1+1} cats.")

    //Raw interpolator
    println(raw"This is a \n new \\line")
    //Non-raw
    println("This is a \n new \\line")
  }

}
