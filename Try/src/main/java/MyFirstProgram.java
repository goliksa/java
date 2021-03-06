public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello, world!");
    System.out.println("");

    print("Serg");
    System.out.println();

    printAreas();
    printDistanse();
  }

  public static void print(String name) {

    System.out.println("Hello, " + name);
  }

  public static void printAreas() {

    Square s = new Square(5);
    Square s2 = new Square(10);

    Rectangle r = new Rectangle(4, 7);
    Rectangle r2 = new Rectangle(2, 2);

    System.out.println("Площадь квадрата со сторонй " + s.l + " = " + s.area());
    System.out.println("Площадь квадрата со сторонй " + s2.l + " = " + s2.area());
    System.out.println("");

    System.out.println("Пдощадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    System.out.println("Пдощадь прямоугольника со сторонами " + r2.a + " и " + r2.b + " = " + r2.area());
  }

  public static void printDistanse() {

    Point one = new Point(2, 2);
    Point two = new Point(5, 5);

    System.out.println("Расстояние между точками А(" + one.x + ", " + one.y + ") и Б(" + two.x + ", " + two.y + ") = " + one.distance(two));
  }
}