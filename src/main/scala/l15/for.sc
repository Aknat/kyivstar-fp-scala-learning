for (x <- 1 to 4; y <- 1 to 2)
  println(s"$x:$y")


for {x <- 1 to 4; y <- 1 to 2}
  println(s"$x:$y")


for {
  x <- 1 to 4
  y <- 1 to 2
}
  println(s"$x:$y")


for {
  x <- 1 to 4
  if x != 3
  y <- 1 to 2
}
  println(s"$x:$y")


for {
  x <- 1 to 4
  if x != 3
  y <- 1 to 2
  if y != 2

  z = x * y
}
  println(s"$x:$y -- $z")



for {
  x <- 1 to 4
  if x != 3
  y <- 1 to 2
  if y != 2

  z = x * y
}
  yield z


for {
  x <- 1 to 4
  if x != 3
  y <- 1 to 2
  if y != 2

  z = x * y
}
  yield (x,y,z)


(1 to 4).map(i => i * i)


(1 to 4)
  .map(i => i * i)
  .filter(_ != 9)
