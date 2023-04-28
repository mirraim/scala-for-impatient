import java.io.{IOException, InputStream}
import java.net.{MalformedURLException, URL}
import scala.io.StdIn

object BasicStructures extends App {

  val name = StdIn.readLine("Your name: ")
  print("Your age: ")
  val age = StdIn.readInt()
  //A formatted string is prefixed with the letter f
  print(f"Hello, $name! In six months, you'll be ${age + 0.5}%7.2f years old.%n")
  //With a prefix of s, strings can contain expressions but not format directives
  println(s"Hello, ${name}! Next year, you will be ${age + 1}.")
  //With a prefix of raw, escape sequences in a string are not evaluated
  println(raw"\n is a newline")

    def conditionalExpressions(x: Int): Unit = {
    if (x > 0) 1 else -1

    val s = if (x > 0) 1 else -1

    var t: Int = 3;
      // Это выражение идентично предыдущему, но требует предварительного объявления возвращаемой переменной,
      // что считается bad practice
    if (x > 0) t = 1 else t = -1

      val any: Any = if (x > 0) "positive" else -1

      //Два выражения ниже - одно и то же
      val some: Unit = if (x > 0) 1
      val some1: Unit = if (x > 0) 1 else ()

      // Тернарных операторов нет. Совсем нет.
  }

  def statementTermination(): Unit = {
    var r = 0;
    var n = 0;
    if (n > 0) { r = r * n; n -= 1 } // Если зачем-то нужно что-то записать в одну строку, надо использовать ; . Но вообще, лучше так не делать

    /*
    If you want to continue a long statement over two lines, make sure that the first
    line ends in a symbol that cannot be the end of a statement.An operator is often a good choice:
      */
    val s0 = 1
    val v = 2
    val v0 = 1
    val t = 3
    val a = 4
    val a0 = 1
      val s = s0 + (v - v0) * t +
      0.5 * (a - a0) * t * t
  }

  def loop(): Unit = {
    var n = 5
    var r = 1
    while (n > 0) {
      r = r * n
      n -= 1
    }

    for (i <- 1 to n)
      r = r * i

    val s = "Hello"
    var sum = 0
    for (i <- 0 to s.length - 1)
      sum = sum + s(i)

    sum = 0
    for (ch <- "Hello") sum = sum + ch
  }

  def forLoops(): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d") // Prints 11 12 13 21 22 23 31 32 33
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d") // Prints 12 13 21 23 31 32
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d") // Prints 13 22 23 31 32 33

    for (i <- 1 to 10) yield i % 3 // Yields Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

    for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar // Yields "HIeflmlmop"
    for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar // Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')

  }

  def exceptions(): Unit = {
    val url = new URL("http://horstmann.com/fred-tiny.gif")
    try {
      process(url)
    } catch {
      case _: MalformedURLException => println(s"Bad URL: $url")
      case ex: IOException => ex.printStackTrace()
    }

    val in = new URL("http://horstmann.com/fred.gif").openStream()
    try {
      process(in)
    } finally {
      in.close()
    }
  }
  def process(stream: InputStream): Unit = {

  }
  def process(URL: URL): Unit = {

  }
}

