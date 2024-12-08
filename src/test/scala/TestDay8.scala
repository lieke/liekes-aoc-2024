import org.scalatest._
import flatspec._
import matchers._

class Day8Spec extends AnyFlatSpec with should.Matchers {

  val antennas1 = new AntinodeMap(test1WithoutAntinodes)
  val antennas = new AntinodeMap(testInput)

  "The locations of all the antennas" should "be found" in {
    antennas1.antennaMap.getOrElse('a', List()) shouldBe List((5, 5), (4, 3))
    antennas1.antennaMap.size shouldBe 1

    antennas.antennaMap.size shouldBe 2
    antennas.antennaMap.getOrElse('0', List()).length shouldBe 4
    antennas.antennaMap.getOrElse('A', List()).length shouldBe 3
  }

  "The antinode locations" should "be correctly calculated" in {
    antennas1.getAntinodeLocation((4, 3), (5, 5)) shouldBe (6, 7)
    antennas1.getAntinodeLocation((5, 5), (4, 3)) shouldBe (3, 1)
  }

  "The antinode locations" should "be found" in {
    val antinodeLocations = antennas.findAllAntinodeLocations()
    antinodeLocations.size shouldBe 14
  }

  "The t-frequency antinode locations" should "be found" in {
    val antinodeLocations = antennas.findAllTFrequencyAntinodes()
    antinodeLocations.size shouldBe 34
  }

}

val testInput: List[String] =
  List(
    "............",
    "........0...",
    ".....0......",
    ".......0....",
    "....0.......",
    "......A.....",
    "............",
    "............",
    "........A...",
    ".........A..",
    "............",
    "............"
  )
val test1: List[String] = List(
  "..........",
  "...#......",
  "..........",
  "....a.....",
  "..........",
  ".....a....",
  "..........",
  "......#...",
  "..........",
  ".........."
)

val withAntinodes: List[String] = List(
  "##....#....#",
  ".#.#....0...",
  "..#.#0....#.",
  "..##...0....",
  "....0....#..",
  ".#...#A....#",
  "...#..#.....",
  "#....#.#....",
  "..#.....A...",
  "....#....A..",
  ".#........#.",
  "...#......##"
)

val test1WithoutAntinodes: List[String] = test1.map(x => x.replace('#', '.'))
