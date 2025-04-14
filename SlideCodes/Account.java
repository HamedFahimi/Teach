// Account.java
// Account class with a name, a balance as the instance variable and two constructors
// and deposit method that perform validation.

public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor with no parameters
    public Account() {
        name = "nobody nobody"; // assign name to "nobody nobody"
    }

    // Account constructor that receives two parameters
    public Account(String s, double b) {
        name = s; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (b >= 0.0) { // if the balance is valid
            balance = b; // assign it to instance variable balance
        }
        else {
            System.out.println("The initial value entered for the account's owner is not valid. the balance will be set to its default value.");
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance += depositAmount; // add it to the balance
        }
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
        return String.format("The name of the account owner is: %s. His/her balance is $%.2f%s%n", getName(), getBalance(), ".");
    }
}