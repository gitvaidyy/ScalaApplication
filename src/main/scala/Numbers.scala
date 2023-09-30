object Numbers {
  def main(args:Array[String]): Unit ={
    val price = 34
    val items = 3
    val totalPrice = price * items
    println(s"Total: ${totalPrice}")

    var item  = 5
    println(item.getClass)
    var account = 2_000_000
    var nbOfPeople = 8_000_000_000L
    var prices = 29.99f
    println(prices.getClass)
    var pi = 3.1415926535

    val cats = 3
    println(cats.getClass)
    val longCats = cats.toLong
    println(longCats.getClass)

    val people = 8_000_000_000l
    val fewPeople = people.toInt
    println(fewPeople)

    val dogs = 5
    val byteDogs = dogs.toByte
    println(byteDogs.getClass)

    val floatDogs = dogs.toFloat
    println(floatDogs.getClass)

    val name: String = "Johnson"
    println(name.getClass)

    val catts:Int = 3
    println(catts.getClass)
    val stringCats = catts.toString
    println(stringCats.getClass)
  }

}
