object Kata3_1 {

    def factorial(n : Int) : BigInt = {
        var result = 1
        for (i <- 1 to n) {
            result *= i
        }
        result
    }
    
    def main(args: Array[String]) : Unit = {
        println(factorial(0))
        println(factorial(1))
        println(factorial(2))
        println(factorial(3))
        println(factorial(4))   
    }
}
