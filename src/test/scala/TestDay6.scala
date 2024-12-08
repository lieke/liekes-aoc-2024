import org.scalatest._
import flatspec._
import matchers._

class Day6Spec extends AnyFlatSpec with should.Matchers {

  val day6 = new Day6(testdata)

  "The map of the lab" should "be correctly parsed" in {
    day6.getChar((0, 0)) shouldBe '.'
    day6.getChar((16, 0)) shouldBe ' '
    day6.getChar((1, 6)) shouldBe '#'
    day6.guardPosition shouldBe (4, 6)
    day6.guardDirection shouldBe (0, -1)
  }

  "The patrol path of the guard" should "be correctly predicted" in {
    val lab = new Laboratory(day6.map, day6.guardPosition, day6.guardDirection)
    lab.visitedPositions.size shouldBe 1
    lab.predictPath
    lab.getVisitedPositions shouldBe 41
    lab.isLoop shouldBe false
    lab.offTheMap shouldBe true
  }

  "The patrol path of the guard" should "be correctly predicted in the extra testdata" in {
    val day6extra = new Day6(extraTestdata)
    val lab = new Laboratory(
      day6extra.map,
      day6extra.guardPosition,
      day6extra.guardDirection
    )
    lab.predictPath
    lab.getVisitedPositions shouldBe 4
    lab.isLoop shouldBe true
    lab.offTheMap shouldBe false

    val lab2 = new Laboratory(
      day6extra.map,
      day6extra.guardPosition,
      day6extra.guardDirection,
      (1, 1)
    )
    lab2.predictPath
    // println(lab2.visitedPositions)
    lab2.offTheMap shouldBe true
  }

  "The patrol path with an extra obstacle" should "be correctly predicted" in {
    val lab1 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (3, 6))
    lab1.predictPath
    lab1.isLoop shouldBe true
    val lab2 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (6, 7))
    lab2.predictPath
    lab2.isLoop shouldBe true
    val lab3 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (7, 7))
    lab3.predictPath
    lab3.isLoop shouldBe true
    val lab4 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (1, 8))
    lab4.predictPath
    lab4.isLoop shouldBe true
    val lab5 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (3, 8))
    lab5.predictPath
    lab5.isLoop shouldBe true
    val lab6 =
      new Laboratory(day6.map, day6.guardPosition, day6.guardDirection, (7, 9))
    lab6.predictPath
    lab6.isLoop shouldBe true
  }

  "All possible patrol paths with a loop" should "be found" in {
    val amountOfLoopPossibilities = day6.findAllLoopPossibilities
    amountOfLoopPossibilities shouldBe 6
  }
}

val testdata: List[String] = List(
  "....#.....",
  ".........#",
  "..........",
  "..#.......",
  ".......#..",
  "..........",
  ".#..^.....",
  "........#.",
  "#.........",
  "......#..."
)

val extraTestdata: List[String] = List(
  ".#..",
  "...#",
  "#^..",
  "..#."
)
