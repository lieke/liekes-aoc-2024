object Main:

  @main def adventOfCode2024(): Unit = {
    println("Welcome to Advent of Code 2024!")
    println("====Day1====")
    var initTime = System.currentTimeMillis
    println("The sum of distances is: " + Day1.getDistance)
    println("The similarity score is: " + Day1.getSimilarityScore)
    var elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
    println("====Day2====")
    initTime = System.currentTimeMillis
    println("The amount of safe reports is: " + Day2.getAmountOfSafeReports)
    println("The amount of safe dampened reports is: " + Day2.getTheAmountOfSafeDampenedReports)
    elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
    println("====Day3====")
    initTime = System.currentTimeMillis
    println("The multiplication result is: " + Day3.getTheInstructionTotal())
    println("The enabled multiplication result is: " + Day3.getTheEnabledInstructionTotal())
    elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
    println("====Day4====")
    initTime = System.currentTimeMillis
    val day4 = new Day4(Day4Data.input)
    println("The amount of XMASses is: " + day4.findAmountOfXMASses)
    println("The amount of crosses is: " + day4.findAmountOfCrosses)
    elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
    println("====Day5====")
    val day5 = new Day5(Day5Data.pageOrderingRules, Day5Data.updates)
    initTime = System.currentTimeMillis
    println("The sum of the middle pages of correct updates is: " + day5.theSumOfMiddlePagesOfCorrectUpdates)
    println("The sum of the middle pages of reordered incorrect updates is: " + day5.theSumOfMiddlePagesOfReorderedUpdates)
    elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }