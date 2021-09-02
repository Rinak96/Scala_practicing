// P01 (*) Find the last element of a list.
object P01 {
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

// P02 (*) Find the last but one element of a list.
object P02 {
  def lastButOne[A](lst: List[A]): A = lst match{
    case l1 :: l2 :: Nil => l1
    case _ :: tail => lastButOne(tail)
    case _ => throw new NoSuchElementException
  }
}

// P03 (*) Find the Kth element of a list.
object P03 {
  def kthElement[A](k: Int,lst: List[A]): A = (k,lst) match{
    case (0,l :: tail) => l
    case (k, _:: tail) => kthElement(k-1, tail)
    case (_,_) => throw new NoSuchElementException
  }
}

// P04 (*) Find the number of elements of a list.
object P04 {
  def numberOfElements[A](lst: List[A]): Int = lst match{
    case Nil => 0
    case l :: Nil => 1
    case _:: tail => 1 + numberOfElements(tail)
  }
}

// P05 (*) Reverse a list.
object P05 {
  def reverseList[A](lst: List[A]): List[A] = {
    if (lst.isEmpty) { Nil;}
    else {
      var result: List[A] = List()
      for(elem <- lst)
        result = elem :: result
      result;
    }
  }
}

// P06 (*) Find out whether a list is a palindrome.
object P06 {
  def isPalindrome[A](lst: List[A]): Boolean = {
    if (lst.isEmpty) { false }
    else {
      if (P05.reverseList(lst) == lst) true
      else false
    }
  }
}

// P07 (**) Flatten a nested list structure.
object P07 {
  def flattenList(lst: List[Any]): List[Any] = lst match{
    case Nil => Nil
    case (head: List[_]) :: tail => flattenList(head):: flattenList(tail)
    case head :: tail => head::flattenList(tail)
  }
}

//P08 (**) Eliminate consecutive duplicates of list elements.
object P08 {
  def noDupElements(lst: List[Any]): List[Any] = lst match{
    case Nil => Nil
  }
}