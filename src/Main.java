import java.util.Scanner;



    class CtoFConverter {
        public static void main(String[] args) {
            double celsius = 0.0;
            double fahrenheit = 0.0;
            boolean done = false;

            java.util.Scanner scanner = new java.util.Scanner(System.in);

            do {

                System.out.print("Enter temperature in Celsius: ");
                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9.0 / 5) + 32;

                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    done = true;
                } else {
                    System.out.print("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                }
            } while (!done);

            scanner.close();

        }
    }
class FuelCosts {
    public static void main(String[] args) {

    double gasTank = 0.0;
    double fuelMillage = 0.0;
    double gasPrice = 0.0;
    double costGas = 0.0;
    double driveDistance = 0.0;
    boolean done = false;

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    do {
        System.out.print("Enter the number of gallons of your gas tank: ");
        if (scanner.hasNextDouble()) {
            gasTank = scanner.nextDouble();

            System.out.println("Your gas tank holds: " + gasTank + " gallons.");
            done = true;
        }
        else {

            System.out.print("Invalid input. Please enter a valid number gallons of gas.");
            scanner.nextLine();
        }
    }while (!done);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelMillage = scanner.nextDouble();

                System.out.println("Your fuel efficiency in miles per gallon is: " + fuelMillage);
                done = true;
            }
            else {

                System.out.print("Invalid input. Please enter a valid number for your fuel efficiency.");
                scanner.nextLine();
            }
        }while (!done);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                gasPrice = scanner.nextDouble();

                System.out.println("Your price of gas per gallon is: " + gasPrice);
                done = true;
            }
            else {

                System.out.print("Invalid input. Please enter a valid number for the price of gas per gallon.");
                scanner.nextLine();
            }
        }while (!done);

        costGas = (100 / fuelMillage) * gasPrice;
        System.out.println("Your cost to drive 100 miles is: " + costGas);

        driveDistance = fuelMillage * gasTank;
        System.out.println("The max distance you could drive on a full tank of gas is: " + driveDistance);

    }
}