import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Roma on 04.09.2016.
 */
public class CalculatorTest {
    private Calculator instance;

    @Before
    public void setUp() throws Exception {
        instance = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        instance = null;
    }

    @Test
    public void addition() throws Exception {
        assertEquals(instance.addition(2, 3), 5);
    }

    @Test
    public void subtraction() throws Exception {
        assertEquals(instance.subtraction(2, 3), -1);
    }

    @Test
    public void multiplication() throws Exception {
        assertEquals(instance.multiplication(2, 3), 6);
    }

    @Test
    public void division() throws Exception {
        assertEquals(instance.division(10, 2), 5);
        assertEquals(instance.division(0, 2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionThrowsException() throws Exception {
        assertEquals(instance.division(10, 0), 5);
    }

}