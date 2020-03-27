public class Fraction {
    private final long numeratore;
    private final long denominatore;

    public Fraction(long numeratore, long denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Fraction add(Fraction f) {
        long lcm = lcm(this.denominatore, f.denominatore);
        long sum = this.numeratore * (lcm/this.denominatore) + f.numeratore * (lcm/f.denominatore);
        return new Fraction(sum, lcm);
    }

    public Fraction simplify() {
        long gcd = gcd(numeratore, denominatore);
        return new Fraction(numeratore /gcd, denominatore /gcd);
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

    public Fraction multiply(Fraction f) {
        return new Fraction(numeratore *f.numeratore, denominatore *f.denominatore);
    }

    public Fraction divide(Fraction f) {
        return new Fraction(numeratore * f.denominatore, denominatore * f.numeratore);
    }

    public Fraction subtract(Fraction f) {
        return add(new Fraction(-1* f.numeratore,  f.denominatore));
    }
}