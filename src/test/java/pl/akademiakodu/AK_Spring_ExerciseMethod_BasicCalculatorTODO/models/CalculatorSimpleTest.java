package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;
/**
 * Import section
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class to test calculator basic service
 */
public class CalculatorSimpleTest {

    private static CalculatorSimple calculator;

    @BeforeClass public static void start(){
        calculator = new CalculatorSimple();
    }

    @AfterClass public static void stop(){
        calculator = null;
    }

    /**
     * This test testing all methods in service
     */
    @Test public void operationBasicTest(){
        assertEquals(calculator.add(4,6),10);
        assertEquals(calculator.subtract(4,6),-2);
        assertEquals(calculator.multiplication(4,6),24);
        assertEquals(calculator.division(4,2),2);
        assertNotEquals(calculator.multiplication(2,2),6);
    }

}