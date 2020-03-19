object Exercise8_6 extends App {

  class Point(val x:Double, val y:Double) { // not required, but used in exercise 5, so...
    def toTuple: (Double, Double) = (x,y)
  }

  abstract class Shape {
    def centerPoint:Point
  }

  class Rectangle(val corner1:Point, val corner2:Point) extends Shape {
    // consider corner1 and corner 2 as opposite corners of the rectangle
    import scala.math.{abs}
    def centerPoint:Point = new Point((corner1.x + corner2.x)/2, (corner1.y + corner2.y)/2)
    def width:Double = abs(corner2.x - corner1.x)  // not required
    def height:Double = abs(corner2.y - corner1.y)  // not required
    def area:Double = width * height  // not required
  }

  class Circle(val centerPoint:Point, val radius:Double) extends Shape {
    // center point is provided in the constructor
    import scala.math.{Pi,pow}
    def area:Double =  Pi * pow(radius,2)  // not required
  }

  val point1 = new Point(1,1)
  val point2 = new Point(-3,-3)
  val rectangle1 = new Rectangle(point1,point2)
  val circle1 = new Circle(point2,2)
  rectangle1.centerPoint.toTuple
  rectangle1.height
  rectangle1.area
  circle1.centerPoint.toTuple
  circle1.area
}