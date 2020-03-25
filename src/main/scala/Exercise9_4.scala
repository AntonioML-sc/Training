import Exercise9_2.st

object Exercise9_4 extends App {

  //  Write a Scala program that reads a text file containing only floating-point
  //  numbers. Print the sum, average, maximum, and minimum of the numbers
  //  in the file.

  import java.io._
  import scala.io.Source

  val in = Source.fromFile("Ex9_4.txt")

  val content = in.mkString

  val doublePattern = """[0-9]+\.+[0-9]""".r

  val ar = doublePattern.findAllIn(content).mkString(" ").split(" ").map(_.toDouble)

  val pw = new PrintWriter("Ex9_4.txt")

  pw.write(content+"\n"+"Sum = "+ar.sum+"\n"+"Average = "+ar.sum/ar.length+"\n"+"Maximum value = "+ar.max+"\n"+"Minimum value ="+ar.min)

  pw.close()

}