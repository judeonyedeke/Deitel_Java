package Chapter2;

import java.util.Scanner;

public class Large2SmallNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        System.out.println(Math.max(number1, Math.max(number2, number3)));

        System.out.println(Math.min(number1, Math.min(number2, number3)));


//      largest
//        if (number1 > number2 && number1 > number3) {
//            System.out.println("The largest number is: " + number1);
//            if (number2 > number1 && number2 > number3) {
//                System.out.println("The largest number is: " + number2);
//                if (number3 > number1 && number3 > number2) {
//                    System.out.println("The largest number is: " + number3);
//                    smallest
//                    if (number1 < number2 && number1 < number3) {
//                        System.out.println("The largest number is: " + number1);
//                        if (number2 < number1 && number2 < number3) {
//                            System.out.printf("The largest number is: " + number2);
//                            if (number3 < number1 && number3 < number2) {
//                                System.out.printf("The largest number is: " + number3);
//                            }
//                        }
                        int sum = number1 + number2 + number3;

                        System.out.printf("The sum of three numbers: %d\n", sum);

                        int average = sum / 3;

                        System.out.printf("The average of three numbers: %d\n", average);

                        int product = number1 * number2 * number3;

                        System.out.printf("The product of three numbers: %d", product);

                    }
                }
//            }
//        }
//    }
//}