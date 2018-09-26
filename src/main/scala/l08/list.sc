val ListA = List(1,2)
val ListB = List(3,4)

val ListX = ListA ::: ListB

println(ListX)

val ListX1 = 1 :: ListB

println(ListX1)

val oneTwoThree = 1 :: Nil
println(oneTwoThree)




val a = List(1, 2, 3)

a.map {
  _ * 2
}

a.filter {
  _ % 2 == 0
}


var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
print(jetSet)
println(jetSet.contains("Cessna"))

val s = "Hello World"
"Application %s".format(s)