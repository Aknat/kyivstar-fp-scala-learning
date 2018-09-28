package l14_domainObjects

case class Rational (n: Int, d: Int) {

  require (d != 0)

  val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g


  def +(that: Rational) = Rational (
    numer * that.denom + that.numer * denom,
    denom * that.denom)

  def *(that: Rational) =
    Rational(numer * that.n, denom * that.d)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


  override def toString: String = s"$numer/$denom"
}






//n - nominator - числитель
//d - denominator - знаменатель