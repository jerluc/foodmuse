package fm.model;

import static fm.util.Insurance.sanity;

/**
 * @author Jeremy Lucas
 * @since 6/26/13
 */
public abstract class Amount {
    protected final int whole;

    protected final int numerator;

    protected final int denominator;

    public Amount(final int whole, final int numerator, final int denominator) {
        this.whole = sanity(whole >= 0, "Whole number must be greater than or equal to zero", whole);
        this.numerator = sanity(numerator >= 0, "Numerator must be greater than or equal to zero", numerator);
        this.denominator = sanity(denominator > 0, "Denominator must be greater than zero", denominator);
    }

    public int getWhole() {
        return whole;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static Amount whole(final int whole) {
        return new Whole(whole);
    }

    public static Amount fraction(final int numerator, final int denominator) {
        return new Fraction(numerator, denominator);
    }

    public static Amount mixed(final int whole, final int numerator, final int denominator) {
        return new Mixed(whole, numerator, denominator);
    }

    private static class Whole extends Amount {
        public Whole(final int whole) {
            super(whole, 0, 1);
        }

        @Override
        public String toString() {
            return "" + whole;
        }
    }

    private static class Fraction extends Amount {
        public Fraction(final int numerator, final int denominator) {
            super(0, numerator, denominator);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    private static class Mixed extends Amount {
        public Mixed(final int whole, final int numerator, final int denominator) {
            super(whole, numerator, denominator);
        }

        @Override
        public String toString() {
            return whole + " " + numerator + "/" + denominator;
        }
    }
}
