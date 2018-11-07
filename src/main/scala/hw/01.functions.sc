def func(a: Int, b: Int): Double = {
  val s1 = a * a
  println(s1)
  val s2 = b * b
  println(s2)
  val s3 = s1 - s2
  println(s3)
  val s4 = s3 / 2.0
  println(s4)
  s4
}
val y = func(2, 3)

def func2(a: Int, b: Int) = (a * a - b * b) / 2.0

val y2 = func2(2, 3)