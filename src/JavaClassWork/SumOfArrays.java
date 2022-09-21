package JavaClassWork;

public class SumOfArrays {

    public static void main(String[] args) {

        int [] numbers = {45, 72, 65, 72, 95};

//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
           sum += numbers[i];

        }
        System.out.println(sum);
    }
}

