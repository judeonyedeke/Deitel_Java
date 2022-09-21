package Chapter2;

import java.util.Scanner;

public class NegativePositiveZeroValues {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
//        System.out.print("Enter fourth number: ");
//        int number4 = input.nextInt();
//        System.out.print("Enter fifth number: ");
//        int number5 = input.nextInt();

        if(number1 == 0)
        System.out.printf("The zero value is: %d%n", number1);

        if(number2 >= 1){
            System.out.printf("The positive value is: %d%n", number2);

            if(number3 < 0){
                System.out.printf("The negative value is: %d%n", number3);
            }
        }


    }
}
