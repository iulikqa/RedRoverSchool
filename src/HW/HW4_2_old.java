package HW;

import java.util.Arrays;

public class HW4_2_old {
    public static void main(String[] args) {
//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            int numb = array[i];
            if (numb % 2 == 1) {
                System.out.println(array [i]);
            }
        }
        System.out.println(" ");

//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.
        for (int i = 0; i < array.length; i++) {
            if (array [i] > 5) {
                System.out.println(array [i]);
            }
        }
        System.out.println(" ");

//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}

