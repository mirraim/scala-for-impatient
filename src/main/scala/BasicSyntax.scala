import  scala.math._ // _ equals * in Java
object BasicSyntax extends App {
  // val is immutable
  val answer = 8 * 5 + 2
  println(s"${answer.getClass} = $answer")

  val res = answer * 0.5
  println(s"${res.getClass} = $res")

  // var is mutable. For functional programming it is redundant
  var counter = 0
  counter = 1

  //Type of variable is written after the name of variable:

  val greeting: String = "Hello"
  val smth: Any = "scala"

  val xmam, ymax : Int = 100

  val one = 1.toString
  val range = 1.to(10)
  println(s"${range.getClass} = $range")

  val d: Double = "99.44".toDouble // 99.44
  val i: Int = d.toInt // 99
  val c: Char = i.toChar // 'c'

  val a = 1
  val b = 2

  var sum = a + b
  sum = a.+(b)

  1.to(100)
  1 to 100

  println("Bonjour".sorted) // Bjnooru

  println(sqrt(2)) // 1.4142135623730951
  println(pow(2, 4)) //16.0
  println(min(3, Pi)) // 3.0

  println(BigInt.probablePrime(100, scala.util.Random))

  val character: Char = "Hello"(2) // l

  println(character)
}
