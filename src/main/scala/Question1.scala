object Question1 extends App {

  var greater = (x: Int, y: Int) =>
  {
    if (x > y) x else y
  }

  def maximum(tuple: (Int, Int, Int), compare: (Int, Int) => Int): Int =
  {
    compare(tuple._1, compare(tuple._2, tuple._3))
  }

 
}
