import arithmetic.S99Int

import scala.collection.immutable.HashMap
object ArithmeticTests {
  def main(args: Array[String]): Unit =
    assert(S99Int.int2S99Int(2).isPrime)
    assert(S99Int.int2S99Int(1).isPrime)
    assert(S99Int.int2S99Int(17).isPrime)
    assert(!S99Int.int2S99Int(18).isPrime)
    assert(!S99Int.int2S99Int(115).isPrime)
    assert(S99Int.gcd(S99Int.int2S99Int(10),S99Int.int2S99Int(15)).start == 5)
    assert(S99Int.gcd(S99Int.int2S99Int(35),S99Int.int2S99Int(10)).start == 5)
    assert(S99Int.gcd(S99Int.int2S99Int(31),S99Int.int2S99Int(2)).start == 1)
    assert(S99Int.coPrime(S99Int.int2S99Int(35),S99Int.int2S99Int(64)))
    assert(!S99Int.coPrime(S99Int.int2S99Int(10),S99Int.int2S99Int(15)))
    assert(S99Int.int2S99Int(2).totient() == 1)
    assert(S99Int.int2S99Int(10).totient() == 4)
    assert(S99Int.int2S99Int(315).primeFactors == List(3, 3, 5, 7))
    assert(S99Int.int2S99Int(10).primeFactorsMap == HashMap(2 -> 1, 5 -> 1))
    assert(S99Int.int2S99Int(315).primeFactorsMap == HashMap(3 -> 2, 5 -> 1, 7 -> 1))
    assert(S99Int.int2S99Int(6).goldbachsConjecture() == (Some(3),Some(3)))
    assert(S99Int.int2S99Int(10).goldbachsConjecture() == (Some(3),Some(7)))
    //S99Int.int2S99Int(10).goldbachsConjectureList(2 to 10,3)
}
