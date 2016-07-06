#Kata 2.0

The objective in Kata 2 is to read an arbitrary number of integers from the console and compute their average.
One function should store them in a collection, and another function should do the computation of the average.
By storing the values in a collection, one could write other functions to compute min, max, or median, for example.

```scala
object Kata2_0 {
    def sum(data: Traversable[Int]) : Int = {
        var result = 0;
        data.foreach( (datum) => result += datum);
        result
    }
    
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
        val average = sum(data) / data.size.toDouble;
        println(average);   
    }
}
```

In this example, the `read()` function stores values in an `ArrayBuffer` which automatically grows as values are appended
with the `+=` operator. `ArrayBuffer` is a [subtype](https://en.wikipedia.org/wiki/Subtyping)
of `Iterable` so `read()` could be implemented differently without
impacting the return type used by its caller(s). An `ArrayBuffer` is mutable: not only can items be appended to it, one can
changed what values are already stored in it. `Iterable` provides no mutating methods, so the caller can't modify the return
value, making it effectively [immutable](https://en.wikipedia.org/wiki/Immutable_object).

'Iterable` is a subtype of `Traversable` which is a Scala "trait" meaning the `foreach` method is supported.
The argument to `foreach` is a function which is called once for each value in the collection.

Run at [TutorialsPoint](http://goo.gl/UqrEgw) in a Linux environment. :warning: Warning: slow link to cloud in India. Needs to spin up a Docker container to host Web IDE.
