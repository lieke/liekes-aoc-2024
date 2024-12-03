import org.scalatest._
import flatspec._
import matchers._
import scala.util.matching.Regex

private val testData: String =
  "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"

private val testData2: String =
  "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))"

class Day3Spec extends AnyFlatSpec with should.Matchers {

  "The mul instructions regex" should "be correct" in {
    Day3.mulRegex.matches("mul(1,2)") shouldBe true
    Day3.mulRegex.matches("mul(11,22)") shouldBe true
    Day3.mulRegex.matches("mul(111,222)") shouldBe true
    Day3.mulRegex.matches("mul(1111,2212)") shouldBe false
    Day3.mulRegex.matches("mul( 111, 212)") shouldBe false
    Day3.mulRegex.matches("mul[1,2]") shouldBe false
  }

  "All of the mul instructions" should "be found" in {
    val instructions = Day3.findAllMulInstructions(testData)
    instructions(0) shouldBe "mul(2,4)"
    instructions(1) shouldBe "mul(5,5)"
    instructions.length shouldBe 4
  }

  "The total of the instructions" should "be correctly calculated" in {
    val total: Int = Day3.getTheInstructionTotal(testData)
    total shouldBe 161
  }

  "The do and dont regexes" should "be correct" in {
    Day3.doDontMulRegex.matches("do()") shouldBe true
    Day3.doDontMulRegex.matches("do( )") shouldBe false
    Day3.doDontMulRegex.matches("don't()") shouldBe true
    Day3.doDontMulRegex.matches("don't( )") shouldBe false
    Day3.doDontMulRegex.matches("mul(2,3)") shouldBe true
    Day3.doDontMulRegex.matches("mul(2222,3333)") shouldBe false
  }

  "All of the instructions" should "be found" in {
    val instructions = Day3.findAllInstructions(testData2)
    instructions.length shouldBe 6
    instructions(1) shouldBe "don't()"
  }

  "The instructions" should "be enabled or disabled based on do or dont" in {
    val instructions = Day3.findAllInstructions(testData2)
    Day3.disAbleOrEnable(instructions(1)) shouldBe 0
    Day3.doOrDont shouldBe false
    Day3.disAbleOrEnable(instructions(4)) shouldBe 0
    Day3.doOrDont shouldBe true
    Day3.disAbleOrEnable(instructions(0)) shouldBe 8
  }

  "The multiplcation of the enabled instructions" should "be correctly calculated" in {
    Day3.getEnabledInstructionTotal(testData2) shouldBe 48
  }
}
