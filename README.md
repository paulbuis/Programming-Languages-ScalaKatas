# Programming-Languages-ScalaKatas

Simple Programming Exercises in Scala

##Kata 0.0

```scala
object Kata0_0 {
    
    def greet(name : String) = {
        println("Hello, " + name)
    }
    
    def main(args: Array[String]) = {
        greet(if (args.length==0) {"world"} else {args(0)})
    }
}
```

Ways to run this code (from the command line):

###1. Run as a script
```
scala kata0_0.scala
```

###2. Run as a script and pass a command line argument
```
scala kata0_0.scala Bob
```

###3. Run interactively in the intepreter  
```
scala -i kata0_0.scala  
Kata0_0.main(Array())  
Kata0_0.main(Array("Bob"))  
:quit  
```

###4. Start interactive interpreter and then load it  
```
scala  
:load kata0_0.scala  
Kata0_0.main(Array())  
Kata0_0.main(Array("Bob"))  
:quit  
```
###5. Compile it and then load .class file into JVM
```
scalac kata0_0.scala  
scala Kata0_0  
scala Kata0_0 Bob
```

Go to [TutorialsPoint](http://goo.gl/hcgksm) to run in a Linux environment with Scala installed.

##Kata 1.0

```scala
object Kata1_0 {
    
    def readInt() = {
        scala.io.StdIn.readInt()
    }
    
    def main(args: Array[String]) = {
        val x = readInt()
        val y = readInt()
        val z = readInt() 
        println( (x+y+z)/3.0 )
    }
}
```

Note assignments to `x`, `y`, and `z`. `val` means identifier may not be on the left hand side of another assignment statement.

Note also that the declarations don't explicitly specify the type of the identifiers `x`, `y`, or `z`. Scala is statically typed,
but the type `Int` is _inferred_ from the type of the expression on the right hand side of the initizializer.

Similarly, the return type of the `readInt()` function is inferred from the type of the expression it returns.
As in many functional languages, the last expression in a sequence of expressions is the value of the sequence,
so the return value of function is the last expression in the function body.  

Try this out on <a href="http://goo.gl/mmQtxE" target="_blank">TutorialsPoint</a> in a Linux environment.
 :warning: Warning: slow link to cloud in India. Needs to spin up a Docker container to host Web IDE.

##Kata 1.1

```scala
object Kata1_1 {
    
    def main(args: Array[String]): Unit = {
        val readInt : () => Int = scala.io.StdIn.readInt
        val x : Int = readInt()
        val y : Int = readInt()
        val z : Int = readInt()
        println( (x+y+z)/3.0 )
    }
}
```

In this example, `x`, `y`, and `z` have their type explicity declared with a type annotation.

The `readInt()` function is declared as a `val` rather than with a `def` using "lambda" syntax.
Note that the type of the input arguments(s) are to the right of the `=>` and the result type is to the left.
That is, the type of the function is `() => Int`. 

##Kata 1.2

```scala
object Kata1_2 {
    def average(a: Int, b: Int, c: Int) : Double = {
        (a + b + c) / 3.0
    }
    
    def main(args: Array[String]) : Unit = {
        val readInt : () => Int = Console.readInt
        var x = 0
        var y = 0
        var z = 0
        x = readInt()
        y = readInt()
        z = readInt() 
        printf("average= %6.3f\n", average(x, y, z) )
    }
    
    def main() : Unit = {
        main(Array())
    }
}
```

This example shows function parameters (in function `average()`)
which must have their types declared (unlike local variables and return types,
which may have their types inferred).

Also, note that the function name `main` is 
<a href="https://en.wikipedia.org/wiki/Function_overloading" target="_blank">overloaded</a>
with two functions distinguished by their argument types.

##Kata 2

The objective in Kata 2 is to read an arbitrary number of integers from the console and compute their average.
One function should store them in a collection, and another function should do the computation of the average.
By storing the values in a collection, one could write other functions to compute min, max, or median, for example.

###Level 0

```scala
object Kata2_0 {
    def sum(data: Traversable[Int]) : Int = {
        var result = 0
        data.foreach( (datum) => result += datum)
        result
    }
    
    def read() : Iterable[Int] = {
        val readLine : () => String = scala.io.StdIn.readLine
        val data = scala.collection.mutable.ArrayBuffer.empty[Int]
        var line : String = readLine()
        while (! line.isEmpty ) {
            data += line.toInt
            line = readLine()
        }
        data 
    }
    
    def main(args: Array[String]) : Unit = {
        val data = read()
        val average = sum(data) / data.size.toDouble
        println(average) 
    }
}
```

In this example, the `read()` function stores values in an `ArrayBuffer` which automatically grows as values are appended
with the `+=` operator. `ArrayBuffer` is a <a href="https://en.wikipedia.org/wiki/Subtyping" target="_blank">subtype</a>
of `Iterable` so `read()` could be implemented differently without
impacting the return type used by its caller(s). An `ArrayBuffer` is mutable: not only can items be appended to it, one can
changed what values are already stored in it. `Iterable` provides no mutating methods, so the caller can't modify the return
value, making it effectively <a href="https://en.wikipedia.org/wiki/Immutable_object" target="_blank">immutable</a>.

'Iterable` is a subtype of `Traversable` which is a Scala "trait" meaning the `foreach` method is supported.
The argument to `foreach` is a function which is called once for each value in the collection.

Run at <a href="http://goo.gl/UqrEgw" target="_blank">TutorialsPoint</a> in a Linux environment. :warning: Warning: slow link to cloud in India. Needs to spin up a Docker container to host Web IDE.

###Level 1

```scala

object Kata2_1 {
    
    def read() : Iterable[Int] = {
        val readLine : () => String = scala.io.StdIn.readLine
        val data = scala.collection.mutable.ArrayBuffer.empty[Int]
        var line : String = readLine()
        while (! line.isEmpty ) {
            data += line.toInt
            line = readLine()
        }
        data 
    }
    
    def main(args: Array[String]) : Unit = {
        val data = read()
        println( data.sum / data.size.toDouble )  
    }
}
```

For numeric type parameters, `Iterable[T]` provides its own `sum` method. The method is invoked in `main()` without using `()` 
as are the `size` and `toDouble` methods. Functions with no parameters don't use `()` to invoke. Scala calls this the
"uniform access principle" with the notion that such functions should not be syntactically different from
data members allowing the implementation to shift either which way without affecting clients of a class.

Calling methods on collection classes and passing functions to those methods is common practice
in functional languages such as Scala. See <a href="" target="_blank">Martin Fowler's Blog Post on Collection Pipelines</a>

##Kata 3

Compute the factorial of an integer value.

###Level 1: Use recursion

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

### Level 1

Use iteration

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
iterations of the loop, so it is neither a `val` or a `var`. The construct with the `<-` is called a "generator expression" in Scala.



The expression on right of the `<-` needs to be an `Iterable`. In this case, it is a `Range` litera
