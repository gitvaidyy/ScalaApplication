object Operators {
  def main(args:Array[String]): Unit ={
    val result = 5+2
    println(result)
    println("Hi "+ "Johnson")

    println(8-4)
    println(7*3)

    println(5/2)
    println(5.0/2)
    println(5/2.0)
    println(5d/2)

    println(5%2)

    val a:Short = 4
    val b:Int = 372
    val r = a*b
    println(r)
    println(r.getClass)

    val c:Long = 8374622
    val d:Float = 12.44F
    val r1 = c/d
    println(r1.getClass)

    val f1 = 23454.234f
    val f2 = 234.355647
    val r3 = f1 * f2
    println(r3, r3.getClass)

    var dozen = 12
    val months = dozen
    dozen = 13

    println(dozen, months)

    val userName = "Lucy"
    val greeting = s"Hello, $userName"
    println(greeting)

    val products = 3
    val price = 9.99
    val total = s"Your total is $$${products * price}"
    println(total)

    var bikes = 5
    bikes += 1
    println(bikes)

    bikes -=1
    println(bikes)

    bikes *= 2
    println(bikes)

    bikes /= 3
    println(bikes)

    bikes %= 2
    println(bikes)
  }

}
