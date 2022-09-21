package JavaWeekends;

import java.util.Scanner;

public class LetterGrades_For {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for (int count = 0; count < 5; count++) {

            System.out.print("Enter grade: ");
            int grade = input.nextInt();

            if(grade > 100){
                System.out.println("Invalid input. ");
            }
                if (grade >= 70 && grade < 100) {
                    System.out.println("You scored an A");
                } else if (grade >= 60 && grade < 70) {
                    System.out.println("You scored a B");
                } else if (grade >= 50 && grade < 60) {
                    System.out.println("You scored a C");
                } else if (grade >= 40 && grade < 50) {
                    System.out.println("You scored a D");
                } else if (grade < 39 && grade >= 0) {
                    System.out.println("you failed");
                }
            }
    }
}


