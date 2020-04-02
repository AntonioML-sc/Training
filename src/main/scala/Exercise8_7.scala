object Exercise8_7 extends App {

  //  Provide a class Square that extends java.awt.Rectangle and has three con-
  //  structors: one that constructs a square with a given corner point and width,
  //  one that constructs a square with corner (0, 0) and a given width, and one
  //  that constructs a square with corner (0, 0) and width 0 .

  import java.awt.Rectangle

  class Square(x:Int, y:Int, side:Int) extends Rectangle(x,y,side,side) {
    // x, y are the coordinates of the upper left corner. For a square, heigtht = width = side
    def this(side:Int) {  // consider (0,0) as upper left corner
      this(0,0,side)
    }
    def this() {  // consider (0,0) as upper left corner and side = 0
      this(0,0,0)
    }
  }

  class Square2(x:Int = 0, y:Int = 0, side:Int = 0) extends Rectangle(x,y,side,side)
    // less verbose but you must use named arguments

  val sq1 = new Square(1,1,4)
  sq1.getWidth
  sq1.getMaxX
  val sq2 = new Square(6)
  sq2.getMaxY
  val sq3 = new Square()
  sq3.getSize
  val sq4 = new Square2(side=6)
  sq4.getSize
  sq4.getMinY
  val sq5 = new Square2(6)  // it takes x=6, y=0, side=0
}