class TopoMap(input: List[String]) {

  val heightMap = getHeightMap(input)
  val possibleTrailheads = heightMap.filter(x => x._2 == 0).keys.toList
  var trails: List[List[(Int, Int)]] = getTheTrails()

  def getTheTrailheadScoresSum(): Int = {
    trails.map(_.toSet.size).sum
  }

  def getTheTrailheadRatingsSum(): Int = {
    trails.map(_.length).sum
  }

  def getTheTrails(): List[List[(Int, Int)]] = {
    var trails: List[List[(Int, Int)]] =
      possibleTrailheads.map(getPossibleNextSteps(_))
    for (height <- 2 to 9) {
      trails = trails.map(x => x.map(getPossibleNextSteps(_)).flatten)
    }
    trails
  }

  def getPossibleNextSteps(step: (Int, Int)): List[(Int, Int)] = {
    val stepX = step._1
    val stepY = step._2
    val valueAtStep = heightMap.getOrElse((stepX, stepY), -1)
    Map(
      (stepX - 1, stepY) -> heightMap.getOrElse((stepX - 1, stepY), -1),
      (stepX + 1, stepY) -> heightMap.getOrElse((stepX + 1, stepY), -1),
      (stepX, stepY - 1) -> heightMap.getOrElse((stepX, stepY - 1), -1),
      (stepX, stepY + 1) -> heightMap.getOrElse((stepX, stepY + 1), -1)
    ).filter(x => x._2 == valueAtStep + 1).keys.toList
  }

  def getHeightMap(input: List[String]): Map[(Int, Int), Int] = {
    input.indices
      .map(yIndex => {
        input(yIndex).indices.map(xIndex =>
          (xIndex, yIndex) -> input(yIndex)(xIndex).asDigit
        )
      })
      .flatten
      .toMap
  }
}
