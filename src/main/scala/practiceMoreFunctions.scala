object practiceMoreFunctions {
  def main(args:Array[String]): Unit = {
    for (i<- 1 to 3) {
      val result = sum(i*5, i*9)
      println(s"Sum is: $result")
    }
    val products = Map("Shoes"->9.99, "Socks"->5.99, "Jeans" ->39.99)
    var total:Double = 0
    for (product <- products.values){
      val finalPrice:Double = product
      total = total + finalPrice
    }
    println(total)
  }

  def sum(a:Int, b:Int) = a+b

  private def calculatePrice(price:Double, tax:Double=1.20)= price + price*tax
}
