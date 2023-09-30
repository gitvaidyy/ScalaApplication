import scala.collection.mutable

object HashSetFunctions {
  def main(args:Array[String]): Unit ={
    val numbers = mutable.HashSet(3,4,null,83,56)
    println(numbers)

    numbers.addOne(22)
    println(numbers)

    numbers.addAll(List(5,6,83))
    println(numbers)

    numbers.remove(5)
    numbers.subtractOne(22)
    println(numbers)

    val n1 = Set(1,2,3,4,5,6)
    val n2 = Set(4,5,6,7,8,9)
    println(n1.intersect(n2))
    println(n1.union(n2))
    println(n1.diff(n2))
  }
}

