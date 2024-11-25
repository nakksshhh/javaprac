public class AddAmount {
private int amount;
public AddAmount() {
this.amount = 50;
}
public AddAmount(int additionalAmount) {
this.amount = 50 + additionalAmount;
}
public int getAmount() {
return amount;
}
}
public class exp2 {
public static void main(String[] args) {
AddAmount piggieBank1 = new AddAmount();
System.out.println("Final amount in Piggie Bank 1: $" + piggieBank1.getAmount());
AddAmount piggieBank2 = new AddAmount(25);
System.out.println("Final amount in Piggie Bank 2: $" + piggieBank2.getAmount());
}
}