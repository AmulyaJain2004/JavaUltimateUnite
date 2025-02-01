import java.util.*;

class Account {
    int accountNum;
    String name;
    double balance;

    public void setAccount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account no: ");
        accountNum = s.nextInt();
        System.out.println("Enter name: ");
        name = s.next();
        System.out.println("Enter amount: ");
        balance = s.nextDouble();
    }
    public void displayDetails(){
        System.out.println("Account no: " + accountNum);
        System.out.println("Customer name: " + name);
        System.out.println("Balance: " + balance);
    }
    public void depositAmount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        double deposit = s.nextDouble();
        balance += deposit;
        System.out.println("Amount: " + deposit + " deposited");
        System.out.println("Balance now: " + balance);
    }
    public void withdrawAmount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: ");
        double withdraw = s.nextDouble();
        if (withdraw > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= withdraw;
            System.out.println("Amount: " + withdraw + " withdrawn");
            System.out.println("Balance now: " + balance);
        }
    }
}

class BankingApp {
    public static void main(String[] args) {

        
        Account a = new Account();
        a.setAccount();
        a.displayDetails();
        a.depositAmount();
        a.withdrawAmount();
    }
}