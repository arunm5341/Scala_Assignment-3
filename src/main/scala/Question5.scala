object Question5 extends App {
  def conditional[A](x: A, p: A => Boolean, f: A => A) = {
    if (p(x)) f(x) else x
  }
  
}


