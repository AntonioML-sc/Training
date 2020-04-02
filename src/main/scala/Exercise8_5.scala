object Exercise8_5 extends App {

  //  Design a class Point whose x and y coordinate values can be provided in a
  //  constructor. Provide a subclass LabeledPoint whose constructor takes a label
  //  value and x and y coordinates, such as
  //
  //    new LabeledPoint("Black Thursday", 1929, 230.07)

  class Point(val x:Double, val y:Double)

  class LabelledPoint(val label:String, x:Double, y:Double) extends Point(x,y) {
    def getTuple = (label, x, y)
  }

  val blackThursday = new LabelledPoint("Black Thursday",1929,230.07)

  blackThursday.getTuple

}