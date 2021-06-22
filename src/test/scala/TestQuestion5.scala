import org.scalatest.funsuite.AnyFunSuite

class TestQuestion5 extends AnyFunSuite{
  test("TestQuestion5"){
    assert("nUYRa"===Question5.conditional[String]("aRYUn", _.size > 2, _.reverse))
    assert(4===Question5.conditional[Int](45, _ % 3 == 0, _ =>4))

  }


}
