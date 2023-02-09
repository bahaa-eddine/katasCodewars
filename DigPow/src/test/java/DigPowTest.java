import com.kata.craftmanship.DigPowKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigPowTest {

    @Test
    public void Test1() {
        assertEquals(1, DigPowKata.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPowKata.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPowKata.digPow(46288, 3));
    }
}