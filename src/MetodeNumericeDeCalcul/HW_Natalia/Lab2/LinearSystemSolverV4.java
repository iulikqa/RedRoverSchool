package MetodeNumericeDeCalcul.HW_Natalia.Lab2;

import java.util.Arrays;

public class LinearSystemSolverV4 {

    // Metoda eliminării lui Gauss
    public static double[] gaussElimination(double[][] A, double[] b) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            // Pivotare (pentru a evita erorile numerice)
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(A[k][i]) > Math.abs(A[maxRow][i])) {
                    maxRow = k;
                }
            }
            // Schimbă rândurile
            double[] temp = A[i];
            A[i] = A[maxRow];
            A[maxRow] = temp;
            double t = b[i];
            b[i] = b[maxRow];
            b[maxRow] = t;

            // Eliminare Gaussiană
            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                for (int j = i; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
                b[k] -= factor * b[i];
            }
        }

        // Substituție inversă
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        return x;
    }

    // Metoda iterativă a lui Jacobi
    public static double[] jacobiMethod(double[][] A, double[] b, double epsilon, int maxIterations) {
        int n = A.length;
        double[] x = new double[n]; // Aproximarea inițială cu 0
        double[] xNew = new double[n];
        int iter = 0;

        while (iter < maxIterations) {
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum += A[i][j] * x[j];
                    }
                }
                xNew[i] = (b[i] - sum) / A[i][i];
            }

            // Verificare criteriu de oprire
            double norm = 0;
            for (int i = 0; i < n; i++) {
                norm += Math.abs(xNew[i] - x[i]);
            }
            if (norm < epsilon) break;

            // Actualizare valori
            System.arraycopy(xNew, 0, x, 0, n);
            iter++;
        }

        System.out.println("Jacobi converged in " + iter + " iterations.");
        return x;
    }

    public static void main(String[] args) {
        double[][] A1 = {
                {10.6, 0.4, 0.7, 0.8},
                {0.4, 9.7, 0.3, 0.6},
                {0.7, 0.3, 14.9, 0.3},
                {0.8, 0.6, 0.3, 8.1}
        };
        double[] b1 = {9.2, 11.9, 10.3, 7.2};

        double[][] A2 = {
                {9.9, 6.0, 2.0, 0.8},
                {6.0, 11.7, 7.0, 0.9},
                {2.0, 7.0, 14.5, 1.1},
                {0.8, 0.9, 1.1, 23.6}
        };
        double[] b2 = {1.2, 4.7, 0.9, 1.2};

        // Rezolvare cu Gauss pentru sistemul 3
        double[] solutionGauss1 = gaussElimination(A1, b1);
        System.out.println("Solutie Gauss (Sistem 3): " + Arrays.toString(solutionGauss1));

        // Rezolvare cu Jacobi pentru sistemul 3
        double[] solutionJacobi1 = jacobiMethod(A1, b1, 1e-3, 100);
        System.out.println("Solutie Jacobi (Sistem 3): " + Arrays.toString(solutionJacobi1));

        // Rezolvare cu Gauss pentru sistemul 4
        double[] solutionGauss2 = gaussElimination(A2, b2);
        System.out.println("Solutie Gauss (Sistem 4): " + Arrays.toString(solutionGauss2));

        // Rezolvare cu Jacobi pentru sistemul 4
        double[] solutionJacobi2 = jacobiMethod(A2, b2, 1e-3, 100);
        System.out.println("Solutie Jacobi (Sistem 4): " + Arrays.toString(solutionJacobi2));
    }
}