class Car {

  private val serial = "qwerty"
  var speed = 100

  def getSerial = serial

  def changeSpeed(delta: Int):Int = {
    speed += delta
    speed
  }
}

val car = new Car()
print(car.toString)

car.speed
car.changeSpeed(60)
car.getSerial
