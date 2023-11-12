object Ranges {
  def main(args:Array[String]): Unit = {
    val r1 = 1 to 10
    println(r1.toList)

    val r2 = 'a' to 'z'
    println(r2.toList)

    val r3 = 1 until 10
    println(r3.toList)

    val r4 = 'a' until 'z'
    println(r4.toList)

    val r5 = 1 to 100 by 2
    println(r5.toList)

    var r6 = Range(1,10)
    println(r6.toList)

    val r7 = Range.inclusive(1,10)
    println(r7.toList)

    val r8 = Range(1,10,3)
    println(r8.toList)

    val r9 = 10 to 1 by -1
    println(r9.toList)

    val r10 = Range(10,1, -1 )
    println(r10.toList)

    val r11 = (1 to 10).reverse
    println(r11.toList)

  }
}
