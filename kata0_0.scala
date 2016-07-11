object Kata0_0 {
    
    def greet(name : String) = {
        println("Hello, " + name)
    }
    
    def main(args: Array[String]) = {
        greet(if (args.length==0) {"world"} else {args(0)})
    }
}
