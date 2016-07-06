#Kata 1.0

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
