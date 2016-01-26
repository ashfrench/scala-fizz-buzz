package fizzbuzz

import fizzbuzz.FizzBuzz._
import org.hamcrest.Matchers._
import org.junit.Assert._
import org.junit.Test

class FizzBuzzTest {

  @Test
  def fizz1() {
    assertThat(fizzbuzz1(1), equalTo("1"))
    assertThat(fizzbuzz1(3), equalTo("Fizz"))
    assertThat(fizzbuzz1(4), equalTo("4"))
    assertThat(fizzbuzz1(6), equalTo("Fizz"))
  }

  @Test
  def fizz2() {
    assertThat(fizzbuzz2(1), equalTo("1"))
    assertThat(fizzbuzz2(3), equalTo("Fizz"))
    assertThat(fizzbuzz2(4), equalTo("4"))
    assertThat(fizzbuzz2(6), equalTo("Fizz"))
  }

  @Test
  def buzz1() {
    assertThat(fizzbuzz1(1), equalTo("1"))
    assertThat(fizzbuzz1(4), equalTo("4"))
    assertThat(fizzbuzz1(5), equalTo("Buzz"))
    assertThat(fizzbuzz1(10), equalTo("Buzz"))
  }

  @Test
  def buzz2() {
    assertThat(fizzbuzz2(1), equalTo("1"))
    assertThat(fizzbuzz2(4), equalTo("4"))
    assertThat(fizzbuzz2(5), equalTo("Buzz"))
    assertThat(fizzbuzz2(10), equalTo("Buzz"))
  }

  @Test
  def fizzbuzzTest1(){
    assertThat(fizzbuzz1(14), equalTo("14"))
    assertThat(fizzbuzz1(15), equalTo("FizzBuzz"))
    assertThat(fizzbuzz1(16), equalTo("16"))
  }

  @Test
  def fizzbuzzTest2(){
    assertThat(fizzbuzz2(14), equalTo("14"))
    assertThat(fizzbuzz2(15), equalTo("FizzBuzz"))
    assertThat(fizzbuzz2(16), equalTo("16"))
  }
}
