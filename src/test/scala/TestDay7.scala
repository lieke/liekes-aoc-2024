import org.scalatest._
import flatspec._
import matchers._

class Day7Spec extends AnyFlatSpec with should.Matchers {

  "All combinations of multiplicaitons or additions" should "be calculated" in {
    Day7.findAllCombinatorOutcomes(
      testInput(0)._2,
      testInput(0)._1
    ) shouldBe 190
    Day7.findAllCombinatorOutcomes(
      testInput(1)._2,
      testInput(1)._1
    ) shouldBe 3267
    Day7.findAllCombinatorOutcomes(testInput(2)._2, testInput(2)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(testInput(3)._2, testInput(3)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(testInput(4)._2, testInput(4)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(testInput(5)._2, testInput(5)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(testInput(6)._2, testInput(6)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(testInput(7)._2, testInput(7)._1) shouldBe 0
    Day7.findAllCombinatorOutcomes(
      testInput(8)._2,
      testInput(8)._1
    ) shouldBe 292
    Day7.findAllCombinatorOutcomes(List(6, 2, 2, 2, 2), 14) shouldBe 14
  }

  "The total calibration result" should "be correctly calcultated" in {
    testInput
      .map(x => Day7.findAllCombinatorOutcomes(x._2, x._1))
      .sum shouldBe 3749
  }
}

val testInput: List[Tuple2[Long, List[Int]]] = List(
  (190, List(10, 19)),
  (3267, List(81, 40, 27)),
  (83, List(17, 5)),
  (156, List(15, 6)),
  (7290, List(6, 8, 6, 15)),
  (161011, List(16, 10, 13)),
  (192, List(17, 8, 14)),
  (21037, List(9, 7, 18, 13)),
  (292, List(11, 6, 16, 20))
)
