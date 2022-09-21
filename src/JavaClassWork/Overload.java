package JavaClassWork;

public class Overload {

    public int addNumbers(int number1, int number2){
        return number1 + number2;
    }

    public double addNumbers(int number1, double number2){
        return number1 + number2;
    }
    public double addNumbers(double number1, double number2){
        return number1 + number2;
    }
    public double addNumbers(double  number1, int number2){
        return number1 + number2;
    }

    public static void main(String[] args) {

//        System.out.println(Overload.addNumbers(2,2));
//        System.out.println("");
//        System.out.println(Overload.addNumbers(5,2.0));
//        System.out.println("");
//        System.out.println(Overload.addNumbers(2.0,7.5));
//        System.out.println("");
//        System.out.println(Overload.addNumbers(7.5,99));

        Overload overload = new Overload();

        System.out.println(overload.addNumbers(99,15));
        System.out.println("");
        System.out.println(overload.addNumbers(7.0,5.9));
        System.out.println("");
        System.out.println(overload.addNumbers(25,9.9));
        System.out.println("");
        System.out.println(overload.addNumbers(2.0,75));

    }
}
