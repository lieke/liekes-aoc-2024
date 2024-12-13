import org.scalatest._
import flatspec._
import matchers._

class Day10Spec extends AnyFlatSpec with should.Matchers {

  val input: List[String] = List(
    "89010123",
    "78121874",
    "87430965",
    "96549874",
    "45678903",
    "32019012",
    "01329801",
    "10456732"
  )

  val topoMap = new TopoMap(input)

  "The coordinates of the possible trailheads" should "be found" in {
    topoMap.possibleTrailheads.length shouldBe 9
  }

  "The next possible steps in a trail" should "be found" in {
    val nextPossibleSteps = topoMap.getPossibleNextSteps((0, 0))
    nextPossibleSteps.contains(0, 1) shouldBe false
    nextPossibleSteps.contains(1, 0) shouldBe true
  }

  "The sum of the scores of all trailheads on your topographic map" should "be found" in {
    topoMap.getTheTrailheadScoresSum() shouldBe 36
  }

  "The sum of the ratings of all trailheads on your topographic map" should "be found" in {
    topoMap.getTheTrailheadRatingsSum() shouldBe 81
  }
}
