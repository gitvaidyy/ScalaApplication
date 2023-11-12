object challengeFunctionScope {
  def main(args: Array[String]): Unit = {
    val parakeets = 5
    buyMoreParakeets(parakeets)
    println(s"You now have $parakeets parakeets")
  }
  def buyMoreParakeets(parakeets: Int): Unit = {
    val parakeets = 3
  }
}
