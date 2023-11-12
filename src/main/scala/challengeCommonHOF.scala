import scala.util.Random

object challengeCommonHOF {
  def main(args:Array[String]): Unit = {
    val ints = (1 to 20).map(_ =>Random.nextInt(100))
    println(ints)
    val subset = ints.map{nb =>
      if (nb % 2 == 0)
        nb/2
      else
        nb*2
    }.filter(_ > 25)
    println(subset)
  }
}
