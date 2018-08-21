"""\n\t"""
// not interpritated string

"""[\.]+?""".r

//var i = 0

//while (i < 3) {
//  i += 1
//  println(i)
// }


//do {
  //i += 1
  //println(i)

//} while (i < 3)

//val numbers = Array(1,2,3)
//
//for(i <- numbers) {
//  println(i)
//}
//
//val nums = 1 to 10
//
//for(i <- nums) {
//  println(i)
//}




//for(i <- 1 to 15)
//  println(i)


//for {
//  x <- 1 to 10 by 2
//  y <- 1 to 4
//
//  //if x !=2 && y ==2
//
//} {
//  println(s"x: $x, y: $y")
//
//}
//
//
//for {
//  x <- 10 to 1 by -2
//  y <- 1 to 4
//
//  //if x !=2 && y ==2
//
//} {
//  println(s"x: $x, y: $y")
//
//}


for {
  x <- 10 to 1 by -1
  y <- 4 to 1 by -1

  //if x !=2 && y ==2

} {
  println(s"x: $x, y: $y")

}


def fun1(): Unit = {

  println("111")
  fun1()
}