// AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create an object with the default constructor and assign it to account0
        Account account0 = new Account();
        //display the initial values of instance variables
        System.out.printf("The initial name is: %s%n", account0.getName());
        System.out.printf("The initial balance is: %s%n", account0.getBalance());
        //display the object
        System.out.print(account0);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");//prompt
        String theName = input.nextLine();// obtain user input
        account0.setName(theName); //set the account owner's name to what the user specifies
        System.out.println("Enter the deposit amount");
        double depositAmount = input.nextDouble();  //deposit money with the amount that the user desires
        System.out.printf("Adding %.2f to account1 balance%n", depositAmount);
        account0.deposit(depositAmount); // add to account0's balance
        System.out.print(account0);
        System.out.println();

        //create an object with two argument constructor and assign it to account1
        Account account1 = new Account("Jane Green", 50.00);
        System.out.print(account1);

        System.out.print("Enter deposit amount for " + account1.getName() + ":"); // prompt
         depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n",
                depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display account1's name and balance
        System.out.printf("%s's balance now is: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.println();

        //create an object with two argument constructor and assign it to account1
        Account account2 = new Account("John Blue", -7.53);
        System.out.print(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("adding %.2f to account2 balance%n",
                depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display account1's name and balance
        System.out.printf("%s's balance now is: $%.2f%n",
                account2.getName(), account2.getBalance());
    }
}