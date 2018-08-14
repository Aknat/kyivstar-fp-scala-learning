def sum(a:Int, b:Int)= a + b
def sub(a:Int, b:Int) = a - b
def mult(a:Int,b:Int)= a * b
def div(a:Int, b:Int) = a / b

def calc(a:Int, b:Int, c:Int, operator: (Int, Int, Int) => Int) = operator(a,b,c)

//val sumF = (a: Int, b:Int) => a + b

//calc(2,3,sumF)

//calc(2,5,_*_)
//calc(2,5,_+_)
//calc(5,5,_-_)
calc(40,10,2,_/_/_)

(Int, Int)


sum(4,5)

println(sum(4,4))

sum(10,sum(2,3))

2.+(5)

2 + 5


