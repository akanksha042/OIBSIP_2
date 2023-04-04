import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        // initialize balance and input variables
        int balance = 500000;
        Scanner sc = new Scanner(System.in);

        // ask for password
        System.out.println("Dear Customer, Kindly Enter your ATM Password:");
        int password = sc.nextInt();

        // check if password is correct
        if (password == 9594) {
            // loop indefinitely until user quits
            while (true) {
                // display options to user
                System.out.println("Automatic ATM Machine");
                System.out.println("1. Withdraw Money");
                System.out.println("2. Deposit Money");
                System.out.println("3. Account Balance");
                System.out.println("4. Account Transfer");
                System.out.println("5. Quit");
                System.out.print("Choose the operation you want to perform: ");

                // get user input
                int choice = sc.nextInt();

                // perform chosen operation
                switch (choice) {
                    case 1:
                        // Withdraw money
                        System.out.print("Enter amount to be withdrawn: ");
                        int withdrawAmount = sc.nextInt();
                        if (balance >= withdrawAmount) {
                            balance -= withdrawAmount;
                            System.out.println("Please collect your money.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;

                    case 2:
                        // Deposit money
                        System.out.print("Enter amount to be deposited: ");
                        int depositAmount = sc.nextInt();
                        balance += depositAmount;
                        System.out.println("Your money has been successfully deposited.");
                        break;

                    case 3:
                        // Display account balance
                        System.out.println();
                        System.out.println("Your balance is: " + balance);
                        break;

                    case 4:
                        // Transfer money
                        System.out.print("Enter recipient's account number: ");
                        int recipientAccountNo = sc.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        int transferAmount = sc.nextInt();
                        if (transferAmount <= balance) {
                            balance -= transferAmount;
                            System.out.println("Transfer successful.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;

                    case 5:
                        // Quit program
                        System.out.println("Thank you for using this ATM. Goodbye!");
                        System.exit(0);

                    default:
                        // Invalid input
                        System.out.println("Invalid choice. Please choose a valid operation.");
                        break;
                }

                // Add blank line for formatting
                System.out.println();
            }
        } else {
            // Wrong password
            System.out.println("Sorry, wrong password. Please try again.");
        }
    }
}
