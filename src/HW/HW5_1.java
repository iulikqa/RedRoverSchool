package HW;

public class HW5_1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех значений массива: " + sum);

        System.out.println(" ");

//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);

        System.out.println(" ");


//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);

        System.out.println(" ");


//        Задача №4
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double averageSum = 0;

        for (int i = 0; i < array.length; i++) {
            averageSum += array1[i];
        }
        System.out.println("Среднее арифметическое всех значений массива: " + averageSum / array1.length);

        System.out.println(" ");


//        Задача №5
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum1 = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum1 += array2[i][j];
            }
        }

        System.out.println("Сумма элементов массива: " + sum1);

        System.out.println(" ");


//        Задача №6
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

        int[][] array3 = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 9},
                            {-1, -2, -3, -4},
                            {-5, -6}};

        int max2 = Integer.MIN_VALUE;

        for (int s = 0; s < array3.length; s++) {
            for (int m = 0; m < array3[s].length; m++) {
                if (array3[s][m] > max2) {
                    max2 = array3[s][m];
                }

            }
        }
        System.out.println("Максимальное значение массива: " + max2);

        System.out.println(" ");

//        Задача №7
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            count = count + array3[i].length;

        }
        System.out.println("Количество элементов в массиве: " + count);
    }
}

