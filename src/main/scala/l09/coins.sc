
val money = 3
val coins = List(1,2)


def countChange(money: Int, coins: List[Int]): Int =
  if (money != 0 && coins.isEmpty || money < 0) 0
  else if (money == 0) 1
  else countChange(money - coins.head, coins) + countChange(money, coins.tail)

countChange(3, coins)