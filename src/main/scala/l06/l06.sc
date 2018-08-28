import scala.annotation.tailrec

//линейная рекурсия без  оптимизации хвоста
//def factorial(n:Int ): Int =
//  if (n == 1) 1
//  else n * factorial(n - 1)
//
//factorial(5)



//линейная рекурсия с оптимизацией хвоста
//def factTail(n:Int ): Int = {
//  @tailrec
//  def factStep(n:Int, acc:Int): Int =
//    if (n == 1) acc
//    else factStep(n - 1, acc * n)
//
//  factStep(n, acc= 1)
//}
//
//factTail(5)


//(нелинейная) рекурсия с ветвлением; вызовет себя дважды
//def recBinary(n: Int): Int = {
//
//  println(n)
//
//  if (n == 1) 1
//  else recBinary(n - 1) + recBinary(n - 1)
//}
//
//recBinary(2)



def recBinary(n: Int): Int = {

  println(n)

  if (n == 1) 1
  else n + recBinary(n - 1) + recBinary(n - 1)
}

recBinary(2)