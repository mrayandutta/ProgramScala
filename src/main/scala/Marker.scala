class Marker private (val color: String) {
  override def toString(): String = "marker color " + color
}

object Marker extends App {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green"))
  def primaryColors = "red, green, blue"
  def apply(color: String) = if (markers.contains(color)) markers(color) else null

  println("Primary colors are : " + Marker.primaryColors)
  println(Marker("blue"))
  println(Marker("red"))
}

