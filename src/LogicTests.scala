import logic.S99Logic

object LogicTests {
  def main(args: Array[String]): Unit =
    assert(S99Logic.and(true,true))
    assert(!S99Logic.and(false,true))
    assert(S99Logic.or(true,false))
    assert(!S99Logic.or(false,false))
    assert(S99Logic.nand(false,false))
    assert(S99Logic.not(false))
    assert(!S99Logic.xor(false,false))
    assert(!S99Logic.xor(true,true))
    //S99Logic.table2((a: Boolean, b: Boolean) => S99Logic.and(a, S99Logic.or(a, b)))
    //S99Logic.gray(3)
}
