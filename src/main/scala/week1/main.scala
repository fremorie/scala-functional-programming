import week1.Lists
import week1.NewtonSqrtApproximation
import week1.Evaluation
import week1.Factorial
import scala.math._

@main def run(): Unit =
  // val x = 0.001
  // val x = 0.1e-20
  val x = 1.0e50

  // println(Lists.max(List(1,3,2,6,7,87,9)))
//  println(NewtonSqrtApproximation.sqrt(x));
//  println(sqrt(x))

//  def loop: Boolean = loop;
//
//  // endless loop
//  println(Evaluation.and(false, loop))
//
//  // ok
//  println(Evaluation.and2(false, loop))

  def n = 5

  println(Factorial.factorial(n))
  println(Factorial.tailRecFactorial(n))