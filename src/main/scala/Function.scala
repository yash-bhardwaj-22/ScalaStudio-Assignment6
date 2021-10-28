object Function extends App {
  //val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val add: Function2[Int,Int,Int] = new Function2[Int,Int,Int] {
    override def apply(x: Int, y: Int): Int = x+y
  }
  //val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  val sumOfList: Function1[List[Int],Int] = new Function[List[Int],Int] {
    override def apply(list: List[Int]): Int = list.sum
  }
  //val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
  //val higherOrderFunction:

}





