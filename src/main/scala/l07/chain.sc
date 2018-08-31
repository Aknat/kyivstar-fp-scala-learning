val chain = List(1,2,10,4,5,6,7,12)

def lengh(chain: List[Int]): Int = {

  if (chain == Nil) 0
  else 1 + lengh(chain.tail)
}

lengh(chain)