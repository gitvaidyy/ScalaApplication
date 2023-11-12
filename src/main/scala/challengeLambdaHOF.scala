import scala.collection.mutable.ArrayBuffer

/*
Create a Higher Order Function that takes a list of client names and a lambda expression
that returns a String.
It then applies the lambda expression to every client name, creates a new collection
of the results and returns the result.
Create a lambda expression that takes a client name String and returns a
personalised message.
Call the HOF and print out the result.
*/
object challengeLambdaHOF {
  def main(args:Array[String]): Unit = {
    val clients = List("Michael","Jane","Mary","Dan","Johnson")
    val messages = getMessages(clients, (name:String) => s"Hello $name how are you")
    for (i <- messages.indices){
      println(s"Message for ${clients(i)}")
      println(messages(i))
      println()
    }
  }
  def getMessages(clients:List[String],getMessage: String => String):List[String]={
    val messages = ArrayBuffer[String]()
    for (client <- clients){
      messages.addOne(getMessage(client))
    }
    messages.toList
  }
}
