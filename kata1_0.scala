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
