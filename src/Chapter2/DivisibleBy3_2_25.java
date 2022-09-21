package Chapter2;

import java.util.Scanner;

public class DivisibleBy3_2_25 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        int divNum1 = number1 % 3;
        if(divNum1 == 0){
            System.out.println("The first integer is a divisible number. ");
        }

        int divNum2 = number2 % 3;
        if(divNum2 == 0){
            System.out.println("The second integer is a divisible number. ");
        }

        int divNum3 = number3 % 3;
        if(divNum3 == 0){
            System.out.println("The third integer is a divisible number. ");
        }
    }
}
