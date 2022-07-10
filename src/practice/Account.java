package practice;

public class Account {
    private static final String BRANCHNAME="ABC";//final makes it constant cannot be changed its fixed value and we can not create child
    private double balance;
    private long accountNumber;
    private String name;

    //constructor
    public Account(long accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
        System.out.println("account got created");
    }

    public void deposit(double amount){
        balance = amount + balance;
        System.out.println("$" +amount+ "amount deposited successfully");
    }
    public double checkBalance(){                //same thing as getter
        return balance;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("$" + amount + "amount withdrawn successfully");

        } else {
            System.out.println("insufficient balance");
        }
    }
}