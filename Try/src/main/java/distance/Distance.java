package distance;

public class Distance {

  public static void main(String[] args) {

    Point one = new Point(-1, 2);
    Point two = new Point(5, 5);

    System.out.println("Расстояние между точками А(" + one.x + ", " + one.y + ") и Б("+ two.x + ", " + two.y + ") = " + distance(one, two));

  }

  public static double distance(Point p1, Point p2) {
    // формула: AB = √(xb - xa)2 + (yb - ya)2

    return Math.sqrt( ((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y)) );

  }


}
