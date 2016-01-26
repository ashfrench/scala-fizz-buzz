package fizzbuzz

object FizzBuzz {

  def fizzbuzz1(x: Int): String = (x % 3, x % 5) match {
    case(0, 0) => "FizzBuzz"
    case(0, _) => "Fizz"
    case(_, 0) => "Buzz"
    case(_, _) => "" + x
  }

  def fizzbuzz2(x: Int): String = {
    var result = ""
    if (x % 3 == 0) {
      result = "Fizz"
    }

    if (x % 5 == 0) {
      result += "Buzz"
    }

    if (result == "") {
      x.toString
    } else {
      result
    }
  }
}
