class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  } }


class Point(x: Int, y: Int) {
  override def toString(): String = "(" + x + ", " + y + ")"
}

object Classes {
  def main(args: Array[String]) {
    val pt = new Point(1, 2)
    println(pt)
  }
}

class ClassWithValParameter(val name: String)
val aClass = new ClassWithValParameter("Gandalf")
println(aClass.name)

//case class Message(sender: String, recipient: String, body: String)
//val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
//
//println(message1.body)



//case class Message(sender: String, recipient: String, body: String)
//val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
//val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")


abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term

Fun("x", Fun("y", App(Var("x"), Var("y"))))

val x = Var("x")
println(x.name)

case class Dog(name: String, breed: String)
val d1 = Dog("Scooby", "Doberman")
d1.toString

case class Person(first: String, last: String, age: Int = 0, ssn: String = "")
val p1 = Person("Fred", "Jones", 23, "111-22-3333")
println(p1.ssn)



case class User(name: String, age: Int)

val userBase = List(User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23))

val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
  yield user.name  // i.e. add this to a list

twentySomethings.foreach(name => println(name))

val xValues = 1 to 4
val yValues = 1 to 2
val coordinates = for {
  x ← xValues
  y ← yValues
} yield x