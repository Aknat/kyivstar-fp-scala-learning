import scala.math._

def hypotenuse(a: Int, b: Int) = sqrt(a * a + b * b)

val h1 = hypotenuse(3, 4)
val boolResult = (h1 == 5)

assert(boolResult)


def hypotenuse2(a: Int, b: Int) = sqrt(pow(a, 2) + pow(b, 2))

val h2 = hypotenuse2(3, 4)
