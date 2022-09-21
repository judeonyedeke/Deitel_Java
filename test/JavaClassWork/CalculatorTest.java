package JavaClassWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void StartWith(){

        calculator = new Calculator();
    }
    @Test
    void TestObjectExists(){
        assertNotNull(calculator);
    }
    @Test
    void Sum(){
        assertEquals(10, calculator.addingNumbers(7,3));
    }



}