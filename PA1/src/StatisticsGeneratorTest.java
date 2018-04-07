import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class StatisticsGeneratorTest {

    private static StatisticsGenerator sg;

    private static double epsilon = 0.0001;

    int[] empty = {};
    int[] single = {7};
    int[] twoElements = {3, 4};
    int[] sequential = {0, 1, 2, 3};
    int[] mixed = {-7, 13, 5, 0, 4, 2, -8};
    int[] blackMirror = {0, 3, 7, -3, 123, 0, 3, 7, -3};

    @Before
    public void setup() {
        sg = new StatisticsGenerator();
    }

    @Test
    public void testMin() {
        assertEquals("Default minimum value is incorrect", Integer.MIN_VALUE, sg.min(empty));
        assertEquals(7, sg.min(single));
        assertEquals(3, sg.min(twoElements));
        assertEquals(0, sg.min(sequential));
        assertEquals(-8, sg.min(mixed));
    }

    @Test
    public void testSecondMax() {
        //TODO
    }

    @Test
    public void testMedian() {
        //TODO
    }

    @Test
    public void testRearrange() {
        //TODO
    }

    @Test
    public void testBrokenMirror() {
        //TODO
    }
}
