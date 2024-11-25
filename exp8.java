class Shape {
public void printInfo() {
System.out.println("This is a shape");
}
}
class Polygon extends Shape {
@Override
public void printInfo() {
System.out.println("Polygon is a shape");
}
}
class Rectangle extends Polygon {
@Override
public void printInfo() {
System.out.println("Rectangle is a polygon");
}
}
class Triangle extends Polygon {
@Override
public void printInfo() {
System.out.println("Triangle is a polygon");
}
}
class Square extends Rectangle {
@Override
public void printInfo() {
System.out.println("Square is a rectangle");
}
}
public class exp8 {
public static void main(String[] args) {
Shape shape = new Shape();
Polygon polygon = new Polygon();
Rectangle rectangle = new Rectangle();
Triangle triangle = new Triangle();
Square square = new Square();
shape.printInfo();
polygon.printInfo();
rectangle.printInfo();
triangle.printInfo();
square.printInfo();
}
}