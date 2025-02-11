import java.util.function.Function;
public class BisectionMethod {
    // Метод бисекции
    public static double bisection(Function<Double, Double> f, double a, double b, double tol) {
        double fa = f.apply(a);
        double fb = f.apply(b);

        if (fa * fb >= 0) {
            throw new IllegalArgumentException("Функция должна иметь разные знаки на концах интервала");
        }

        double c = a;
        int iterations = 0;  // считаем количество итераций

        while ((b - a) / 2 > tol) {
            c = (a + b) / 2;
            double fc = f.apply(c);
            iterations++;

            if (fc == 0.0) {
                break; // точный корень найден
            }

            if (fa * fc < 0) {
                b = c;
            } else {
                a = c;
                fa = fc;
            }
        }

        System.out.println("Количество итераций: " + iterations);
        return c;
    }

    // Функция f(x) = cos(x) + x - 1
    public static double f1(double x) {
        return Math.cos(x) + x - 1;
    }

    // Функция f(x) = x^3 - 30x - 41
    public static double f2(double x) {
        return Math.pow(x, 3) - 30 * x - 41;
    }

    public static void main(String[] args) {
        double tol = 0.01;  // точность

        // Нахождение корня для функции f1
        double root1 = bisection(BisectionMethod::f1, 0, 1, tol);
        System.out.println("Корень функции f1: " + root1);

        // Нахождение корня для функции f2
        double root2 = bisection(BisectionMethod::f2, 3, 4, tol); // интервал для второго уравнения
        System.out.println("Корень функции f2: " + root2);
    }
}
