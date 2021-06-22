import org.scalatest.funsuite.AnyFunSuite

class TestQuestion4 extends AnyFunSuite{
  test("TestQuestion4"){
   assert("olleH"===Question4.fzero("Hello", s=> (s.reverse)))
  }

}
