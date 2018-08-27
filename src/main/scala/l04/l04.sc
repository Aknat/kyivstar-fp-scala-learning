1+1

val b = 0xff
val c = 0x15

val time=12
//val stringTime = "current time: " + time
val stringTimeInt = s"current time: + $time"     // string interpolation



val sec=10
val min=35
val hour=10

val stringTime = "current time: " + "hour: " + hour + " min: " + min + " sec: " + sec
val stringTimeA = s"current time:  $hour hour  $min min  $sec sec"
//val stringTimeInt = s"current time: + $time"

val left = 2
val right = 1
//assert(left == right)

val a = 1
val x = 1
//assert(a == x && left == right)


val z = 40/3.0d
f"z: $z%.25f"



