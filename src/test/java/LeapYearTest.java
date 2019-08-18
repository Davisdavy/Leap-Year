import org.junit.After;
import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

public class LeapYearTest {



public LeapYear leapYear = new LeapYear(2012);
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void isLeapYear_forNumberDivisibleByFour_true() { ;
        assertEquals(true, leapYear.isLeapYear(2012));
    }

    @Test
    public void isLeapYear_forNumbersNotDivisibleByFour_false(){

        assertEquals(false, leapYear.isLeapYear(1999));
    }

    @Test
    public void isLeapYear_forMultiplesOfOneHundred_false() {

        assertEquals(false, leapYear.isLeapYear(1900));
    }
    @Test
    public void isLeapYear_forMultiplesOfFourHundred_true() {

        assertEquals(true, leapYear.isLeapYear(2000));
    }
}