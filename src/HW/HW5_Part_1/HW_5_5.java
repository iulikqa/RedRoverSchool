package HW.HW5_Part_1;

public class HW_5_5 {
    public static void main(String[] args) {
        /*
        Задача №5
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.
        */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];

        }
        System.out.println("Среднее арифметическое всех значений массива = " + (double)sumArray / array.length);
    }
}
