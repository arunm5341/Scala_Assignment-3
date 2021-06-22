
import org.scalatest.flatspec._


class TestQuestion1 extends AnyFlatSpec {
  it should "match" in {
    assert(  3 == Question1.greater(3,2))
    assert( 3== Question1.maximum((1,2,3),greater))
  }
}
