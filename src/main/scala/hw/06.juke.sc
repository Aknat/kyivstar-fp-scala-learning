class Juke(number: Int, color: String) {

  var destination = "unknown place"
  var speed = 0
  var driver = "unknown driver"

  def setDestination(destination: String): Unit = this.destination = destination

  def setSpeed(speed: Int): Unit = this.speed = speed

  def setDriver(driver: String): Unit = this.driver = driver

  def printStatus(): Unit = println(s"I am a $color Juke and I go with my $driver and my speed $speed to $destination")
}

val myJuke = new Juke(69, "grey")

myJuke.setDriver("Tania")
myJuke.setDestination("Softengi")
myJuke.setSpeed(60)

myJuke.printStatus()