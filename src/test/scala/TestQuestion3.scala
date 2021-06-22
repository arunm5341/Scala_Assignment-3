import org.scalatest.flatspec._

class TestQuestion3 extends AnyFlatSpec {
  assert(Question3.product(1)(2) === 3)
  assert(Question3.product(3)(2) === 6)

}