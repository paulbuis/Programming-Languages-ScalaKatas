object Kata1_1 {
    
    def main(args: Array[String]): Unit = {
        val readInt : () => Int = scala.io.StdIn.readInt;
        val x : Int = readInt();
        val y : Int = readInt();
        val z : Int = readInt(); 
        println( (x+y+z)/3.0 );
    }
}