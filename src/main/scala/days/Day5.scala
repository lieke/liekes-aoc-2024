import scala.util.matching.Regex

class Day5(val rules: List[List[Int]], val updates: List[List[Int]]) {

  val correctUpdates: List[List[Int]] = updates.filter(checkUpdate(_))
  val incorrectUpdates: List[List[Int]] =
    updates.filter(!correctUpdates.contains(_))

  def checkUpdate(update: List[Int]): Boolean = {
    !rules
      .map(x => checkRuleAgainstUpdate(x, update))
      .contains(false)
  }

  def checkRuleAgainstUpdate(rule: List[Int], update: List[Int]): Boolean = {
    val intersection = update.intersect(rule)
    intersection == rule || intersection.length < 2
  }

  def getMiddlePageNumber(update: List[Int]): Int = {
    update(update.length / 2)
  }

  def theSumOfMiddlePagesOfCorrectUpdates: Int = {
    correctUpdates.map(getMiddlePageNumber(_)).sum
  }
}
