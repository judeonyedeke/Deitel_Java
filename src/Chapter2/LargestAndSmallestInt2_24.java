package Chapter2;

import java.util.Scanner;

public class LargestAndSmallestInt2_24 {
//      Exercise. 2.24
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();
        System.out.println("Enter fourth integer: ");
        int number4 = input.nextInt();
        System.out.println("Enter fifth integer: ");
        int number5 = input.nextInt();

        if(number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        if(number1 > number3){
            System.out.printf("%d > %d%n", number1, number3);
        if(number1 > number4){
            System.out.printf("%d > %d%n", number1, number4);
        if(number1 > number5){
            System.out.printf("%d > %d%n", number1, number5);
        }
        }
        }
        }
    }
}
