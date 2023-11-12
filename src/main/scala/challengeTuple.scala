object challengeTuple {
  def main(args:Array[String]): Unit = {
    val stores = (("Downtown", 36253), ("West side", 27362), ("East side", 29483))
    val total = (stores._1._2 + stores._2._2 + stores._3._2)
    println(total)
    val storeNames = (stores._1._1 , stores._2._1 , stores._3._1)
    println(storeNames)
  }

}
