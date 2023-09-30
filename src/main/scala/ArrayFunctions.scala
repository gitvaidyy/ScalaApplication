import scala.collection.mutable.ArrayBuffer

object ArrayFunctions {
  def main(args:Array[String]): Unit ={
    val colors = Array("blue","red","green","blue")

    println(colors.toList)
    colors(1) ="pink"
    println(colors.toList)
    colors.update(2,"bluer")
    println(colors.toList)

    val colors2 = ArrayBuffer("blue","red","green","blue")
    colors2.addOne("yellow")
    println(colors2)
    colors2.addAll(List("Cyan","Magenta"))
    println(colors2)
    colors2.remove(3)
    println(colors2)
    colors2.remove(3,2)
    println(colors2)
    colors2.insert(1,"orange")
    println(colors2)
    colors2.insertAll(1,List("white","black"))
    println(colors2)
    colors2.clear()
    println(colors2)
  }

}
