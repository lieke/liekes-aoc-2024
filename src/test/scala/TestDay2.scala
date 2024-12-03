import org.scalatest._
import flatspec._
import matchers._

private val testData: List[List[Int]] = List(
  List(7, 6, 4, 2, 1),
  List(1, 2, 7, 8, 9),
  List(9, 7, 6, 2, 1),
  List(1, 3, 2, 4, 5),
  List(8, 6, 4, 4, 1),
  List(1, 3, 6, 7, 9)
)

class Day2Spec extends AnyFlatSpec with should.Matchers {

  "Only decreasing or increasing reports" should "be safe" in {
    val sortedUpOrDown: List[List[Int]] =
      testData.filter(x => Day2.isIncreasingOrDecreasing(x))
    sortedUpOrDown.length shouldBe 5
  }

  "Only increases differences between 1 and 3" should "be safe" in {
    val sortedUpOrDown: List[List[Int]] =
      testData.filter(x => Day2.isIncreasingOrDecreasing(x))
    val safeDifferences: List[Boolean] =
      sortedUpOrDown.map(Day2.isSafeDifferenceFilter(_))
    safeDifferences.filter(_ == true).length shouldBe 2
  }

  "The problem dampener" should "be correctly applied" in {
    val smallList = List(1, 2, 3)
    val dampenedList = Day2.getAllPermutations(smallList)
    dampenedList.length shouldBe 4
    dampenedList(0) shouldBe List(1, 2)
  }

  "A dampened list" should "be correctly identified as safe" in {
    val isSafe1: Boolean = Day2.getDampenedSafety(testData(0))
    val isSafe2: Boolean = Day2.getDampenedSafety(testData(3))
    val isSafe3: Boolean = Day2.getDampenedSafety(testData(4))
    val isSafe4: Boolean = Day2.getDampenedSafety(testData(5))
    isSafe1 shouldBe true
    isSafe2 shouldBe true
    isSafe3 shouldBe true
    isSafe4 shouldBe true
  }

  "A dampened list" should "be correctly identified as unsafe" in {
    val isSafe1: Boolean = Day2.getDampenedSafety(testData(1))
    val isSafe2: Boolean = Day2.getDampenedSafety(testData(2))
    isSafe1 shouldBe false
    isSafe2 shouldBe false
  }

  "The amount of dampened safe lists" should "be correctly identified" in {
    val amountOfSafeLists =
      testData.map(Day2.getDampenedSafety(_)).filter(_ == true).length
    amountOfSafeLists shouldBe 4
  }
}
