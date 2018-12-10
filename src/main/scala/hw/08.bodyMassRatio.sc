import scala.math._

def massRatio(weight: Int, height: Double) = weight / pow(height, 2)

val ratio = massRatio(50, 1.7)
val indexMin = 18.5
val indexMax = 30
val prefix = f"mass ratio: $ratio%.1f"

def matchRatio(ratio: Double): String = ratio match {
  case ratio if ratio < 18 => "you are skinny, Yura's choice!"
  case ratio if ratio > 18 => "you are hot and beautiful!"
}

matchRatio(ratio)

