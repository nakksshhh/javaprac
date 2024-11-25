class Rectangle {
private int length;
private int breadth;

public Rectangle() {
this.length = 0;
this.breadth = 0;
}
public Rectangle(int length, int breadth) {
this.length = length;
this.breadth = breadth;
}
public Rectangle(int side) {
this.length = side;
this.breadth = side;
}
public int calculateArea() {
return length * breadth;
}
}
public class exp3 {
public static void main(String[] args) {
Rectangle rect1 = new Rectangle();
System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
Rectangle rect2 = new Rectangle(5, 10);
System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
Rectangle rect3 = new Rectangle(7);
System.out.println("Area of Rectangle 3: " + rect3.calculateArea());
}
}