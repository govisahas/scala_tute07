
class Rational(num_1:Int , num_2:Int){
   val numer = num_1
   val deno = num_2

   def neg = new Rational(-this.numer, this.deno)
   def print = println(this.numer + "/" + this.den0)
}
object Main extends App{
     val num_1 = new Rational(2,5)
     //num_1.neg evaluate -num_1
     num_1.neg.print

}