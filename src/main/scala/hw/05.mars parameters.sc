// функция расчета обьема шара; входной параметр: радиус шара

// функция расчета веса шара; входные параметры: обьем и плотность

// mars radius = 3390 km = 3390000 m
// mars density = 3,933 g/sm³ = 3933 kg/m³

import scala.math._



def volume(radius: Double): Double = (4 * Pi) / 3 * pow(radius, 3)

def volumeBig(radius: Double): BigDecimal =
  BigDecimal(4) * BigDecimal(Pi) / BigDecimal(3) * (BigDecimal(radius) pow 3)

val marsvolume = volume(3390000)
val marsvolumeBig = volumeBig(3390000)

def weight(marsvol: Double, density: Double) = marsvol * density

val marsweight = weight(marsvolume, 3930)

marsweight.toLong


println("\u33A5")


println(s"mars volume = $marsvolume ㎥")
println(s"mars weight = $marsweight ㎏")


//val stringTimeA = s"current time:  $hour hour  $min min  $sec sec"





