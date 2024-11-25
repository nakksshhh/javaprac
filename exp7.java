class Employee {
protected String employeeName;
protected int employeeId;
protected double basicSalary;
public Employee(String employeeName, int employeeId, double basicSalary) {
this.employeeName = employeeName;
this.employeeId = employeeId;
this.basicSalary = basicSalary;
}
public void displayInfo() {
System.out.println("Employee Name: " + employeeName);
System.out.println("Employee ID: " + employeeId);
System.out.println("Basic Salary: $" + basicSalary);
}
}
class SalaryCalculator extends Employee {
private double hra;
private double da;
private double pf;
private double grossSalary;
public SalaryCalculator(String employeeName, int employeeId, double basicSalary) {
super(employeeName, employeeId, basicSalary);
}
public void grossCal() {
hra = 0.1 * basicSalary;
da = 0.05 * basicSalary;
pf = 0.08 * basicSalary;
grossSalary = basicSalary + hra + da - pf;
}
public void showSalarySlip() {
System.out.println("--- Salary Slip ---");
System.out.println("Employee Name: " + employeeName);
System.out.println("Employee ID: " + employeeId);
System.out.println("Basic Salary: $" + basicSalary);
System.out.println("HRA: $" + hra);
System.out.println("DA: $" + da);
System.out.println("PF: $" + pf);
System.out.println("Gross Salary: $" + grossSalary);
}
}
public class exp7 {
public static void main(String[] args) {
SalaryCalculator emp = new SalaryCalculator("John Doe", 12345, 5000);
emp.displayInfo();
emp.grossCal();
emp.showSalarySlip();
}
}