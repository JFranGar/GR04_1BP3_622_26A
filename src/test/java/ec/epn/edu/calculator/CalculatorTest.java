package ec.epn.edu.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        System.out.println("Test1");
        assertEquals(10, c.addition(5,5));
    }

    @Test
    public void given_two_integers_when_substraction_then_ok() {
        System.out.println("Test2");
        assertEquals(2, c.substraction(8,6));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test5");
        assertEquals(1,c.division(1,0), 0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_ok() {
        System.out.println("Test4");
        c.timeout(100);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}