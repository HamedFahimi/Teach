// Account.java
// Account class with two instance variables and two constructors
// and deposit method that perform validation.

public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account() {
        name = "nobody nobody";
        balance = 0.0;
    }

    // Account constructor that receives two parameters
    public Account(String s, double b) {
        name = s; // assign name s to instance variable name
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (b > 0.0) // if the balance is valid
            balance = b; // assign it to instance variable balance
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance += depositAmount; // add it to the balance
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String s) {
        name = s;
    }

    // method that returns the name
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("The name of account owner is: %s. His/her Balance is $%.2f%s", name, balance, ".");
    }
} // end class Account