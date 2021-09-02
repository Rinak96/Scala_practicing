package arithmetic {
  class S99Int(val start: Int) {
    import S99Int._

    // P31 (**) Determine whether a given integer number is prime.
    def isPrime = {
      if (start <= 2) {true}
      else {
        var i = 2
        var result: Boolean = true
        while (i <= Math.sqrt(start)){
          if (start % i == 0) {result = false}
          i = i + 1
        }
        result
      }
    }
  }
  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    def gcd(num1: S99Int , num2: S99Int): S99Int = num2.start match{
      case 0 => num1
      case _ => gcd(num2, (S99Int.int2S99Int(num1.start % num2.start)))
    }
  }
}