import java.util.Scanner;

public class ATMWithdraw {

    public static void main(String[] args) {
        int initialBalance = 10000;
        int atmPin = 1234;
        int cashInMachine = 8000;

        Scanner scanner = new Scanner(System.in);

        // Read the pin from the user
        System.out.print("Enter your ATM pin: ");
        int enteredPin = scanner.nextInt();

        // Verify if the entered pin is correct
        if (enteredPin == atmPin) {
            // Read the amount to withdraw
            System.out.print("Enter the amount to withdraw: ");
            int amountToWithdraw = scanner.nextInt();

            // Check if the amount is a valid amount (multiple of 100)
            if (amountToWithdraw % 100 == 0) {
                // Check if the amount is less than or equal to the balance
                if (amountToWithdraw <= initialBalance) {
                    // Check if the ATM has sufficient cash
                    if (amountToWithdraw <= cashInMachine) {
                        // Perform the withdrawal
                        initialBalance -= amountToWithdraw;
                        cashInMachine -= amountToWithdraw;

                        System.out.println("Transaction successful.");
                        System.out.println("Updated balance: " + initialBalance);
                    } else {
                        System.out.println("Transaction failed: Insufficient cash in ATM.");
                    }
                } else {
                    System.out.println("Transaction failed: Insufficient balance.");
                }
            } else {
                System.out.println("Transaction failed: Invalid amount. Please enter a multiple of 100.");
            }
        } else {
            System.out.println("Transaction failed: Incorrect pin.");
        }

        scanner.close();
    }
}

