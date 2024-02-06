package HW;

import java.util.Arrays;

public class HW4_2 {
    public static void main(String[] args) {
//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(array [i]);
            }
        }

//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.
        for (int i = 0; i < array.length; i = i + 1) {
            if (array [i] > 5) {
                System.out.println(array [i]);
            }
        }

//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.
        for (int i = 0; i < array.length; i = i + 1){
            array[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}

