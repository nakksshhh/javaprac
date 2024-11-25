public class ShapeArea {
public void printArea(int length, int breadth)
{ int area = length * breadth;
System.out.println("Area of Rectangle: " + area);
}
public void printArea(int side)
{ int area = side * side;
System.out.println("Area of Square: " + area);
}
}
public class exp4 {
public static void main(String[] args) {
ShapeArea shape = new ShapeArea();
shape.printArea(4, 10);
shape.printArea(8);
}
}