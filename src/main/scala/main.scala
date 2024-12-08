object Main:

  @main def adventOfCode2024(): Unit = {
    println("Welcome to Advent of Code 2024!")
    day1()
    day2()
    day3()
    day4()
    day5()
    day6() takes too long
    day7() takes too long
    day8()
    day9()
  }

  def dayX() = {
    println("====DayX====")
    val initTime = System.currentTimeMillis
    println("Part 1 is: ")
    println("Part 2 is: ")
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day9() = {
    println("====Day9====")
    val initTime = System.currentTimeMillis
    println("Part 1 is: ")
    println("Part 2 is: ")
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day8() = {
    println("====Day8====")
    val initTime = System.currentTimeMillis
    val antennas = new AntinodeMap(Day8Data.input)
    val antinodeLocations = antennas.findAllAntinodeLocations()
    val tFrequencyAntinodeLocations = antennas.findAllTFrequencyAntinodes()
    println("The amount of antinode locations is: " + antinodeLocations.size)
    println("The amount of t-frequency antinode locations is: " + tFrequencyAntinodeLocations.size)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds") // 3 ms
  }

  def day7() = {
    println("====Day7====")
    val initTime = System.currentTimeMillis
    val totalCalibrationResult = Day7Data.input.map(x => Day7.findAllCombinatorOutcomes(x._2, x._1)).sum 
    val totalCalibrationResultWithConcatenator = Day7Data.input.map(x => Day7.findAllCombinatorOutcomesWithConcatenator(x._2, x._1)).sum 
    println("The total calibration result is: " + totalCalibrationResult)
    //This takes about 24 minutes :(
    //println("The total calibration result with concatenator is: " + totalCalibrationResultWithConcatenator)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds") //1460829 ms
  }

  def day6() = {
    println("====Day6====")
    val initTime = System.currentTimeMillis
    val day6 = new Day6(Day6Data.input)
    val lab = new Laboratory(day6.map, day6.guardPosition, day6.guardDirection)
    lab.predictPath
    println("The predicted path of the guard is : " + lab.getVisitedPositions + " positions")
    //This takes about 4 minutes :(
    //println("The amount of possibile loop possibilities is : " + day6.findAllLoopPossibilities)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day5() = {
    println("====Day5====")
    val initTime = System.currentTimeMillis
    val day5 = new Day5(Day5Data.pageOrderingRules, Day5Data.updates)
    println("The sum of the middle pages of correct updates is: " + day5.theSumOfMiddlePagesOfCorrectUpdates)
    println("The sum of the middle pages of reordered incorrect updates is: " + day5.theSumOfMiddlePagesOfReorderedUpdates)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day4() = {
    println("====Day4====")
    val initTime = System.currentTimeMillis
    val day4 = new Day4(Day4Data.input)
    println("The amount of XMASses is: " + day4.findAmountOfXMASses)
    println("The amount of crosses is: " + day4.findAmountOfCrosses)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day3() = {
    println("====Day3====")
    val initTime = System.currentTimeMillis
    println("The multiplication result is: " + Day3.getTheInstructionTotal())
    println("The enabled multiplication result is: " + Day3.getTheEnabledInstructionTotal())
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }
  
  def day2() = {
    println("====Day2====")
    val initTime = System.currentTimeMillis
    println("The amount of safe reports is: " + Day2.getAmountOfSafeReports)
    println("The amount of safe dampened reports is: " + Day2.getTheAmountOfSafeDampenedReports)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }

  def day1() = {
    println("====Day1====")
    val initTime = System.currentTimeMillis
    println("The sum of distances is: " + Day1.getDistance)
    println("The similarity score is: " + Day1.getSimilarityScore)
    val elapsedTime = System.currentTimeMillis-initTime
    println("This took " + elapsedTime + " milliseconds")
  }