package week1

import scala.annotation.tailrec

object NewtonSqrtApproximation:
  private def abs(x: Double): Double = if (x < 0) -x else x

  @tailrec private def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  private def isGoodEnough(guess: Double, x: Double) = (abs(guess * guess - x) / x) < 0.0001

  private def improve(guess: Double, x: Double) = (guess + x / guess) / 2

  def sqrt(x: Double): Double = sqrtIter(1.0, x)

