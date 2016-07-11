
object Kata4_1 {

    def makeFib() : Int => Long = {
        var memo = scala.collection.mutable.ArrayBuffer.empty[Long]
        memo += 0
        memo += 1
        def innerFib(n : Int) : Long = {
            if (n >= memo.length) {
                memo += innerFib(n-1) + innerFib(n-2)
            }
            memo(n)
        }
        innerFib
    }
    
    def main(args: Array[String]) : Unit = {
        val fib = makeFib()
        println(fib(0))
        println(fib(1))
        println(fib(2))
        println(fib(3))
        println(fib(4))

        var start = System.nanoTime
        val f50a = fib(50)
        var end = System.nanoTime
        printf("computed fib(50)=%,d in %,d nanoseconds\n", f50a, end-start)

	start = System.nanoTime
        val f50b = fib(50)
        end = System.nanoTime
        printf("computed fib(50)=%,d in %,d nanoseconds\n", f50b, end-start)
    }
}
