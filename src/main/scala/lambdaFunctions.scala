object lambdaFunctions {
  def main(args:Array[String]): Unit = {
    val myLambda = (name:String)=> println(s"Hello $name")

    myLambda("Alex")
  }
}
