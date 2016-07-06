#Kata 3.0

```scala
object Kata3_0 {

    def factorial(n : Int) : BigInt = {
        if (n==0) {
            BigInt(1)
        }
        else {
            BigInt(n) * factorial(n-1)
        }
    }
    
    def main(args: Array[String]) : Unit = {
        println(factorial(0))
        println(factorial(1))
        println(factorial(2))
        println(factorial(3))
        println(factorial(4))   
    }
}
```

Note that for recursive functions, the return type must be explicitly declared rather than allowing it to be inferred.

Note also that `if` is an expression, not a statement.
