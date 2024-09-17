package HW.HW5;

public class HW_5_1 {
    public static void main(String[] args) {
        /*
        Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
        */

        int sumArray = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];

        }
        System.out.println("Sum array = " + sumArray);
    }

}
