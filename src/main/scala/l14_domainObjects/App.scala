package l14_domainObjects

object App {
  def main(args: Array[String]): Unit = {

    val a = Rational(3,4)
    val b = Rational(2,3)


    println(a)
    println(b)

    val mul1 = a * b
    val mul = a.*(b)

    val sum1 = a + b
    val sum = a.+(b)

    println(sum)
    println(sum1)
    println(mul)
    println(mul1)



  }

}
