package arithmetic {
  import scala.collection.mutable
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

    // P34 (**) Calculate Euler's totient function phi(m).
    def totient() : Int = {
      var i = 1
      var count = 0
      while(i<= this.start) {
        if (coPrime(this, S99Int.int2S99Int(i))) {
          count += 1
        }
        i += 1
      }
      count
    }

    // P35 (**) Determine the prime factors of a given positive integer.
    def primeFactors: List[Int] = {
      def primeFactorsR(n: Int, ps: List[Int]): List[Int] = {
        if (n.isPrime) List(n)
        else if (n % ps.head == 0) ps.head :: primeFactorsR(n / ps.head, ps)
        else primeFactorsR(n, ps.tail)
      }
      var lst = 2 to start
      var primes : List[Int] = lst.toList.filter((i)=> S99Int.int2S99Int(i).isPrime)
      primeFactorsR(start, primes)
    }

    // P36 (**) Determine the prime factors of a given positive integer (2).
    def primeFactorsMap: collection.mutable.Map[Int, Int] = {
      var primeFactors = collection.mutable.Map[Int, Int]()
      var primes = this.primeFactors
      for (num <- primes) {
        primeFactors += (num -> 0)
      }
      for (num <- primes) {
        primeFactors(num) += 1
      }
      primeFactors
    }

    // P40 (**) Goldbach's conjecture.
    def goldbachsConjecture(limit: Int = 2) : Tuple2[Option[Int],Option[Int]] = {
      var lst = limit to start
      var primes : List[Int] = lst.toList.filter((i)=> S99Int.int2S99Int(i).isPrime)
      for (prime <- primes){
        var found = primes.find(x => x == start-prime)
        if (found != None) {
          return (Some(prime),found)
        }
      }
      (None,None)
    }

    // P41 (**) A list of Goldbach compositions.
    def goldbachsConjectureList (r: Range,limit: Int = 2): Unit = {
      for (num <- r){
        if(num % 2 == 0 && num >= limit){
          var result = S99Int.int2S99Int(num).goldbachsConjecture(limit)
          println(num ," = ", result._1, " + ", result._2)
        }
      }
    }
  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    // P32 (**) Determine the greatest common divisor of two positive integer numbers.
    def gcd(num1: S99Int , num2: S99Int): S99Int = num2.start match{
      case 0 => num1
      case _ => gcd(num2, (S99Int.int2S99Int(num1.start % num2.start)))
    }

    // P33 (*) Determine whether two positive integer numbers are coprime.
    def coPrime(num1: S99Int,num2: S99Int): Boolean = gcd(num1,num2).start match {
      case 1 => true
      case _ => false
    }
  }
}