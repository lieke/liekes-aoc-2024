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
  }