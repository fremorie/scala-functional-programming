import scala.annotation.targetName

class Rational(x: Int, y: Int):
  require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

  val numer = x / gcd(x.abs, y)
  val denom = y / gcd(x.abs, y)

  private def _add(r: Rational) =
    Rational(
      r.numer * denom + numer * r.denom,
      r.denom * denom,
    )
    
  @targetName("add")
  def +(y: Rational): Rational = _add(y)

  def less(that: Rational): Boolean =
    numer * that.denom < that.numer * denom

  infix def max(that: Rational): Rational =
    if this.less(that) then that else this

  def neg = Rational(-numer, denom)

  def sub(r: Rational) = _add(r.neg)

  override def toString = s"$numer/$denom"
end Rational

Rational(1,2)

val x = Rational(1,3)
val y = Rational(1,5)

x.sub(y)

Rational(1,-2)