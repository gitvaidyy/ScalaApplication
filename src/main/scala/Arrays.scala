import scala.collection.mutable.ArrayBuffer

object Arrays {
  def main(args:Array[String]): Unit ={
   var a = Array(1,2,3)
   var b = Array(4,5,6)

    println(a.toList)
    println(b.toList)

    val c = a ++ b
    println(c.toList)

    val d = ArrayBuffer(1,2,3)
    println(d)

    d.addOne(4)
    println(d)

    d.addAll(List(7,8,9,0))
    println(d)

    d.remove(1) //index
    println(d)

    //d.remove(1, 3)  //index and number of elements
    //println(d)

    //Remove all elements
    d --= List(4,7,8)
    println(d)


  }
}
