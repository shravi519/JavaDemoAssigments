import java.util.Scanner;

public class bill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Service Number: ");
        String serviceNumber = scanner.nextLine();

        System.out.print("Enter Previous Reading: ");
        double previousReading = scanner.nextDouble();

        System.out.print("Enter Current Reading: ");
        double currentReading = scanner.nextDouble();

        // Calculating units consumed
        double unitsConsumed = currentReading - previousReading;

        // Cost calculation
        double costPerUnit = 1.5;
        double cost = unitsConsumed * costPerUnit;

        // GST calculation
        double cgstRate = 0.05;
        double sgstRate = 0.15;
        double cgst = cost * cgstRate;
        double sgst = cost * sgstRate;

        // Total amount to pay
        double totalAmount = cost + cgst + sgst;

        // Displaying the details
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.println("Service Number: " + serviceNumber);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Cost of Electricity @ Rs.1.5 per unit: Rs. " + cost);
        System.out.println("CGST (5%): Rs. " + cgst);
        System.out.println("SGST (15%): Rs. " + sgst);
        System.out.println("Total Amount to Pay: Rs. " + totalAmount);
        
        scanner.close();
    }
}
