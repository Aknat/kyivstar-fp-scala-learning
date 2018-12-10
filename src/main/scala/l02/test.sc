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


def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}
matchTest(3)