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