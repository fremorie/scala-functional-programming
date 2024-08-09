def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) then 1 else f(a) * product(f)(a + 1, b);

product(x => x * x)(1, 3)

def factorial(n: Int) = product(x => x)(1, n)

factorial(5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  def recur(a: Int): Int =
    if a > b then zero
    else combine(f(a), recur(a + 1))
  recur(a)

def sum(f: Int => Int) = mapReduce(f, (x, y) => x + y, 0)

sum(factorial)(1,3)

def f(a: String)(b: Int)(c: Boolean): String =
  "(" + a + ", " + b + ", " + c + ")"

f("aaaa")(10)(true)