import scala.collection.mutable.ArrayBuffer

object Arr {

  def fixed(): Unit = {
    val nums = new Array[Int](10) // An array of ten integers, all initialized with zero
    val a = new Array[String](10) // A string array with ten elements, all initialized with null
    val s = Array("Hello", "World") // An Array[String] of length 2—the type is inferred
    // Note: No new when you supply initial values
    s(0) = "Goodbye" // Array("Goodbye", "World")
    // Use () instead of [] to access elements
  }

  // insert и remove походу deprecated, надо смотреть аналоги в доках
  def variableLength(): Unit = {
    // An empty array buffer, ready to hold integers
    val b = ArrayBuffer[Int]() // Or new ArrayBuffer[Int]
    // Add an element at the end with +=
    b += 1 // ArrayBuffer(1)
    // Add multiple elements at the end by enclosing them in parentheses
    b += (1, 2, 3, 5) // ArrayBuffer(1, 1, 2, 3, 5)
    // You can append any collection with the ++= operator
    b ++= Array(8, 13, 21) // ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
    // Removes the last five elements
    b.trimEnd(5) // ArrayBuffer(1, 1, 2)


    // Insert before index 2
    b.insert(2, 6) // ArrayBuffer(1, 1, 6, 2)

    b.remove(2) // ArrayBuffer(1, 1, 8, 9, 6, 2)
    // The second parameter tells how many elements to remove
    b.remove(2, 3)// ArrayBuffer(1, 1, 2)

    // Array(1, 1, 2)
    b.toArray
  }

  def transform(): Unit = {
    val a = Array(2, 3, 5, 7, 11)
    //If you started with an array, you get another array. If you started with an array buffer, that’s what you get from for/yield.
    val result = for (elem <- a) yield 2 * elem // result is Array(4, 6, 10, 14, 22)

    //guard: an if inside the for. Result is a new collection - the original collection is not affected
    for (elem <- a if elem % 2 == 0) yield 2 * elem

    //remove all negative elements from an array buffer of integers - In
    // Scala, the obvious solution is to use a for/yield loop and keep all non-negative elements
    val filtered = for (elem <- a if elem >= 0) yield elem
  }

  def commonAlgo(): Unit = {
    //to use the sum method, the element type must be a numeric type
    Array(1, 7, 2, 9).sum // 19

    val b = ArrayBuffer(1, 7, 2, 9)
    val bSorted = b.sorted // b is unchanged; bSorted is ArrayBuffer(1, 2, 7, 9)

    // min and max methods yield the smallest and largest element in an array or array buffer

    ArrayBuffer("Mary", "had", "a", "little", "lamb").max // "little"

    val bDescending = b.sortWith(_ > _) // ArrayBuffer(9, 7, 2, 1)

    val a = Array(1, 7, 2, 9)
    scala.util.Sorting.quickSort(a) // a is now Array(1, 2, 7, 9)

    a.mkString(" and ") // "1 and 2 and 7 and 9"
    a.mkString("<", ",", ">") // "<1,2,7,9>

    // This is the useless toString method from Java
    a.toString// "[I@b73e5"
    // The toString method reports the type, which is useful for debugging
    b.toString // "ArrayBuffer(1, 7, 2, 9)"

    // бинарный поиск
    val c = Array("Mary", "a", "had", "lamb", "little")
    val result = c.search("beef")
  }

  def multidimensional(): Unit = {
    val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns
    val row = 0
    val column = 0
    matrix(row)(column) = 42

    //ragged arrays, with varying row lengths:
    val triangle = new Array[Array[Int]](10)
    for (i <- triangle.indices)
      triangle(i) = new Array[Int](i + 1)
  }

}
