package weektwo

object weektwo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product(f: Int => Int)(a:Int, b:Int): Int =
  	if (a>b)  1
  	else f (a) * product (f)(a+1,b)           //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  	product(x=>x * x) (2,3)                   //> res0: Int = 36
  	
  	def fact(n: Int) = product(x => x)(1, n)  //> fact: (n: Int)Int
  	
  	fact(4)                                   //> res1: Int = 24
  	fact(3)                                   //> res2: Int = 6
  	fact(5)                                   //> res3: Int = 120
  
  
  def increment(g: (Int,Int) => Int, base: Int)(f:Int => Int)(a:Int, b: Int): Int =
  if (a > b) base
  else g(f(a), increment(g, base)(f)(a+1,b))      //> increment: (g: (Int, Int) => Int, base: Int)(f: Int => Int)(a: Int, b: Int)I
                                                  //| nt
  
  increment((x,y)=> x*y, 1)(x=>x)(1,3)            //> res4: Int = 6
}