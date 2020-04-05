object FizzBuzz extends App {

  // Make a function that receives a list of integers as Input and brings another list as output in that:
  // If a number were multiple of 3, it becomes "Fizz"
  // If a number were multiple of 5, it becomes "Buzz"
  // If a number were multiple of both of them, it becomes "FizzBuzz"

  def fizzbuzz(l:List[Int]):List[Any] = {
    def fb1(n:Int): Any = n match {
      case n:Int if ((n % 3 == 0) && (n % 5 == 0)) => "FizzBuzz"
      case n:Int if (n % 3 == 0) => "Fizz"
      case n:Int if (n % 5 == 0) => "Buzz"
      case _ => n
    }
  l.map(fb1(_))
  }
  val listOf100 = List.range(1,101)
  val anotherListOf100 = (1 to 100).toList
  val fizzBuzz100 = fizzbuzz(listOf100)
}