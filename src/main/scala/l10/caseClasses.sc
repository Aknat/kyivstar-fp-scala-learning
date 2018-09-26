//class Car (var serial: Int) {
//  val speed = 100
//}
//
//val car = new Car(123)
//val car2 = new Car(125)
//
//car2.serial
//car2.serial = 63485628
//
//car.toString
//car2.toString



case class Car2 (val serial: String = "123", val maxSpeed: Int = 100, val color: String = "black")

val car2 = Car2("123", 100)

car2.maxSpeed

car2.toString
val car3 = car2.copy(maxSpeed = 300, color = "red")
car2.copy("55",300)