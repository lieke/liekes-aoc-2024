import scala.util.matching.Regex

object Day3 {
  val mulRegex = raw"mul\((\d{1,3}),(\d{1,3})\)".r
  val doDontMulRegex = raw"do\(\)|don\'t\(\)|mul\((\d{1,3}),(\d{1,3})\)".r
  val mulPattern: Regex = raw"mul\((\d+),(\d+)\)".r
  var doOrDont: Boolean = true

  def findAllMulInstructions(inputString: String): List[String] = {
    Day3.mulRegex.findAllIn(inputString).toList
  }

  def findAllInstructions(inputString: String): List[String] = {
    Day3.doDontMulRegex.findAllIn(inputString).toList
  }

  def getTheInstructionTotal(inputString: String): Int = {
    val instructions = findAllMulInstructions((inputString))
    instructions
      .map(x =>
        x match {
          case mulPattern(x, y) => x.toInt * y.toInt
        }
      )
      .sum
  }

  def disAbleOrEnable(instruction: String): Int = {
    instruction match {
      case "do()"    => { doOrDont = true; return 0 }
      case "don't()" => { doOrDont = false; return 0 }
      case mulPattern(x, y) => {
        if (doOrDont) return x.toInt * y.toInt else return 0
      }
    }
  }

  def getEnabledInstructionTotal(inputString: String): Int = {
    val instructions = Day3.findAllInstructions(inputString)
    var sum: Int = 0
    instructions.foreach(elem => sum = Day3.disAbleOrEnable(elem) + sum)
    sum
  }

  def getTheInstructionTotal(): Int = {
    getTheInstructionTotal(Day3Data.input)
  }

  def getTheEnabledInstructionTotal(): Int = {
    getEnabledInstructionTotal(Day3Data.input)
  }
}
