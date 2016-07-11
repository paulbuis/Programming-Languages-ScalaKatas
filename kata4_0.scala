object Kata4_0 {

    def makeFib() : () => BigInt = {
        var a = BigInt(0)
        var b = BigInt(1)
        def innerFib() : BigInt = {
            var t = a
            a = b
            b = a + t
            a
        }
        innerFib
    }
    
    def main(args: Array[String]) : Unit = {
        var fib = makeFib()
        for (i <- 0 to 48) {
            fib()
        }
        printf("%,d\n", fib()) // 50th Fibonacci number
    }
}
