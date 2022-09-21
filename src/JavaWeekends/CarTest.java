package JavaWeekends;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Car myCar1 = new Car("Lexus", 2013, 10_000.00);
        Car myCar2 = new Car("Honda Accord", 2000, 15_000.00);

        System.out.printf("Type of first car is: %s%n", myCar1.getType());
        System.out.printf("Year of manufacture: %d%n", myCar1.getYear());
        System.out.printf("Car price is: $%.2f%n", myCar1.getPrice());


        System.out.printf("Five percent discount on price: %.2f%n",  myCar1.getDiscount());


        System.out.printf("Type of second car is: %s%n", myCar2.getType());
        System.out.printf("Year of manufacture: %d%n", myCar2.getYear());
        System.out.printf("Car price is: $%.2f%n", myCar2.getPrice());
        System.out.printf("Five percent discount on price: %.2f%n", myCar2.getDiscount());

    }
}
