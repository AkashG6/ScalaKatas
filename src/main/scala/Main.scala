package simpleTest

object Number extends App {

  def getSmallestDivisor(number:Int) : Int = {
    for (divisor: Int <- 2 to number)
      if (number%divisor == 0)
        return divisor
    return 1
  }

  def getPrimeFactors(number:Int) : List[Int] = {
    var primeFactors = List[Int]()
    var quotient = number
    while (quotient > 1) {
      var smallestDivisor = getSmallestDivisor(quotient)
      primeFactors = List.concat(primeFactors,List(smallestDivisor))
      quotient = quotient/smallestDivisor
    }
    return primeFactors.sorted
  }
}
