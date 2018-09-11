class Car (var serial: Int) {
  val speed = 100
}

val car = new Car(123)
val car2 = new Car(125)

car2.serial
car2.serial = 63485628

car.toString
car2.toString