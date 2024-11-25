
public class exp1 {
    private String name;

    // Default constructor
    public exp1() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    public exp1(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create Student objects
        exp1 student1 = new exp1();
        exp1 student2 = new exp1("Charlie");
        exp1 student3 = new exp1("Diana");

        // Print student names
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());
        System.out.println("Student 3: " + student3.getName());
    }
}
