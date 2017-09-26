import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int carMPG = 0;
        double rawRange = 0.00;
        double tankCapacity = 0.00;
        double percentTank = 1.00;
        System.out.println("Test 1");
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        carMPG = scnr.nextInt();

        if (carMPG < 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        else {
        }
        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number:  ");
        tankCapacity = scnr.nextDouble();

        if (tankCapacity < 0.00) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        else {
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from   0-100%): ");
        percentTank = scnr.nextDouble();

        if (percentTank < 0.00) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            System.exit(0);
        }
        else if (percentTank > 100.00) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            System.exit(0);
        }
        else {
        }

        rawRange = carMPG * tankCapacity * (percentTank * 0.01);
        rawRange = (int)(rawRange);

        if (rawRange <= 25) {
            System.out.println("Attention! Your current estimated range is running low: " + (int)rawRange + " miles   left!!!");
        }
        else {
            System.out.println("Keep driving! Your current estimated range is: " + (int)rawRange + " miles!");
        }










    }
}
