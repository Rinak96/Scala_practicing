import arithmetic.S99Int
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
}
