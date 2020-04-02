object Exercise9_4 extends App {

  //  Write a Scala program that reads a text file containing only floating-point
  //  numbers. Print the sum, average, maximum, and minimum of the numbers
  //  in the file.

  import java.io._
  import scala.io.Source

  val in = Source.fromURL(getClass.getResource("Ex9_4.txt"))

  val content = in.mkString

  val doublePattern = """\d+\.?\d*""".r  //  note: \d = [0-9], + = 1 or more, * = 0 or more, ? = 0 or 1

  val ar = doublePattern.findAllIn(content).mkString(" ").split(" ").map(_.toDouble)

  println(getClass.getResource("Ex9_4.txt").getPath)

  val pw = new PrintWriter(getClass.getResource("Ex9_4.txt").getFile)  //******

  pw.write(content+"\n"+"Sum = "+ar.sum+"\n"+"Average = "+ar.sum/ar.length+"\n"+"Maximum value = "+ar.max+"\n"+"Minimum value ="+ar.min)

  pw.close()

}