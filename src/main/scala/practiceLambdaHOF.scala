object practiceLambdaHOF {
  def main(args:Array[String]): Unit = {
    val numbers = Array[Double](2,8,5,76,16,4,7,9,3)
    println(numbers.toList)
    val newNumbers= updateHOF(numbers, (number:Double) => number/10)
    println(newNumbers.toList)
  }
  private def updateHOF(numbers:Array[Double], lbd:Double => Double): Array[Double] = {
    for (i <- numbers.indices){
      if (numbers(i)% 2 == 0){
        numbers(i) = lbd(numbers(i))
      }
    }
    numbers
  }
}
