import java.util.Objects;

public class Fraction {

    private final long numeratore;
    private final long denominatore;

    public Fraction(long numeratore, long denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public static long lcm(long u, long v) {
        return u*v/gcd(u,v);
    }

    public static long gcd(long u, long v) {
        if(v == 0) return u;
        return gcd(v, u%v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numeratore == fraction.numeratore &&
                denominatore == fraction.denominatore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeratore, denominatore);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Fraction{" +
                "numeratore=" + numeratore +
                ", denominatore=" + denominatore +
                '}';
    }

}