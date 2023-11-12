import scala.collection.mutable

object practiceLocalFunctions {
  def main(args:Array[String]): Unit = {
    awesomeBank(mutable.HashMap("Alice"->635, "Bob"->397,"Carol"->9623))
  }
  private def awesomeBank(users:mutable.HashMap[String, Int]): Unit = {
    def doubleAmount(amount:Int) = amount * 2

    for (user <- users.keys){
      users(user) = doubleAmount(users(user))
    }
    println(users)
  }
}
