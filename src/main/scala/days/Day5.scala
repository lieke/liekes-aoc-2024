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

  def theSumOfMiddlePagesOfReorderedUpdates: Int = {
    val reorderedUpdates = incorrectUpdates.map(reorderWrongUpdate(_))
    reorderedUpdates.map(getMiddlePageNumber(_)).sum
  }

  def reorderWrongUpdate(update: List[Int]): List[Int] = {
    var result = update
    while (!checkUpdate(result)) {
      rules.foreach(x => result = applyRule(result, x))
    }
    result
  }

  def applyRule(update: List[Int], rule: List[Int]): List[Int] = {
    var result = update
    val indexOfWhatShouldBeFirst: Int = update.indexOf(rule(0))
    val indexOfWhatShouldBeLast: Int = update.indexOf(rule(1))
    if (
      indexOfWhatShouldBeFirst > -1 && indexOfWhatShouldBeLast > -1 && indexOfWhatShouldBeFirst > indexOfWhatShouldBeLast
    ) {
      result = result.updated(indexOfWhatShouldBeFirst, rule(1))
      result = result.updated(indexOfWhatShouldBeLast, rule(0))
    }
    result
  }
}
