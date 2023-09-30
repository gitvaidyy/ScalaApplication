import scala.io.StdIn

object Exceptions {
  def main(args:Array[String]): Unit ={
    val input = StdIn.readLine()
    //throw IllegalStateException("I don't like this exception!")
    try {
      val number = input.toInt
    } catch {
      case f:IllegalStateException =>{
        println("Illegal state exception occurred")
      }
      case e:Exception => {
        println("Exception occurred")
        e.printStackTrace()
      }
    }
    finally{
      println("Execution is completed... Free up all resources")
    }
  }
}
