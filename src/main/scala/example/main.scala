import example.Lists
import example.NewtonSqrtApproximation
import example.Evaluation
import scala.math._

@main def run(): Unit =
  // val x = 0.001
  // val x = 0.1e-20
  val x = 1.0e50

  // println(Lists.max(List(1,3,2,6,7,87,9)))
//  println(NewtonSqrtApproximation.sqrt(x));
//  println(sqrt(x))

  def loop: Boolean = loop;

  // endless loop
  println(Evaluation.and(false, loop))

  // ok
  println(Evaluation.and2(false, loop))