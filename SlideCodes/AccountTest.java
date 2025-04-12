// AccountTest.java
// Creating Account objects and playing with methods defined within the Account class.
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args) {
        // create a default Account object and assign it to account1
        Account account1 = new Account();
        // display the initial value of the name of account 1's owner (nobody nobody)
        System.out.printf("Initial name is: %s%n", account1.getName());
        // display the initial value of the balance of account 1's owner (0.0)
        System.out.printf("Initial balance is: %s%n", account1.getBalance());
        // display the information of account1 object by calling its toString method
      //  account1.balance = -9.0;
        System.out.println(account1);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // prompt for reading name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
        account1.setName(theName); // put theName in account1
        // display the updated information of account1 object by calling its toString method
        System.out.println(account1);
              /*
            //  we could have used the following code to display per instance variable separately
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
*/
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); // add to account1's balance
        // display the information of account1 object by calling its toString method
        System.out.println(account1);

        // create an Account object and assign it to account2
        Account account2 = new Account("Kate Austen", 80.25);
        // display the information of object by calling its toString method
        System.out.println(account2);
        // create an Account object and assign it to account3
        Account account3 = new Account("John Lock", -7.53);
        // display the information of object by calling toString method
        System.out.println(account3);
        System.out.print("Enter deposit amount for account3: "); // prompt
        depositAmount = input.nextDouble();  // obtain user input
        System.out.printf("%nadding %.2f to account3 balance%n%n",
                depositAmount);
        account3.deposit(depositAmount); // add to account3's balance
        // display the information of object by calling toString method
        System.out.println(account3);
    } // end main
} // end class AccountTest
