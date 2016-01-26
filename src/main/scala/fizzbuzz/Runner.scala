package fizzbuzz

import FizzBuzz._

object Runner {

  def main(args: Array[String]) {
    (1 until 100).map(fizzbuzz1).foreach(println)

    println()

    (1 until 100).map(fizzbuzz2).foreach(println)
  }


}
