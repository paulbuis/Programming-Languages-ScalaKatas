import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

object Kata2_2 {
    
    def read() : Iterable[Int] = {
        val readLine : () => String = scala.io.StdIn.readLine
        val data = scala.collection.mutable.ArrayBuffer.empty[Int]
        var line : String = readLine()
        while (! line.isEmpty ) {
            data += line.toInt
            line = readLine()
        }
        data 
    }
    
    def main(args: Array[String]) : Unit = {
        val data : Future[Iterable[Int]] =
            scala.concurrent.Future {blocking(read())}
        val future : Future[Double] = data.map( x => x.sum / x.size.toDouble)
        println("about to Await")
        val result : scala.util.Try[Double] = Await.ready(future,
             scala.concurrent.duration.Duration.Inf).value.get
        result match {
            case scala.util.Success(ave) => printf("Success, ave=%f\n", ave)
            case scala.util.Failure(exception) => println("Failed!!! " +
               exception)
        }
    }
}
