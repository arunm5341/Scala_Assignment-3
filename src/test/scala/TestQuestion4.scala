import org.scalatest.funsuite.AnyFunSuite

class TestQuestion4 extends AnyFunSuite{
  test("TestQuestion4"){
   assert("Hello"===Question4.fzero("Hello", s=> (s.reverse)))
  }

}
