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


    @Test
    public void multiply() {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,2);
        assertEquals(new Fraction(1,4), f1.multiply(f2));
    }


    @Test
    public void divide() {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,2);
        assertEquals(new Fraction(2,2), f1.divide(f2));
    }

    @Test
    public void add() {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,2);
        assertEquals(new Fraction(2,2), f1.add(f2));
    }

}
