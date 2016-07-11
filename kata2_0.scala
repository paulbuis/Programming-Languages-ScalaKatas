object Kata2_0 {
    def sum(data: Traversable[Int]) : Int = {
        var result = 0;
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
