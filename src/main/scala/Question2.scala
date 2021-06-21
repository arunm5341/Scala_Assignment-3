object Question2 extends App{
  val greater = (x: Int, y: Int) => if (x > y) x else y

  def maximum(tuple: (Int, Int, Int), compare: (Int, Int) => Int): Int =
  {
    compare(tuple._1, compare(tuple._2, tuple._3))
  }

def  nextInt= util.Random.nextInt

  greater(nextInt, nextInt)

  val tuple = (nextInt, nextInt, nextInt)

  println((tuple, greater))
  println(maximum(tuple, (x, y) => if (x < y) x else y))
  println(maximum(tuple, (x, y) => x))

}
