package JavaClassWork;

import java.util.Random;
import java.util.Scanner;

public class GuessSystemNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        int pcNumber = randomNumber.nextInt(5);

        int count = 0;

        while (count == 0) {
            System.out.println("Enter a number between 1 to 5: ");
            int value = input.nextInt();

            if (value == pcNumber) {
                count++;
            } else if (value < pcNumber) {
                System.out.println("Too low, try again. ");
            } else if (value > pcNumber) {
                System.out.println("Too high, try again. ");
            }
        }
    }
}
