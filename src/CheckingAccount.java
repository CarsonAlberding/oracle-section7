public class CheckingAccount {
    public double balance;
    public double interestRate = .01;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer: "+name);
    }
    public void Withdraw(double var1){
        if (var1 > balance){
            System.out.println("Balance is too low for withdrawal");
        } else if (var1<0) {
            System.out.println("Withdrawal cannot be negative");
        } else{
            balance = balance - var1;
            System.out.println("New balance is: "+balance);
        }
    }
}
