import scala.util.matching.Regex

class Day6(val input: List[String]) {

  var guardPosition: Tuple2[Int, Int] = (0, 0)
  var guardDirection: Tuple2[Int, Int] = (0, 0)
  val map: Map[Tuple2[Int, Int], Char] = parseInput(input)

  def getChar(
      coor: Tuple2[Int, Int]
  ): Char = {
    map.getOrElse(coor, ' ')
  }

  def findAllLoopPossibilities: Int = {
    val normalLab = new Laboratory(map, guardPosition, guardDirection)
    normalLab.predictPath
    val possibleExtraObstructions =
      normalLab.visitedPositions
        .map(_._1)
        .toSet
        .toList
        .filter(_ != guardPosition)
    val loopPossibilities = possibleExtraObstructions.map(x => {
      val lab =
        new Laboratory(map, guardPosition, guardDirection, x)
      lab.predictPath
      lab.isLoop
    })
    loopPossibilities.filter(_ == true).length
  }

  def parseInput(input: List[String]): Map[Tuple2[Int, Int], Char] = {
    var coordinateList: Map[Tuple2[Int, Int], Char] =
      Map[Tuple2[Int, Int], Char]()
    for (yCoodinate <- input.indices) {
      for (xCoodinate <- input(yCoodinate).indices) {
        var char = input(yCoodinate).charAt(xCoodinate)
        char match {
          case '^' => char = setGuard((xCoodinate, yCoodinate), (0, -1))
          case '>' => char = setGuard((xCoodinate, yCoodinate), (1, 0))
          case 'v' => char = setGuard((xCoodinate, yCoodinate), (0, 1))
          case '<' => char = setGuard((xCoodinate, yCoodinate), (-1, 0))
          case _   =>
        }
        coordinateList += (xCoodinate, yCoodinate) -> char
      }
    }
    coordinateList
  }

  def setGuard(
      coordinate: Tuple2[Int, Int],
      directon: Tuple2[Int, Int]
  ): Char = {
    guardPosition = coordinate
    guardDirection = directon
    '.'
  }
}

class Laboratory(
    val inputMap: Map[Tuple2[Int, Int], Char],
    val initialGuardPosition: Tuple2[Int, Int],
    val initialGuardDirection: Tuple2[Int, Int]
) {
  var guardPosition: Tuple2[Int, Int] = initialGuardPosition
  var guardDirection: Tuple2[Int, Int] = initialGuardDirection
  var visitedPositions: List[Tuple2[Tuple2[Int, Int], Tuple2[Int, Int]]] =
    List((initialGuardPosition, initialGuardDirection))
  var offTheMap: Boolean = false
  var isLoop: Boolean = false
  var map = inputMap

  def this(
      inputMap: Map[Tuple2[Int, Int], Char],
      initialGuardPosition: Tuple2[Int, Int],
      initialGuardDirection: Tuple2[Int, Int],
      extraObstruction: Tuple2[Int, Int]
  ) = {
    this(
      inputMap + (extraObstruction -> '#'),
      initialGuardPosition,
      initialGuardDirection
    )
  }

  def predictPath = {
    while (!offTheMap && !isLoop) {
      move
    }
  }
  def move = {
    var intendedPosition = (
      guardPosition._1 + guardDirection._1,
      guardPosition._2 + guardDirection._2
    )
    getChar(intendedPosition) match {
      case ' ' => offTheMap = true
      case '#' =>
        guardDirection = {
          turn(guardDirection)
        }
      case _ => guardPosition = intendedPosition
    }
    if (
      !offTheMap && visitedPositions.contains((guardPosition, guardDirection))
    ) isLoop = true
    else if (!offTheMap)
      visitedPositions = (guardPosition, guardDirection) :: visitedPositions
  }

  def getVisitedPositions: Int = {
    visitedPositions.map(_._1).toSet.size
  }

  def turn(original: Tuple2[Int, Int]): Tuple2[Int, Int] = {
    original match {
      case (1, 0)  => (0, 1)
      case (0, 1)  => (-1, 0)
      case (-1, 0) => (0, -1)
      case (0, -1) => (1, 0)
      case _       => (0, 0)
    }
  }

  def getChar(
      coor: Tuple2[Int, Int]
  ): Char = {
    map.getOrElse(coor, ' ')
  }

  def printPath = {
    var sb = new StringBuilder("")
    for (y <- 0 to 9) {
      for (x <- 0 to 9) {
        val inPath = visitedPositions.filter(_._1 == (x, y))
        val howOftenInPath = inPath.length
        if (getChar(x, y) == '#') sb += '#'
        else if (howOftenInPath > 1) sb += '+'
        else if (howOftenInPath == 1) {
          if (inPath(0)._2 == (0, -1) || inPath(0)._2 == (0, 1)) sb += '|'
          else sb += '-'
        } else sb += '.'
      }
      println(sb)
      sb = new StringBuilder("")
    }
  }
}
