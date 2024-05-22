import java.util.Scanner;

public class BusTicketGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter boarding stop: ");
        int boardingStop = scanner.nextInt();

        System.out.print("Enter destination stop: ");
        int destinationStop = scanner.nextInt();

        System.out.print("Enter number of adult passengers: ");
        int numAdultPassengers = scanner.nextInt();

        System.out.print("Enter number of child passengers: ");
        int numChildPassengers = scanner.nextInt();

       
        int numStopsTraveling = Math.abs(destinationStop - boardingStop);

      
        int adultCostPerStop = 10;
        int childCostPerStop = 5;
        
        int adultCost = numAdultPassengers * numStopsTraveling * adultCostPerStop;
        int childCost = numChildPassengers * numStopsTraveling * childCostPerStop;

        int totalCost = adultCost + childCost;

       
        double tax = totalCost * 0.10;
        double totalPrice = totalCost + tax;

        System.out.println("\nBoarding stop: " + boardingStop);
        System.out.println("Destination stop: " + destinationStop);
        System.out.println("Number of adult passengers: " + numAdultPassengers);
        System.out.println("Number of child passengers: " + numChildPassengers);
        System.out.println("Number of stops traveling: " + numStopsTraveling);
        System.out.println("Adult Cost: " + adultCost);
        System.out.println("Children cost: " + childCost);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + totalPrice);
    }
}
