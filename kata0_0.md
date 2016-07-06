#Kata 0.0

```scala
object Kata0_0 {
    
    def greet(name : String) = {
        println("Hello, " + name);
    }
    
    def main(args: Array[String]) = {
        greet(if (args.length==0) {"world"} else {args(0)});
    }
}
```

Ways to run this code (from the command line):

##1. Run as a script
```
scala kata0_0.scala
```

##2. Run as a script and pass a command line argument
```
scala kata0_0.scala Bob
```

##3. Run interactively in the intepreter  
```
scala -i kata0_0.scala  
Kata0_0.main(Array())  
Kata0_0.main(Array("Bob"))  
:quit  
```

##4. Start interactive interpreter and then load it  
```
scala  
:load kata0_0.scala  
Kata0_0.main(Array())  
Kata0_0.main(Array("Bob"))  
:quit  
```
##5. Compile it and then load .class file into JVM
```
scalac kata0_0.scala  
scala Kata0_0  
scala Kata0_0 Bob
```
