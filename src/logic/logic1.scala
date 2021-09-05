package logic {
  object S99Logic {
    // P46 (**) Truth tables for logical expressions.
    def and(exp1: Boolean, exp2: Boolean): Boolean = (exp1,exp2) match {
      case (true,true) => true
      case _ => false
    }
    def or(exp1: Boolean, exp2: Boolean): Boolean = (exp1,exp2) match {
      case (false,exp2) => exp2
      case _ => true
    }
    def equ(exp1: Boolean, exp2: Boolean): Boolean = {
      exp1 == exp2
    }
    def xor(exp1: Boolean, exp2: Boolean): Boolean = not(equ(exp1,exp2))
    def nand(exp1: Boolean, exp2: Boolean): Boolean = not(and(exp1,exp2))
    def nor(exp1: Boolean, exp2: Boolean): Boolean = not(or(exp1,exp2))
    def not(exp1: Boolean): Boolean = exp1 match{
      case true => false
      case _ => true
    }
    def table2(func: (Boolean,Boolean)=> Boolean): Unit = {
      println("A      B     result")
      for (a <- List(true,false)) {
        for (b <- List(true,false)){
          println(a +"   "+ b + "    "+ func(a,b))
        }
      }
    }

    // P49 (**) Gray code.
    def gray(number: Int) : Unit ={
      var max = Math.pow(2, number).ceil.toInt
      var code :List[String] = (List fill max)("0")
      var i :Int = 0
      for (i <- 0 until max){
        println(convertToGray(padding(i.toBinaryString,number)))
      }
    }

    def padding(num: String,len: Int): String = {
      var padding_str = "0"*(len-num.size)
      padding_str + num
    }

    def convertToBool(ch: Char): Boolean = ch match{
      case '0' => false
      case _ => true
    }

    def convertToChar(ch: Boolean): Char = ch match{
      case false => '0'
      case _ => '1'
    }

    def convertToGray(num: String): String = {
      var gray_code :StringBuilder = new StringBuilder(num)
      var i = 1
      for (ch <- num){
        if( i < num.length){
          var result = xor(convertToBool(ch),convertToBool(num.charAt(i)))
          gray_code.setCharAt(i,convertToChar(result))
          i += 1
        }
      }
      gray_code.toString()
    }
  }
}