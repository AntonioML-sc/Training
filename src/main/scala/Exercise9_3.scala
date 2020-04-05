object Exercise9_3 extends App {

  //  Write a Scala code snippet that reads a file and prints all words with more
  //  than 12 characters to the console. Extra credit if you can do this in a single line.


  """\w{12,}""".r.findAllIn(scala.io.Source.fromFile("/home/antonio/Training/src/main/resources/Ex9_3.txt").mkString).foreach{println}

}