import scala.util.matching.Regex

case class Day4(val input: List[String]) {

  val coordinateList: Map[Tuple2[Int, Int], Char] = parseInput(input)

  val crossRegex: Regex =
    raw"MASMAS|SAMSAM|MASSAM|SAMMAS".r

  def findAmountOfXMASses: Int = {
    val startCoordinates: List[Tuple2[Int, Int]] =
      getAllStartCoordinates(coordinateList, 'X')
    val lookupList = startCoordinates.map(x => getScanCoordinates(x))
    lookupList
      .map(startingPoint =>
        startingPoint
          .map(potentialXMAS =>
            potentialXMAS.map(x => getChar(x, coordinateList)).mkString
          )
          .count(_ == "XMAS")
      )
      .sum
  }

  def findAmountOfCrosses: Int = {
    val startCoordinates: List[Tuple2[Int, Int]] =
      getAllStartCoordinates(coordinateList, 'A')
    val lookupList: List[List[Tuple2[Int, Int]]] =
      startCoordinates.map(x => getCrossCoordinates(x))
    lookupList
      .map(potentialCross =>
        potentialCross.map(x => getChar(x, coordinateList)).mkString
      )
      .count(x => crossRegex.matches(x))
  }

  def getChar(
      coor: Tuple2[Int, Int],
      list: Map[Tuple2[Int, Int], Char]
  ): Char = {
    list.getOrElse(coor, ' ')
  }

  def getAllStartCoordinates(
      coordinateList: Map[Tuple2[Int, Int], Char],
      char: Char
  ): List[Tuple2[Int, Int]] = {
    coordinateList.filter(x => x._2 == char).keys.toList
  }

  def parseInput(input: List[String]): Map[Tuple2[Int, Int], Char] = {
    var coordinateList: Map[Tuple2[Int, Int], Char] =
      Map[Tuple2[Int, Int], Char]()
    for (yCoodinate <- input.indices) {
      for (xCoodinate <- input(yCoodinate).indices) {
        coordinateList += (xCoodinate, yCoodinate) -> input(yCoodinate)
          .charAt(xCoodinate)
      }
    }
    coordinateList
  }

  def getScanCoordinates(
      coordinates: Tuple2[Int, Int]
  ): List[List[Tuple2[Int, Int]]] = {
    val x = coordinates._1
    val y = coordinates._2
    val up = List(coordinates, (x, y - 1), (x, y - 2), (x, y - 3))
    val right = List(coordinates, (x + 1, y), (x + 2, y), (x + 3, y))
    val down = List(coordinates, (x, y + 1), (x, y + 2), (x, y + 3))
    val left = List(coordinates, (x - 1, y), (x - 2, y), (x - 3, y))
    val rightUp =
      List(coordinates, (x + 1, y - 1), (x + 2, y - 2), (x + 3, y - 3))
    val rightDown =
      List(coordinates, (x + 1, y + 1), (x + 2, y + 2), (x + 3, y + 3))
    val leftDown =
      List(coordinates, (x - 1, y + 1), (x - 2, y + 2), (x - 3, y + 3))
    val leftUp =
      List(coordinates, (x - 1, y - 1), (x - 2, y - 2), (x - 3, y - 3))
    List(up, right, down, left, rightUp, rightDown, leftDown, leftUp)
  }

  def getCrossCoordinates(
      coordinates: Tuple2[Int, Int]
  ): List[Tuple2[Int, Int]] = {
    val x = coordinates._1
    val y = coordinates._2
    List(
      (x - 1, y - 1),
      (x, y),
      (x + 1, y + 1),
      (x - 1, y + 1),
      (x, y),
      (x + 1, y - 1)
    )
  }
}
