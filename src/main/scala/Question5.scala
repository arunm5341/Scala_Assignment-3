object Question5 extends App {
  def conditional[A](x: A, p: A => Boolean, f: A => A) = {
    if (p(x)) f(x) else x
  }
  val a = conditional[String]("aRYUn", _.size > 2, _.reverse)
  val a1 = conditional[Int](45, _ % 3 == 0, _ =>4)
println(a1,a)

}


