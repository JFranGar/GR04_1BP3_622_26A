package ec.epn.edu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    Calculator c;
    @Before
    public void setUp() {
        System.out.println("Execute before method");
    }

    @Test
    public void given_two_integers_when_additin(){
        System.out.println("Testing given two integers+adittion ");
        when(c.add(2, 3)).thenReturn(5);
        int result = c.add(2, 3);
        assertEquals(5, result);
        verify(c).add(2,3);
        System.out.println("Testing completed");
    }

}