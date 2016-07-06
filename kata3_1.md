#Kata 3.1

```scala
object Kata3_1 {

    def factorial(n : Int) : BigInt = {
        var result = 1
        for (i <- 1 to n) {
            result *= i
        }
        result
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

This time the factorial function is computed iteratively rather than recursively. Note the syntax for a `for` loop.
The value identifer on the left of the `<-` may not be changed in the body of the loop, but may be different on different
iterations of the loop, so it is neither a `val` or a `var`.

The expression on right of the `<-` needs to be an `Iterable`. In this case, it is a `Range` literal.
