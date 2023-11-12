object moreIfStatements {
  def main(args:Array[String]): Unit = {
   val petStore = List("cat","dog","rabbit")
   val hasCatFood = true

   if (petStore.contains("cat")){
     if (hasCatFood)
       println(s"Buy cat and cat food")
     else
       println(s"Buy cat")
   } else {
      println(s"Ask pet store to get cat")
   }
  }
}
