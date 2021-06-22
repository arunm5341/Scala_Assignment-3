import Question2._
import org.scalatest.flatspec.AnyFlatSpec

class TestQuestion2 extends AnyFlatSpec{
  assert(nextInt===Question2.maximum(tuple=(nextInt,nextInt,nextInt), (x, y) => if (x < y) x else y))
  assert(nextInt=Question2.maximum(tuple=(nextInt,nextInt,nextInt),(x, y) => x))

}
