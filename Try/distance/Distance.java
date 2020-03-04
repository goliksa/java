package distance;

public class Distance {

  public static void main(String[] args) {

    Point one = new Point(-1, 2);
    Point two = new Point(5, 5);

    System.out.println("Расстояние между точками А(" + one.x + ", " + one.y + ") и Б("+ two.x + ", " + two.y + ") = " + one.distance(two));
  }

}
