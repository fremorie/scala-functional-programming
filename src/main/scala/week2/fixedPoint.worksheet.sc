import scala.annotation.tailrec
import scala.math.abs

def averageDamp(f: Double => Double)(x: Double): Double =
  (x + f(x)) / 2

def tolerance = 0.00001

def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double): Double =
  @tailrec
  def iterate(guess: Double): Double =
    val next = f(guess)
    if isCloseEnough(guess, next) then next
    else iterate(next)
  iterate(firstGuess)

def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)

sqrt(2)