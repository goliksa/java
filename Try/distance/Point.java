package distance;

public class Point {
  double x;
  double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p2) {
    // формула: AB = √(xb - xa)2 + (yb - ya)2

    return Math.sqrt( ((this.x - p2.x) * (this.x - p2.x)) + ((this.y - p2.y) * (this.y - p2.y)) );

  }
}
