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