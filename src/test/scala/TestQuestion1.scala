
import org.scalatest._

class TestQuestion1 extends AnyFunSuite {
  test("TestSample") {
    assert(Question1.greater(1,2)===2)
    assert(Question1.maximum((1, 2, 3),greater) === 3)
  }
}
class TestQuestion1 extends AnyFlatSpec {
  it should "match" in {
    assert(  3 == Question1.greater(3,2))
    assert( 3== Question1.maximum((1,2,3),greater))
  }
}
