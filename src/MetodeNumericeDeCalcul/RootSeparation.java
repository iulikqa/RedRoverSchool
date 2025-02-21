package MetodeNumericeDeCalcul;

import java.util.function.Function;
public class RootSeparation {


        // Метод для поиска интервалов, где функция меняет знак
        public static void findRoots(Function<Double, Double> f, double start, double end, double step) {
            double x1 = start;
            double x2 = x1 + step;

            while (x2 <= end) {
                double f1 = f.apply(x1);
                double f2 = f.apply(x2);

                if (f1 * f2 < 0) {
                    System.out.println("Возможно корень на интервале [" + x1 + ", " + x2 + "]");
                }

                x1 = x2;
                x2 = x1 + step;
            }
        }

        // Функция f(x) = cos(x) + x - 1
        public static double f1(double x) {
            return Math.cos(x) + x - 1;
        }

        public static void main(String[] args) {
            double start = -10;  // начальный интервал
            double end = 10;     // конечный интервал
            double step = 0.5;   // шаг для поиска

            System.out.println("Разделение корней для функции f1:");
            findRoots(RootSeparation::f1, start, end, step);
        }
    }
