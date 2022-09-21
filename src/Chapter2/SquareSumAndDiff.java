package Chapter2;
import java.util.Scanner;
// Exercise 2.15
public class SquareSumAndDiff {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int squareNumber1 = number1 * number1;

        int squareNumber2 = number2 * number2;

        System.out.printf("The square of number1: %d\n", squareNumber1);

        System.out.printf("The square of number2: %d\n", squareNumber2);

        int sum = squareNumber1 + squareNumber2;

        System.out.printf("The square sum of two numbers: %d\n", sum);

        int squareDifference = squareNumber1 - squareNumber2;

       System.out.printf("The square difference of two numbers: %d", squareDifference);
        }
    }
