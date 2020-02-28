public class Square {

  double l; // поле

  public Square (double l) { // конструктор, для приема аргументов к классу

    this.l = l;
  }

  public double area() {  // метод - функция класса

    return this.l * this.l;
  }
}
