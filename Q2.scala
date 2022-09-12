
object rational extends App{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z  = new Rational(2,7)

    val num = x-y-z

    println(num)
}


class Rational(num_1:Int , num_2:Int){
      require(deno > 0, "Denominator must be greater than 0")
    def numer = num_1
    def deno = num_2

    def neg = new Rational(-this.numer , this.deno)
    def add(r:Rational) = new  Rational(this.numer*r.deno +this.deno*r.numer, this.deno*r.deno)

    def -(r:Rational) = this.add(r.neg)

    override def toString():String = numer + "/" +deno
}
