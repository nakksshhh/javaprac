class Bank {
public int getBalance() {
return 0;
}
}
class BankA extends Bank {
@Override
public int getBalance() {
return 1000;
}
}
class BankB extends Bank {
@Override
public int getBalance() {
return 1500;
}
}
class BankC extends Bank {
@Override
public int getBalance() {
return 2000;
}
}
public class exp6 {
public static void main(String[] args) {
Bank bankA = new BankA();
Bank bankB = new BankB();
Bank bankC = new BankC();
System.out.println("Balance in Bank A: $" + bankA.getBalance());
System.out.println("Balance in Bank B: $" + bankB.getBalance());
System.out.println("Balance in Bank C: $" + bankC.getBalance());
}
}