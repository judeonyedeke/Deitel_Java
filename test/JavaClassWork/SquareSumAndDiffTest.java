package JavaClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSumAndDiffTest {

    @Test
    void squareRoot(){
        assertEquals(4, SquareSumAndDiff.squareRoot(2));
    }

    @Test
    void sumSquare(){
        assertEquals(5, SquareSumAndDiff.sumSquare(3,2));
    }

    @Test
    void squareDifference(){
        assertEquals(3, SquareSumAndDiff.numberDifference(3,3));
    }
}