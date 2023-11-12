import scala.io.StdIn

object challengeNestedWhileLoop {
  def main(args:Array[String]): Unit = {
    var stop = false
    while(!stop){
      println(s"Please enter a large number: ")
      var number = StdIn.readLine().toInt

      if (number == 0) {
        println(s"0 value entered. Program will stop")
        stop = true
      }
      else{
        var i = 0
        while (i <= number){
          if (i%17 ==0)
            println(s"$i is divisble by 17")
          i += 1
        }
      }
    }
  }
}
