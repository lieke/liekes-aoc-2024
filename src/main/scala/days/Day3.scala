import scala.util.matching.Regex

object Day3 {
  val mulRegex = raw"mul\((\d{1,3}),(\d{1,3})\)".r
  val doDontMulRegex = raw"do\(\)|don\'t\(\)|mul\((\d{1,3}),(\d{1,3})\)".r
  var doOrDont: Boolean = true

  def findAllMulInstructions(inputString: String): List[String] = {
    Day3.mulRegex.findAllIn(inputString).toList
  }

  def findAllInstructions(inputString: String): List[String] = {
    Day3.doDontMulRegex.findAllIn(inputString).toList
  }

  def parseTheInstructions(inputString: String): List[List[Int]] = {
    val instructions = findAllMulInstructions((inputString))
    instructions.map(
      _.replace("mul(", "").replace(")", "").split(",").toList.map(_.toInt)
    )
  }

  def getTheInstructionTotal(inputString: String): Int = {
    val parsedInstructions = parseTheInstructions(inputString)
    parsedInstructions.map(x => x(0) * x(1)).sum
  }

  def disAbleOrEnable(instruction: String): Int = {
    val mulPattern: Regex = raw"(\d+),(\d+)".r
    val trimmedInstruction = instruction.replace("mul(", "").replace(")", "")
    trimmedInstruction match {
      case "do("    => { doOrDont = true; return 0 }
      case "don't(" => { doOrDont = false; return 0 }
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
