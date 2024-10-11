package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResistorTest {

    Resistor instance = new Resistor(21.0, 2, 3);

    public ResistorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

 
    @Test
    public void testGetNode1() {
        System.out.println("getNode1");
        int expResult = 2;
        int result = instance.getNode1();
        assertEquals(expResult, result);
    }

  
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "R1 2 3 21.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
