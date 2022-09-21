package JavaClassWork;

import java.util.Scanner;

public class DriveMile {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int mile = 0;
            int gallon = 0;
            int totalMile = 0;
            int totalGallons = 0;
            int counter = 1;

            System.out.print("Enter mile or 0 to quit: ");
            mile = input.nextInt();
            System.out.print("Enter gallon or 0 to quit: ");
            gallon = input.nextInt();

            double mileage = mile / gallon;
            System.out.printf("Mile per gallon for a trip is: %f%n", mileage);

            while(mile != -1 && gallon != -1){
                totalMile += mile;
                totalGallons += gallon;
                counter++;

                System.out.print("Enter mile or -1 to quit: ");
                mile = input.nextInt();
                System.out.print("Enter gallon or -1 to quit: ");
                gallon = input.nextInt();
                mileage = mile / gallon;
                System.out.printf("Mile per gallon for a trip is: %f%n", mileage);
            }
            if(counter != 0){
                double milesDriven = mileage / counter;
                double milePerGallon = (double) totalMile / totalGallons;

                System.out.printf("Number of Trips: %d%n", counter);
                System.out.printf("Average miles driven: %.2f%n", milesDriven);
                System.out.printf("Average gallon used: %.2f%n", milePerGallon);
            }
            else {
                System.out.println("No trip. ");
            }
        }
    }

