object Day8 {}

class AntinodeMap(input: List[String]) {
  val antennaMap: Map[Char, List[Tuple2[Int, Int]]] = getAntennaMap(input)
  val xBoundary = input(0).length
  val yBoundary = input.length
  val combinationsList =
    antennaMap.values.toList.map(_.combinations(2).toList).flatten

  def getAntennaMap(input: List[String]): Map[Char, List[Tuple2[Int, Int]]] = {
    var antennas: Map[Char, List[Tuple2[Int, Int]]] = Map()
    for (y <- 0 to input.length - 1) {
      for (x <- 0 to input(y).length - 1) {
        val char: Char = input(y).charAt(x)
        char match {
          case '.' => // do nothing
          case _ => {
            val antennalist: List[Tuple2[Int, Int]] =
              antennas.getOrElse(char, List())
            antennas += char -> ((x, y) :: antennalist)
          }
        }
      }
    }
    antennas
  }

  def getAntinodeLocation(
      antenna1: Tuple2[Int, Int],
      antenna2: Tuple2[Int, Int]
  ): Tuple2[Int, Int] = {
    val xDifference = antenna2._1 - antenna1._1
    val yDifference = antenna2._2 - antenna1._2
    val antennaX = antenna2._1 + (xDifference)
    val antennaY = antenna2._2 + (yDifference)
    if (locationIsOnMap(antennaX, antennaY))
      (antennaX, antennaY)
    else (-1, -1)
  }

  def getTFrequencyAntinodeLocations(
      antenna1: Tuple2[Int, Int],
      antenna2: Tuple2[Int, Int]
  ): List[Tuple2[Int, Int]] = {
    val xDifference = antenna2._1 - antenna1._1
    val yDifference = antenna2._2 - antenna1._2
    var nextLocation =
      (antenna2._1 + (xDifference), antenna2._2 + (yDifference))
    var result: List[Tuple2[Int, Int]] = List(antenna1, antenna2)
    while (locationIsOnMap(nextLocation._1, nextLocation._2)) {
      result = nextLocation :: result
      nextLocation =
        (nextLocation._1 + (xDifference), nextLocation._2 + (yDifference))
    }
    result
  }

  def locationIsOnMap(xLocation: Int, yLocation: Int): Boolean = {
    xLocation > -1 && xLocation < xBoundary && yLocation > -1 && yLocation < yBoundary
  }

  def findAllAntinodeLocations(): Set[Tuple2[Int, Int]] = {
    val antinodeLocations = combinationsList
      .map(combi => {
        List(
          getAntinodeLocation(combi(0), combi(1)),
          getAntinodeLocation(combi(1), combi(0))
        )
      })
      .flatten
      .toSet
    antinodeLocations - ((-1, -1))
  }

  def findAllTFrequencyAntinodes(): Set[Tuple2[Int, Int]] = {
    val antinodeLocations = combinationsList
      .map(combi => {
        List(
          getTFrequencyAntinodeLocations(combi(0), combi(1)),
          getTFrequencyAntinodeLocations(combi(1), combi(0))
        )
      })
      .flatten
      .flatten
      .toSet
    antinodeLocations - ((-1, -1))
  }
}
