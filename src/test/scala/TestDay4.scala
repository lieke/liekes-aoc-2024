import org.scalatest._
import flatspec._
import matchers._

private val testData: List[String] =
  List(
    "MMMSXXMASM",
    "MSAMXMSMSA",
    "AMXSXMAAMM",
    "MSAMASMSMX",
    "XMASAMXAMM",
    "XXAMMXXAMA",
    "SMSMSASXSS",
    "SAXAMASAAA",
    "MAMMMXMMMM",
    "MXMXAXMASX"
  )

class Day4Spec extends AnyFlatSpec with should.Matchers {

  val day4 = new Day4(testData)

  "The datainput" should "be parsed" in {
    val coordinateList: Map[Tuple2[Int, Int], Char] = day4.coordinateList

    coordinateList.getOrElse((0, 0), "") shouldBe 'M'
    coordinateList.getOrElse((0, 8), "") shouldBe 'M'
    coordinateList.getOrElse((8, 0), "") shouldBe 'S'
    coordinateList.getOrElse((9, 9), "") shouldBe 'X'
    coordinateList.getOrElse((-1, -1), "") shouldBe ""
  }

  "The potential start indexes of XMAS" should "all be found" in {
    val coordinateList: Map[Tuple2[Int, Int], Char] = day4.coordinateList
    val startCoordinates: List[Tuple2[Int, Int]] =
      day4.getAllStartCoordinates(coordinateList, 'X')
    startCoordinates.contains((9, 9)) shouldBe true
    startCoordinates.contains((4, 0)) shouldBe true
    startCoordinates.contains((9, 3)) shouldBe true
  }

  "The amount of XMASses in the input" should "be found" in {
    val amountOfXMASses = day4.findAmountOfXMASses
    amountOfXMASses shouldBe 18
  }

  "The amount of Crosses in the input" should "be found" in {
    val amountOfXMASses = day4.findAmountOfCrosses
    amountOfXMASses shouldBe 9
  }
}
