object functionScope {
  def main(args:Array[String]): Unit = {
    example()
    //test()
    //println(s"I have $flowers flowers.")
  }
  private def example():Unit={
    val flowers = 5
    test()
    def test(): Unit = {
      println(s"I have $flowers flowers.")
    }
  }
}
