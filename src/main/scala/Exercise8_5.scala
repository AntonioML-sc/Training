object Exercise8_5 extends App {

  class Point(val x:Double, val y:Double)

  class LabelledPoint(val label:String, x:Double, y:Double) extends Point(x,y) {
    def getTuple = (label, x, y)
  }

  val blackThursday = new LabelledPoint("Black Thursday",1929,230.07)

  blackThursday.getTuple

}