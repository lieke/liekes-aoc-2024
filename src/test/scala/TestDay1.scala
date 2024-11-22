import org.scalatest._
import flatspec._
import matchers._

val testData: List[String] =
  List("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet")

class Day1Spec extends AnyFlatSpec with should.Matchers {

  "The day one object" should "have the right return string in the printSomething method" in {
    Day1.printSomething() shouldBe "this is day one"
  }

}
