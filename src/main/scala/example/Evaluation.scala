package example

object Evaluation:
  // call-by-value
  def and(x: Boolean, y: Boolean): Boolean = if x then y else false


  // call-by-name
  def and2(x: Boolean, y: => Boolean): Boolean = if x then y else false
