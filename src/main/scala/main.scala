object Main:

  @main def adventOfCode2024(): Unit = {
    var initTime = System.currentTimeMillis
    println("Welcome to Advent of Code 2024!")
    println("====Day1====")
    println("The sum of distances is: " + Day1.getDistance)
    println("The similarity score is: " + Day1.getSimilarityScore)
    var elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }