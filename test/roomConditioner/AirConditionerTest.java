package roomConditioner;

import JavaWeekends.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
//Test 1
    public void onAirConditioner() {
        //given i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //when i turn it on
        myAirConditioner.turnAcOn();
        //it is on
        assertTrue(myAirConditioner.onOff());
    }

    @Test
    //Test 2
    public void offAirConditioner() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        assertTrue(myAirConditioner.onOff());
        //when i turn it off
        myAirConditioner.turnAcOff();
        //it is off
        assertFalse(myAirConditioner.onOff());
    }

    @Test
    //Test 3
    public void settingTemperature() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        assertTrue(myAirConditioner.onOff());
        // when i set the temperature
        myAirConditioner.setTemperature(19);
        // the temperature is 19
        assertEquals(19, myAirConditioner.getTemperature());

    }

    @Test
    //Test 4
    public void settingTemperatureAbove30() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        assertTrue(myAirConditioner.onOff());
        // when i set the temperature above 30
        myAirConditioner.setTemperature(35);
        // the temperature is 30
        assertEquals(30, myAirConditioner.getTemperature());
    }

    @Test
    //Test 5
    public void settingTemperatureBelow16() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        assertTrue(myAirConditioner.onOff());
        // when i set the temperature below 16
        myAirConditioner.setTemperature(14);
        // the temperature is 16
        assertEquals(16, myAirConditioner.getTemperature());

    }

    @Test
    //Test 6
    public void increaseAcTemperature() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        assertTrue(myAirConditioner.onOff());
        //when i increase temperature
        myAirConditioner.setTemperature(25);
        assertEquals(25, myAirConditioner.getTemperature());


        myAirConditioner.increaseTemperature(4);
        //temperature is below 30 degrees
        assertEquals(29, myAirConditioner.getTemperature());
    }

    @Test
    //Test 7
    public void decreaseAcTemperature() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        myAirConditioner.setTemperature(29);
        //when i decrease temperature
        myAirConditioner.decreaseTemperature(5);
        //temperature is above 16 degrees
        assertEquals(24, myAirConditioner.getTemperature());

    }

    @Test
    //Test 8
    public void whenAcTemperatureExceeds30() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        myAirConditioner.setTemperature(25);
        //when i increase temperature beyond 30
        myAirConditioner.increaseTemperature(10);
        //temperature is still 30 degrees
        assertEquals(30, myAirConditioner.getTemperature());
    }

    @Test
    //Test 9
    public void whenAcTemperatureIsBelow16() {
        //given that i have an AC
        AirConditioner myAirConditioner = new AirConditioner();
        //given that it is on
        myAirConditioner.turnAcOn();
        myAirConditioner.setTemperature(20);
        //when i decrease temperature below 16
        myAirConditioner.decreaseTemperature(10);
        //temperature is still 16 degrees
        assertEquals(16, myAirConditioner.getTemperature());
    }

}
