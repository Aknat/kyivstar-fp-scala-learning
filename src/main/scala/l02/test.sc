1 + 1

def x() = {
  println("Peform")
  2
}

x()

x()


def f1 = 2
println(f1)

def mul3(x: Int) = x * 3
println(mul3(3))

val c2 = 2 + 3

def c = 2 + 3

c

def sqr(a: Int) = a * a

println(sqr(3))


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