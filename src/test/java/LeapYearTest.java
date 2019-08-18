import org.junit.After;
import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

public class LeapYearTest {




    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void isLeapYear_forNumberDivisibleByFour_true() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(2012));
    }
}