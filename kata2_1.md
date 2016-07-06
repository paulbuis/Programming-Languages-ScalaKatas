#Kata 2.1

```scala

object Kata2_1 {
    
    def read() : Iterable[Int] = {
        val readLine : () => String = scala.io.StdIn.readLine;
        val data = scala.collection.mutable.ArrayBuffer.empty[Int];
        var line : String = readLine();
        while (! line.isEmpty ) {
            data += line.toInt;
            line = readLine();
        }
        data 
    }
    
    def main(args: Array[String]) : Unit = {
        val data = read();
        println( data.sum / data.size.toDouble );   
    }
}
```

For numeric type parameters, `Iterable[T]` provides its own `sum` method. The method is invoked in `main()` without using `()` 
as are the `size` and `toDouble` methods. Scala guidelines suggest omitting the `()` when the method does not mutate the object
and using the `()` for method invocations that do mutate the object.
