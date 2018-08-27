
//var j = 1
//while (j <= 26) {
//
//  var i = 0
//  while (i < j) {
//    print(f"${i + 'A'}%c")
//    i += 1
//  }
//
//  println()
//  j += 1
//
//}


def alphaString(n: Int): Unit = {
  var i = 0
  while (i < n) {
    print(f"${i + 'A'}%c")
    i += 1
  }
}


def tree(high: Int): Unit = {

  var i = 1
  while (i <= high) {
    alphaString(i)
    println()
    i += 1
  }

}


tree(26)