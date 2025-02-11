import java.util.function.Function;

public class NumericalMethods {
    static final double EPSILON1 = 1e-2;
    static final double EPSILON2 = 1e-6;

    // Functiile date in problema
    static double f1(double x) {
        return Math.exp(x) + 3 * x;
    }
    static double f2(double x) {
        return Math.pow(x, 3) - 23 * x - 42;
    }

    // Derivatele pentru metoda Newton
    static double df1(double x) {
        return Math.exp(x) + 3;
    }
    static double df2(double x) {
        return 3 * Math.pow(x, 2) - 23;
    }

    // Metoda injumatatirii intervalului
    static double bisection(Function<Double, Double> f, double a, double b, double epsilon) {
        double c = 0;
        while ((b - a) / 2 > epsilon) {
            c = (a + b) / 2;
            if (f.apply(c) == 0.0) break;
            else if (f.apply(a) * f.apply(c) < 0) b = c;
            else a = c;
        }
        return c;
    }

    // Metoda Newton
    static double newton(Function<Double, Double> f, Function<Double, Double> df, double x0, double epsilon) {
        double x = x0;
        while (Math.abs(f.apply(x)) > epsilon) {
            x = x - f.apply(x) / df.apply(x);
        }
        return x;
    }

    // Metoda secantelor
    static double secant(Function<Double, Double> f, double x0, double x1, double epsilon) {
        double x2;
        while (Math.abs(x1 - x0) > epsilon) {
            x2 = x1 - f.apply(x1) * (x1 - x0) / (f.apply(x1) - f.apply(x0));
            x0 = x1;
            x1 = x2;
        }
        return x1;
    }

    public static void main(String[] args) {
        double root1_bisect = bisection(NumericalMethods::f1, -10, 10, EPSILON1);
        double root2_bisect = bisection(NumericalMethods::f2, -10, 10, EPSILON1);

        double root1_newton = newton(NumericalMethods::f1, NumericalMethods::df1, 0, EPSILON2);
        double root2_newton = newton(NumericalMethods::f2, NumericalMethods::df2, 0, EPSILON2);

        double root1_secant = secant(NumericalMethods::f1, -10, 10, EPSILON2);
        double root2_secant = secant(NumericalMethods::f2, -10, 10, EPSILON2);

        System.out.println("Rezultate pentru f1(x) = e^x + 3x");
        System.out.println("Bisection: " + root1_bisect);
        System.out.println("Newton: " + root1_newton);
        System.out.println("Secant: " + root1_secant);

        System.out.println("\nRezultate pentru f2(x) = x^3 - 23x - 42");
        System.out.println("Bisection: " + root2_bisect);
        System.out.println("Newton: " + root2_newton);
        System.out.println("Secant: " + root2_secant);
    }
}
