package MetodeNumericeDeCalcul.HW_Natalia.Lab3;

public class LagrangeInterpolationV4 {

    public static void main(String[] args) {
        // Datele problemei
        double[] x = {0.702, 0.704, 0.707, 0.709, 0.712, 0.716, 0.719};
        double[] y = {5.61345, 6.90012, 7.23468, 8.14153, 7.13476, 6.23897, 5.37213};
        double alpha = 30.703;

        // Calcularea polinomului de interpolare Lagrange
        double lagrangeValue = lagrangeInterpolation(x, y, alpha);
        System.out.println("Valoarea interpolată f(" + alpha + ") = " + lagrangeValue);

        // Calcularea polinomului de interpolare cu m < n (m = 5)
        double[] x_m = {0.702, 0.704, 0.707, 0.709, 0.712}; // 5 puncte
        double[] y_m = {5.61345, 6.90012, 7.23468, 8.14153, 7.13476};
        double lagrangeValue_m = lagrangeInterpolation(x_m, y_m, alpha);
        System.out.println("Valoarea interpolată f(" + alpha + ") cu m < n = " + lagrangeValue_m);

        // Compararea rezultatelor
        double error = Math.abs(lagrangeValue - lagrangeValue_m);
        System.out.println("Eroarea între cele două valori = " + error);
    }

    public static double lagrangeInterpolation(double[] x, double[] y, double alpha) {
        double result = 0.0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term = term * (alpha - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }
}
