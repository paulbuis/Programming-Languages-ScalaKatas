#Kata 4.0

```scala
object Kata4_0 {

    def fib(n : Int) : BigInt = {
        if (n==0) {
            BigInt(0)
        }
        else if (n==1) {
            BigInt(1)
        }
        else {
            fib(n-1) + fib(n-2)
        }
    }
    
    def main(args: Array[String]) : Unit = {
        println(fib(0))
        println(fib(1))
        println(fib(2))
        println(fib(3))
        println(fib(4))   
    }
}
```

Recursive implementation of a function to return values in the Fibonacci sequence. This implementation is inefficient, not
because it is recursive, but because it recomputes the same values over and over again.
