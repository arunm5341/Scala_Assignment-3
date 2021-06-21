import Question1.greater
import org.scalatest.funsuite.AnyFunSuite

class TestQuestion1 extends AnyFunSuite {
  test("TestSample") {
    assert(Question1.maximum((1, 2, 3),greater) === 3)
  }
}