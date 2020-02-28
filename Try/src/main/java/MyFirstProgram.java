public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello, world!");
    print("Serg");
  }

  public static void print(String name) {

    System.out.println("Hello, " + name);

    Square s = new Square(5);
    Square s2 = new Square(10);

    Rectangle r = new Rectangle(4, 7);
    Rectangle r2 = new Rectangle(2, 2);

    System.out.println("Площадь квадрата со сторонй " + s.l + " = " + area(s));
    System.out.println("Площадь квадрата со сторонй " + s2.l + " = " + area(s2));

    System.out.println("Пдощадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    System.out.println("Пдощадь прямоугольника со сторонами " + r2.a + " и " + r2.b + " = " + area(r2));

  }

  public static double area(Square n) {

    return n.l * n.l;
  }

  public static double area(Rectangle u) {

    return u.a * u.b;
  }
}