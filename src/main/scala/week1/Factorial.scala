package week1

import scala.annotation.tailrec

object Factorial:
  @tailrec
  def tailRecFactorial(n: Int, m: Int = 1): Int =
    if n == 0 then m else tailRecFactorial(n - 1, m * n)

  def factorial(n: Int): Int =
    if n == 0 then 1 else n * factorial(n - 1)