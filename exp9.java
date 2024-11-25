import java.util.ArrayList;
import java.util.List;
interface Account {
void deposit(double amount);
void withdraw(double amount);
void calculateInterest();
void viewBalance();
}
class SavingsAccount implements Account {
private double balance;
private double interestRate;
public SavingsAccount(double initialBalance, double interestRate) {
this.balance = initialBalance;
this.interestRate = interestRate;
}
@Override
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited $" + amount + " into Savings Account. New Balance: $" + balance);
}
@Override
public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
System.out.println("Withdrew $" + amount + " from Savings Account. New Balance: $" +
balance);
} else {
System.out.println("Insufficient funds in Savings Account.");
}
}
@Override
public void calculateInterest() {
double interest = balance * (interestRate / 100);
balance += interest;
System.out.println("Interest of $" + interest + " added to Savings Account. New Balance: $" +
balance);
}
@Override
public void viewBalance() {
System.out.println("Savings Account Balance: $" + balance);
}
}
class CurrentAccount implements Account {
private double balance;
private double overdraftLimit;
public CurrentAccount(double initialBalance, double overdraftLimit) {
this.balance = initialBalance;
this.overdraftLimit = overdraftLimit;
}
@Override
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited $" + amount + " into Current Account. New Balance: $" + balance);
}
@Override
public void withdraw(double amount) {
if (balance - amount >= -overdraftLimit) {
balance -= amount;
System.out.println("Withdrew $" + amount + " from Current Account. New Balance: $" +
balance);
} else {
System.out.println("Overdraft limit exceeded in Current Account.");
}
}
@Override
public void calculateInterest() {
System.out.println("No interest calculation for Current Account.");
}
@Override
public void viewBalance() {
System.out.println("Current Account Balance: $" + balance);
}
}
class Bank {
private List<Account> accounts;
public Bank() {
accounts = new ArrayList<>();
}
public void addAccount(Account account) {
accounts.add(account);
System.out.println("Account added to the bank.");
}
public void showAllBalances() {
for (Account account : accounts) {
account.viewBalance();
}
}
}
public class exp9 {
public static void main(String[] args) {
Bank bank = new Bank();
SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
CurrentAccount currentAccount = new CurrentAccount(500, 200);
bank.addAccount(savingsAccount);
bank.addAccount(currentAccount);
savingsAccount.deposit(200);
savingsAccount.calculateInterest();
savingsAccount.withdraw(500);
currentAccount.deposit(100);
currentAccount.withdraw(700);
currentAccount.withdraw(200);
bank.showAllBalances();
}
}