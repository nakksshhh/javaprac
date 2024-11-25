class Student {
private String name;
private int age;
private String address;
public Student() {
this.name = "unknown";
this.age = 0;
this.address = "not available";
}
public void setInfo(String name, int age) {
this.name = name;
this.age = age;
}
public void setInfo(String name, int age, String address) {
this.name = name;
this.age = age;
this.address = address;
}
public void printInfo() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Address: " + address);
}
}
public class exp5 {
public static void main(String[] args) {
Student student = new Student();
student.setInfo("Robert", 30);
student.setInfo("Sophia", 24, "456 Oak Street");
student.printInfo();
}
}