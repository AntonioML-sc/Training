object Exercise8_4 extends App {

  //  Define an abstract class Item with methods price and description . A SimpleItem is
  //  an item whose price and description are specified in the constructor. Take
  //  advantage of the fact that a val can override a def . A Bundle is an item that
  //  contains other items. Its price is the sum of the prices in the bundle. Also
  //  provide a mechanism for adding items to the bundle and a suitable description
  //  method.

  abstract class Item {
    def price:Double
    def description:String
  }
  class SimpleItem(val price:Double, val description:String) extends Item

  class Bundle(val bundlePrice:Double, val bundleName:String) extends Item {  // An item able to store simple items

    private var content:Array[SimpleItem] = new Array(0) // Stored items. I prefer not to stack bundles

    def price:Double = bundlePrice + content.map(_.price).sum  // price of the bundle itself + content's total price

    def description:String = { // description of bundle and its content
      if (content.length == 0)
        "An empty " + bundleName
      else
        bundleName + " with one " + content.map(_.description).mkString(", one ") + " inside."
    }

    def addSimpleItem(newConts:SimpleItem*) { // a method to add items to the bundle
      content = content ++ newConts
    }
  }

  val pen = new SimpleItem(1.2,"pen")
  val eraser = new SimpleItem(1.5,"eraser")
  val pencil = new SimpleItem(1.0,"pencil")
  val pencilCase = new Bundle(5.0,"pencil case")
  pencilCase.description
  pencilCase.addSimpleItem(pen,pencil,eraser)
  pencilCase.bundleName
  pencilCase.description
  pencilCase.bundlePrice
  pencilCase.price
}
