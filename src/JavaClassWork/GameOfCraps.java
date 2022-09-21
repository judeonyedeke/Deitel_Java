//package JavaClassWork;
//
//import java.security.SecureRandom;
//
//public class GameOfCraps {
//
//    private static final SecureRandom randomNumbers = new SecureRandom();
//
//    private enum Condition{RETRY, WON, LOST};
//
//    private static final int DUAL = 2;
//    private static final int TRINITY = 3;
//    private static final int SEVEN_UP = 7;
//    private static final int LEAVEN = 11;
//    private static final int DOZEN = 12;
//
//    public static void main(String[] args){
//
//        int pointGain = 0;
//
//        Condition gameCondition;
//
//        int diceSum = rollDice();
//
//        switch (diceSum){
//            case SEVEN_UP:
//            case LEAVEN:
//                gameCondition = Condition.WON;
//
//                break;
//            case DUAL:
//            case TRINITY:
//            case DOZEN:
//                gameCondition = Condition.LOST;
//                break;
//
//            default:
//                gameCondition = Condition.RETRY;
//                pointGain = diceSum;
//                System.out.printf("Point gained is %d%n", pointGain);
//                break;
//        }
//
//        while(gameCondition == Condition.RETRY) {
//            diceSum = rollDice();
//
//            if(diceSum == pointGain){
//                gameCondition = Condition.WON;
//            }
//            else{
//                if(diceSum == SEVEN_UP){
//                    gameCondition = Condition.LOST;
//                }
//            }
//            if(gameCondition == Condition.WON){
//                System.out.println("You have won.");
//            }
//            else{
//                System.out.println("You lose.");
//            }
//
//            public static  int rollDice(){
//
//                int dice1 = 1 + randomNumbers.nextInt(6);
//                int dice2 = 1 + randomNumbers.nextInt(6);
//
//                int sum = dice1 + dice2;
//
//                System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
//
//                return sum;
//            }
//        }
//    }
//}
