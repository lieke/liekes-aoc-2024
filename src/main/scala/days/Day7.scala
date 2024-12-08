import scala.util.matching.Regex

object Day7 {
  def findAllCombinatorOutcomes(
      inputList: List[Int],
      testValue: Long
  ): Long = {
    var outcomes: List[Long] = List(inputList(0))
    for (x <- 1 to (inputList.length - 1)) {
      val amountToDrop = outcomes.length
      outcomes.map(intermediateResult => {
        val nextValue = inputList(x)
        outcomes =
          outcomes :+ (intermediateResult * nextValue).toLong :+ (intermediateResult + nextValue).toLong
      })
      outcomes = outcomes.drop(amountToDrop).filter(_ <= testValue)
    }
    if (outcomes.contains(testValue)) testValue else 0
  }
}
