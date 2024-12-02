object Day1 {

  def getDistance: Int = {
    val sorted = getTwoSortedLists(Day1Data.input)
    getSumOfDistances(sorted)
  }

  def getTwoSortedLists(
      innputData: List[Tuple2[Int, Int]]
  ): List[Tuple2[Int, Int]] = {
    val unzipped: Tuple2[List[Int], List[Int]] = innputData.unzip
    val sortedLists: List[List[Int]] =
      List(unzipped._1, unzipped._2).map(_.sorted)
    val zipped: List[Tuple2[Int, Int]] = sortedLists(0) zip sortedLists(1)
    zipped
  }

  def getSumOfDistances(unzippedSortedList: List[Tuple2[Int, Int]]): Int = {
    unzippedSortedList.map(x => (x._1 - x._2).abs).sum
  }

  def getSimilarityScore: Int = {
    val similarityScores = findSimilarityScores(Day1Data.input)
    similarityScores.sum
  }

  def findSimilarityScores(input: List[Tuple2[Int, Int]]): List[Int] = {
    val unzipped: Tuple2[List[Int], List[Int]] = input.unzip
    val firstList: List[Int] = unzipped._1
    val secondList: List[Int] = unzipped._2
    firstList.map(x => secondList.count(_ == x) * x)
  }
}
