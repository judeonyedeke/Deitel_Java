package JavaClassWork;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IphoneTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            Iphone myIphone = new Iphone();
            myIphone.setColor("blue");
            System.out.printf("My iPhone color is %s%n", myIphone.getColor());


            Iphone.setPrice(100_000);
            System.out.printf("The iPhone price is: %,.2fNGN%n", myIphone.getPrice());

    }
}