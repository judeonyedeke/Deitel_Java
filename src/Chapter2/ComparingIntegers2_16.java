package Chapter2;

import java.util.Scanner;
//        Exercise 2.16
public class ComparingIntegers2_16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        int squareNumber = num1 * num1;

        if(squareNumber > 100){
            System.out.println("Square number is greater than 100. ");
        }
        if(squareNumber == 100){
            System.out.println("Square number is equal to 100. ");
        }
        if(squareNumber != 100){
            System.out.println("Square number is not equal to 100. ");
        }
        if(squareNumber < 100){
            System.out.println("Square is less than 100. ");
        }
    }
}
