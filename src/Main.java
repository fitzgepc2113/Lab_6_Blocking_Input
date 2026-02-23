import java.util.Scanner;
import java.util.Random;


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

        scanner.close();

        costGas = (100 / fuelMillage) * gasPrice;
        System.out.println("Your cost to drive 100 miles is: " + costGas);

        driveDistance = fuelMillage * gasTank;
        System.out.println("The max distance you could drive on a full tank of gas is: " + driveDistance);

    }
}

class RectangleInfo {
    public static void main(String[] args) {
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        boolean done = false;

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do {

            System.out.print("Enter the width of your rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();

                System.out.println("The width of you rectangle is: " + width);
                done = true;
            } else {
                System.out.print("Invalid input. Please enter a valid width.");
                scanner.nextLine();
            }
        } while (!done);

        do {

            System.out.print("Enter the height of your rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();

                System.out.println("THe height of your rectangle is: " + height);
                done = true;
            } else {
                System.out.print("Invalid input. Please enter a valid height.");
                scanner.nextLine();
            }
        } while (!done);

        scanner.close();

        area = width * height;
        perimeter = width * 2 + height * 2;
        System.out.println("The area of the rectangle is: " + area + ". the  perimeter of the rectangle is: " + perimeter);

        diagonal =  Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
        System.out.println("The diagonal of the rectangle is: " + diagonal);


    }
}



class HighorLow {
    public static void main(String[] args) {

        Random generator = new Random();

        int val = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        java.util.Scanner scanner = new java.util.Scanner(System.in);


            do {

                System.out.print("Guess a number [1-10]: ");
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    if(guess < 1 || guess > 10) {
                        System.out.println("Your guess is not between 1 and 10.");
                    }
                    else if( guess > val){
                        System.out.println("Lower!");
                    }
                    else if( guess < val){
                        System.out.println("Higher!");
                    }
                } else {
                    System.out.print("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                }
            } while (guess != val);



        scanner.close();
        System.out.println("On the money! The number was: " + guess);

    }
}
