object Exercise9_2 extends App {

  //  Write a Scala program that reads a file with tabs, replaces each tab with spaces
  //  so that tab stops are at n-column boundaries, and writes the result to the
  //  same file.

  import java.io._
  import scala.io.Source

  val in = Source.fromFile("Ex9_2.txt")

  val tabPattern = """\t+""".r

  val st = tabPattern.replaceAllIn(in.mkString," ")

  val pw = new PrintWriter("Ex9_2.txt")

  pw.write(st)

  pw.close()

}