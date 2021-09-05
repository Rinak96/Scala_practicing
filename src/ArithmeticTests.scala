import arithmetic.S99Int
import arithmetic.S99Int.int2S99Int

import scala.collection.immutable.HashMap
object ArithmeticTests {
  def main(args: Array[String]): Unit =
    assert(2.isPrime)
    assert(1.isPrime)
    assert(17.isPrime)
    assert(!18.isPrime)
    assert(!115.isPrime)
    assert(S99Int.gcd(10,15).start == 5)
    assert(S99Int.gcd(35,10).start == 5)
    assert(S99Int.gcd(31,2).start == 1)
    assert(S99Int.coPrime(35,64))
    assert(!S99Int.coPrime(10,15))
    assert(2.totient() == 1)
    assert(10.totient() == 4)
    assert(315.primeFactors == List(3, 3, 5, 7))
    assert(10.primeFactorsMap == HashMap(2 -> 1, 5 -> 1))
    assert(315.primeFactorsMap == HashMap(3 -> 2, 5 -> 1, 7 -> 1))
    assert(6.goldbachsConjecture() == (Some(3),Some(3)))
    assert(10.goldbachsConjecture() == (Some(3),Some(7)))
    //S99Int.int2S99Int(10).goldbachsConjectureList(2 to 10,3)
}
