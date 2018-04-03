import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsGeneratorTest {

    private static StatisticsGenerator sg;

    int[] empty = {};
    int[] single = {7};
    int[] twoElements = {3, 4};
    int[] sequential = {0, 1, 2, 3};
    int[] mixed = {-7, 13, 5, 0, 4, 2, -8};

    @BeforeAll
    static void setup() {
        sg = new StatisticsGenerator();
    }

    @Test
    void min() {
        assertEquals(Integer.MIN_VALUE, sg.min(empty));
        assertEquals(7, sg.min(single));
        assertEquals(3, sg.min(twoElements));
        assertEquals(0, sg.min(sequential));
        assertEquals(-8, sg.min(mixed));
    }

    @Test
    void secondMax() {
        //TODO
    }

    @Test
    void mean() {
        //TODO
    }

    @Test
    void median() {
        //TODO
    }

    @Test
    void rearrange() {
        //TODO
    }

    @Test
    void brokenMirror() {
        //TODO
    }
}
