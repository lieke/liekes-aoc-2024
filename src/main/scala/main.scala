object main:

  @main def adventOfCode2024(): Unit = {
    var initTime = System.currentTimeMillis
    println("Welcome to Advent of Code 2024!")
    Day1.printSomething()
    var elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }