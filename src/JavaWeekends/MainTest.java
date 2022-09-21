package JavaWeekends;


public class MainTest {

    public static void main(String[] args) {

//        System.out.printf("10,000 at 2percent interest = %f %.2f%n", + calculateInterest(10000,2.0));

        for (int a = 2; a <= 8; a++) {
            System.out.println("10,000 at " + a + "% = " + String.format("%.2f", calculateInterest(10000, a)));

        }

        System.out.println("************************");

        for (int a = 8; a >= 2; a--) {
            System.out.println("10,000 at " + a + "% = " + String.format("%.2f", calculateInterest(10000, a)));
        }

        System.out.println("My while attempt.");


            int a = 2;

            while(a<=8){
                System.out.println("10,000 at " + a + "% = " + String.format("%.2f", calculateInterest(10000, a)));
                a++;
            }

}

    private static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }
}
