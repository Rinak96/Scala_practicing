

object Hello {
  def main(args: Array[String]): Unit =
    assert(P01.lastRecursive(List(1,2,3,4)) == 4)
    assert(P02.lastButOne(List(1,2,3,4)) == 3)
    assert(P03.kthElement(1,List(1,2,3,4)) == 2)
    assert(P03.kthElement(0,List(1,2,3,4)) == 1)
    assert(P03.kthElement(3,List(1,2,3,4)) == 4)
    assert(P04.numberOfElements(List(1,2,3,4)) == 4)
    assert(P04.numberOfElements(List()) == 0)
    assert(P05.reverseList(List(1,2,3)) == List(3,2,1))
    assert(!P06.isPalindrome(List(1, 2, 3)))
    assert(P06.isPalindrome(List(3, 2, 1, 2, 3)))
    assert(P06.isPalindrome(List(3, 2, 2, 3)))
    // doesnt work ,why??
    //assert(P07.flattenList(List((1,2),2,3)) == List(1,2,2,3))
}