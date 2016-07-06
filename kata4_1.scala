object Kata4_1 {

    def fib(n : Int) : BigInt = {
        var a = BigInt(0)
        var b = BigInt(1)
        var i = 0
        while (i<n) {
            var t = a
            a = b
            b = a + t
            i = i + 1
        }
        a;
    }
    
    def main(args: Array[String]) : Unit = {
        println(fib(0))
        println(fib(1))
        println(fib(2))
        println(fib(3))
        println(fib(4))   
    }
}
