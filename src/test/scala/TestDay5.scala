import org.scalatest._
import flatspec._
import matchers._

class Day5Spec extends AnyFlatSpec with should.Matchers {

  val day5 = new Day5(testOrderingRules, testUpdates)

  "A single ordering rule" should "be checked against an update" in {
    day5.checkRuleAgainstUpdate(
      testOrderingRules(0),
      testUpdates(0)
    ) shouldBe true
    day5.checkRuleAgainstUpdate(
      testOrderingRules(15),
      testUpdates(3)
    ) shouldBe false
    day5.checkRuleAgainstUpdate(
      testOrderingRules(19),
      testUpdates(0)
    ) shouldBe true
  }

  "An update" should "be correctly identified as correct or incorrect" in {
    val checkUpdateRule1 = day5.checkUpdate(testUpdates(0))
    val checkUpdateRule4 = day5.checkUpdate(testUpdates(3))
    checkUpdateRule1 shouldBe true
    checkUpdateRule4 shouldBe false
  }

  "We" should "get an overview of which updates are correct" in {
    val updateChecks = testUpdates.filter(day5.checkUpdate(_))
    updateChecks.length shouldBe 3
    updateChecks(2) shouldBe List(75, 29, 13)
  }

  "The middle page number of an update" should "be found" in {
    day5.getMiddlePageNumber(testUpdates(0)) shouldBe 61
    day5.getMiddlePageNumber(testUpdates(2)) shouldBe 29
  }

  "The sum of the middle pages of correct updates" should "be found" in {
    day5.theSumOfMiddlePagesOfCorrectUpdates shouldBe 143
  }

  "The incorrect updates" should "be correctly determined" in {
    day5.incorrectUpdates.length shouldBe 3
    day5.incorrectUpdates(1) shouldBe List(61, 13, 29)
  }

  "An incorrectly ordered update" should "be reordered correctly" in {
    var update = List(97, 13, 75, 29, 47)
    val newUpdate = day5.applyRule(update, List(47, 13))
    newUpdate shouldBe List(97, 47, 75, 29, 13)
    val newNewUpdate = day5.applyRule(update, List(13, 99))
    newNewUpdate shouldBe List(97, 13, 75, 29, 47)
    day5.reorderWrongUpdate(update) shouldBe List(97, 75, 47, 29, 13)
    day5.reorderWrongUpdate(List(75, 97, 47, 61, 53)) shouldBe List(97, 75, 47,
      61, 53)
  }

  "The sum of the middle pages of reordered updates" should "be found" in {
    day5.theSumOfMiddlePagesOfReorderedUpdates shouldBe 123
  }
}

val testOrderingRules: List[List[Int]] = List(
  List(47, 53),
  List(97, 13),
  List(97, 61),
  List(97, 47),
  List(75, 29),
  List(61, 13),
  List(75, 53),
  List(29, 13),
  List(97, 29),
  List(53, 29),
  List(61, 53),
  List(97, 53),
  List(61, 29),
  List(47, 13),
  List(75, 47),
  List(97, 75),
  List(47, 61),
  List(75, 61),
  List(47, 29),
  List(75, 13),
  List(53, 13)
)

val testUpdates: List[List[Int]] = List(
  List(75, 47, 61, 53, 29), // ok
  List(97, 61, 53, 29, 13), // ok
  List(75, 29, 13), // ok
  List(75, 97, 47, 61, 53), // nok
  List(61, 13, 29), // nok
  List(97, 13, 75, 29, 47) // nok
)
