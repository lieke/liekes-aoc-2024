import org.scalatest._
import flatspec._
import matchers._

val testData1: List[Tuple2[Int, Int]] =
  List((3, 4), (4, 3), (2, 5), (1, 3), (3, 9), (3, 3))

class Day1Spec extends AnyFlatSpec with should.Matchers {

  "The testdata" should "be split into two sorted lists" in {
    val unzippedList: List[Tuple2[Int, Int]] = Day1.getTwoSortedLists(testData1)
    unzippedList(0)(0) shouldBe 1
    unzippedList(0)(1) shouldBe 3
    unzippedList(5)(0) shouldBe 4
    unzippedList(5)(1) shouldBe 9
  }

  "The distance between to points in a list" should "be calculated" in {
    val unzippedSortedList: List[Tuple2[Int, Int]] =
      Day1.getTwoSortedLists(testData1)
    Day1.getSumOfDistances(unzippedSortedList) shouldBe 11
  }

  "The similarity score of a location ID" should "be found" in {
    val similarityScores = Day1.findSimilarityScores(testData1)
    similarityScores shouldBe List(9, 4, 0, 0, 9, 9)
    val totalSimilarityScore = similarityScores.sum
    totalSimilarityScore shouldBe 31
  }
}
