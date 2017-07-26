import org.scalatest._
import FizzBuzz._

class TestFizzBuzzSpec extends FlatSpec with Matchers {

  "fizzBuzz" should " return corresponding 'FizzBuzz'values for number passed" in {

    for (i <- 1 to 100) {
      val data =
        i match {
          case i if i % 15 == 0 => "FizzBuzz"
          case i if i % 5  == 0 => "Buzz"
          case i if i % 3  == 0 => "Fizz"
          case _                => i.toString
        }
      assert(fizzBuzz(i) === data)     
    }
  } 
}
