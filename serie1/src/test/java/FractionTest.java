import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void gcd() {
        assertEquals(4, Fraction.gcd(8 , 12));
        assertEquals(1, Fraction.gcd(3 , 2));
    }

    @Test
    public void lcm() {
        assertEquals(6, Fraction.lcm(3 , 2));
        assertEquals(24, Fraction.lcm(8 , 12));
    }

}
