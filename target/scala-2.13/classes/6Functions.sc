
def factorialIt(n: Int): Int = {
  var factorial = 1
  for (i <- n to 1 by -1)
    factorial *= i
  return factorial
}

val n = 6
println("The factorial of " + n + " is " + factorialIt(n))

def factr(i:Int):Int = if(i ==1) 1 else i * factr(i-1)
factr(10)

def fib1(n: Long): Long = n match {
  case 0 | 1 => n
  case _ => fib1(n - 1) + fib1(n - 2)
}

fib1(10)
