package MetodeNumericeDeCalcul.HW_Iulian.Lab3;

import java.util.Arrays;

public class LagrangeInterpolationV3 {
    // Funcția pentru calculul polinomului de interpolare Lagrange
    public static double lagrangeInterpolationV3(double[] x, double[] y, double alpha) {
        int n = x.length;
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    term *= (alpha - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    // Selectează cel mai mic m pentru care eroarea este sub epsilon
    public static double lagrangeWithEpsilon(double[] x, double[] y, double alpha, double epsilon) {
        int n = x.length;
        for (int m = 2; m < n; m++) {
            double[] subX = Arrays.copyOf(x, m);
            double[] subY = Arrays.copyOf(y, m);

            double Lm = lagrangeInterpolationV3(subX, subY, alpha);
            double LmPlus1 = lagrangeInterpolationV3(Arrays.copyOf(x, m + 1), Arrays.copyOf(y, m + 1), alpha);

            if (Math.abs(Lm - LmPlus1) < epsilon) {
                return Lm;
            }
        }

        return lagrangeInterpolationV3(x, y, alpha);
    }

    public static void main(String[] args) {
        double[] x = {1.383, 1.357, 1.390, 1.394, 1.396, 1.400, 1.404};
        double[] y = {9.05421, 8.76431, 7.11326, 6.87628, 7.36734, 8.10234, 9.21361};
        double alpha = 0.185;
        double epsilon = 1e-4;

        // 1. Calcularea lui Ln(alpha)
        double interpolatedValue = lagrangeInterpolationV3(x, y, alpha);
        System.out.println("Interpolare cu tot setul de date: " + interpolatedValue);

        // 2. Aproximare cu eroare epsilon
        double approxValue = lagrangeWithEpsilon(x, y, alpha, epsilon);
        System.out.println("Aproximare cu eroare " + epsilon + ": " + approxValue);
    }
}
