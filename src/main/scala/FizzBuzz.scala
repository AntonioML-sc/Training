object FizzBuzz extends App {

  // Make a function that receives a list of integers as Input and brings another list as output in that:
  // If a number were multiple of 3, it becomes "Fizz"
  // If a number were multiple of 5, it becomes "Buzz"
  // If a number were multiple of both of them, it becomes "FizzBuzz"

  def fizzbuzz(l:List[Int]):List[String] = {
    def fb1(n:Int): String = n match {
      case fb if fb % 15 == 0 => "FizzBuzz"
      case f if f % 3 == 0 => "Fizz"
      case b if b % 5 == 0 => "Buzz"
      case _ => n.toString
    }
    l.map(fb1)
  }
  val listOf100 = List.range(1,101)
  val anotherListOf100 = (1 to 100).toList
  val fizzBuzz100 = fizzbuzz(listOf100)
}