object Day2 {

  def getAmountOfSafeReports: Int = {
    val sortedUpOrDown: List[List[Int]] =
      Day2Data.input.filter(x => Day2.isIncreasingOrDecreasing(x))
    val safeDifferences: List[Boolean] =
      sortedUpOrDown.map(Day2.isSafeDifferenceFilter(_))
    safeDifferences.filter(_ == true).length
  }

  def isIncreasingOrDecreasing(list: List[Int]): Boolean = {
    val sortedUp = list.sorted
    val sortedDown = list.sortWith(_ > _)
    list == sortedUp || list == sortedDown
  }

  def isSafeDifferenceFilter(list: List[Int]): Boolean = {
    var result: Boolean = true
    var resultList: List[Int] = list
    while (resultList.length > 1 && result) {
      val firstElement = resultList.head
      val secondElement = resultList.tail.head
      result = isSafeDifference(firstElement, secondElement)
      resultList = resultList.tail
    }
    result
  }

  def isSafeDifference(value1: Int, value2: Int): Boolean = {
    val difference = Math.abs(value1 - value2)
    difference > 0 && difference < 4
  }

  def getDampenedSafety(list: List[Int]): Boolean = {
    val dampenedList = getAllPermutations(list)
    val sortedUpOrDown: List[List[Int]] =
      dampenedList.filter(x => Day2.isIncreasingOrDecreasing(x))
    val safeDifferences: List[Boolean] =
      sortedUpOrDown.map(Day2.isSafeDifferenceFilter(_))
    safeDifferences.filter(_ == true).length > 0
  }

  def getAllPermutations(list: List[Int]): List[List[Int]] = {
    var result: List[List[Int]] = list :: Nil
    for (i <- 0 until list.length) {
      result = list.patch(i, Nil, 1) :: result
    }
    result
  }

  def getTheAmountOfSafeDampenedReports: Int = {
    Day2Data.input.map(Day2.getDampenedSafety(_)).filter(_ == true).length
  }
}
