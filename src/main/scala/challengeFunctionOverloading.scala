object challengeFunctionOverloading {
  def main(args:Array[String]): Unit = {
    finalPrice("Coffee",4.99)
    val products = Map("Cake"->3.99,"Soda"->1.59,"Burger"->6.99)
    finalPrice(products)
  }
  def finalPrice(product:String, price:Double): Unit = {
    var priceAfterTax = price + price*0.20
    println(s"The final cost of the ${product} is ${priceAfterTax}.")
  }

  def finalPrice(products: Map[String, Double]): Unit = {
    for (product <- products.keys) {
      finalPrice(product, products(product))
    }
  }

}
