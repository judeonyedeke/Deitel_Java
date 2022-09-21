package JavaWeekends;

import java.util.Scanner;

public class LetterGradeSentinel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int grade = 0;

        while(grade != -1) {

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

            if(grade > 100){
                System.out.println("Invalid input. ");
            }
                else if (grade >= 70 && grade <= 100) {
                    System.out.println("You scored an A");
                } else if (grade >= 60 && grade < 70) {
                    System.out.println("You scored a B");
                } else if (grade >= 50 && grade < 60) {
                    System.out.println("You scored a C");
                } else if (grade >= 40 && grade < 50) {
                    System.out.println("You scored a D");
                } else if (grade < 39 && grade >= 0) {
                    System.out.println("you failed!");
                } else if (grade < 0) {
                    break;
            }
            count++;
        }

    }
}
