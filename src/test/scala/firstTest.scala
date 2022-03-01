package simpleTest

import org.scalatest.funsuite.AnyFunSuite

class PrimeFactorTests extends AnyFunSuite {
  test("prime factor of 1 should be empty list") {
    val primeFactors = Number.getPrimeFactors(1)
    assert(primeFactors == List[Int]())
  }

  test("prime factor of 2 should be list with 1 element which is 2") {
    val primeFactors = Number.getPrimeFactors(2)
    assert(primeFactors == List[Int](2))
  }

  test("prime factor of 3 should be list with 1 element which is 3") {
    val primeFactors = Number.getPrimeFactors(3)
    assert(primeFactors == List[Int](3))
  }

  test("prime factor of 4 should be list with 2 elements which is 2,2") {
    val primeFactors = Number.getPrimeFactors(4)
    assert(primeFactors == List[Int](2,2))
  }

  test("prime factor of 5 should be list with 1 element which is 5") {
    val primeFactors = Number.getPrimeFactors(5)
    assert(primeFactors == List[Int](5))
  }

  test("prime factor of 6 should be list with 2 elements which is 2,3") {
    val primeFactors = Number.getPrimeFactors(6)
    assert(primeFactors == List[Int](2,3))
  }

  test("prime factor of 180 should be list with 5 elements which is 2,2,3,3,5") {
    val primeFactors = Number.getPrimeFactors(180)
    assert(primeFactors == List[Int](2,2,3,3,5))
  }

}