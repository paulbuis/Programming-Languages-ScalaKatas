# Programming-Languages-ScalaKatas

Simple Programming Exercises in Scala

##Kata 0.0

```scala
object Kata0_0 {
    
    def greet(name : String) = {
        println("Hello, " + name);
    }
    
    def main(args: Array[String]) = {
        greet(if (args.length==0) {"world"} else {args(0)});
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
        scala.io.StdIn.readInt();
    }
    
    def main(args: Array[String]) = {
        val x = readInt();
        val y = readInt();
        val z = readInt(); 
        println( (x+y+z)/3.0 );
    }
}
```

Note assignments to `x`, `y`, and `z`. `val` means identifier may not be on the left hand side of another assignment statement.

Note also that the declarations don't explicitly specify the type of the identifiers `x`, `y`, or `z`. Scala is statically typed,
but the type `Int` is _inferred_ from the type of the expression on the right hand side of the initizializer.

Similarly, the return type of the `readInt()` function is inferred from the type of the expression it returns.
As in many functional languages, the last expression in a sequence of expressions is the value of the sequence,
so the return value of function is the last expression in the function body.  

Try this out on [TutorialsPoint](http://goo.gl/mmQtxE) in a Linux environment.

##Kata 1.1

```scala
object Kata1_1 {
    
    def main(args: Array[String]): Unit = {
        val readInt : () => Int = scala.io.StdIn.readInt;
        val x : Int = readInt();
        val y : Int = readInt();
        val z : Int = readInt(); 
        println( (x+y+z)/3.0 );
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
        val readInt : () => Int = Console.readInt;
        var x = 0;
        var y = 0;
        var z = 0;
        x = readInt();
        y = readInt();
        z = readInt(); 
        printf("average= %6.3f\n", average(x, y, z) );
    }
    
    def main() : Unit = {
        main(Array());
    }
}
```

This example shows function parameters (in function `average()`)
which must have their types declared (unlike local variables and return types,
which may have their types inferred).

Also, note that the function name `main` is [overloaded](https://en.wikipedia.org/wiki/Function_overloading)
with two functions distinguished by their argument types.
