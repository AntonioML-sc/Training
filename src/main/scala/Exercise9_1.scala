object Exercise9_1 extends App {

  //  Write a Scala code snippet that reverses the lines in a file (making the last
  //  line the first one, and so on).

  import scala.io.Source
  import java.io._

  val in = Source.fromFile("Ex9_1.txt")

  val st = in.getLines.toArray.reverse.mkString("\n")

  val pw = new PrintWriter("Ex9_1.txt")

  pw.write(st)

  pw.close()

}