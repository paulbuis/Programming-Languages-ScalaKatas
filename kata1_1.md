#Kata 1.0

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

The keyword `val` indicates that the identifiers represent values. They may not be used on the left hand side of an assignment statement.
If the keyword `var`, indicating a variable, had been used, the name would be allowed to be used on the left hand side of an
assignment statement.
