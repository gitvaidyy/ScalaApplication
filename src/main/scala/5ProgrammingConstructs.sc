import scala.math.abs

val c =  {
  val i = 1
  val j = math.pow(2,10)
  i-j
}

val i = math.random()
val i = math.random() * 100

val i = (math.random() * 100).abs
val j = (math.random() * 100).abs.toInt

if (i > j) {
  println(i)
} else if (i == j) {
  println(" equal ")
} else {
  println(j)
}

if (i > j) i else j


val j = 70
var ctr = 96
while(ctr >= j) {
  println(ctr)
  ctr -=1
}

for( w <- 0 to 10)
  println(w)
