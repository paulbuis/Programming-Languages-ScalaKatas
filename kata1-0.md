#Kata 1.0

Objective: read 3 integers from console and compute their average.

```Scala
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
