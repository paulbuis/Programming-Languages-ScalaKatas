object Kata3_0 {

    function fib(n) = {
        if (n==0) BigInt(0) else if (n==1) BigInt(1) else fib(n-1)+fib(n-2);
    }
    def main(args: Array[String]) : Unit = {
        println(fib(0));
        println(fib(1));
        println(fib(2));
        println(fib(3));
        println(fib(4));   
    }
}