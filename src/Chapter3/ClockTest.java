package Chapter3;

import java.time.Clock;

public class ClockTest {

    public static void main(String[] args){

        Clock myClock = new Clock(23, 21,10);

        System.out.println(myClock.displayTime());

    }
}
