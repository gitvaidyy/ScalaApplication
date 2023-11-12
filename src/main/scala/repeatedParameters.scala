object repeatedParameters {
  def main(args:Array[String]): Unit = {
    sayHello("Mary","Johnson","Alex")

    val users = List("Alice","Bob","Carol")
    //sayHello(users)
    sayHello(users:_*)  //splat operators
  }

  def sayHello(names:String*): Unit = {
    for(name <- names){
      println(s"Hello $name")
    }
  }
}
