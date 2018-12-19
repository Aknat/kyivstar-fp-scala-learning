import scala.math._

case class IMT(weight: Double, height: Double) {

  private val indexMin = 18.5
  private val indexMax = 30

  val ratio = weight / pow(height, 2)

  private val prefix = f"Your mass ratio: $ratio%.2f, "

  private def suffix = ratio match {
    case r if r <= indexMin => "you are skinny, Yura's choice!"
    case r if r > indexMin && r < indexMax => "you are hot and beautiful!"
    case r => "oooo!"
  }

  def textResult = prefix + suffix
}

val myIMT = IMT(61, 1.78)

println(myIMT.textResult)
println(myIMT.ratio)