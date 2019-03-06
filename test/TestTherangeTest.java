import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTheRangeTest {
    TestTheRange obj;

    @Before
    public void setUp() throws Exception {
        obj = new TestTheRange();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void checkTomJerryTest() {
        assertEquals(2,obj.checkTomJerry(6));

    }

    @Test
    public void checkItOutTest()
    {
        assertEquals("Not Found",obj.checkItOut(6));
    }

}
