package HW_CrazyTesters.Less_3_to_5;


import java.util.Arrays;

public class Task6_lookingForMaximumAndMinimum {
    public static void main(String[] args) {
//  Напишите программу, которая находит максимальное и минимальное числа в массиве
//  целых чисел 34, 19, 78, 11, 154, 211, 5.
//  Используйте один проход через массив для определения обоих значений.

        int[] arr = {34, 19, 78, 11, 154, 211, 5};

//      Вариант №1. Вызов встроенной функции для сортировки массива
        Arrays.sort(arr);

//      Вывод результата:

        System.out.println("Минимальное числа в массиве: "+arr[0]);
        System.out.println("Максимальное числа в массиве:"+arr[arr.length-1]);

        System.out.println();

//      Вариант №2. Через Integer.MIN_VALUE, Integer.MAX_VALUE и цикл for:

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Минимальное числа в массиве: " + min);
        System.out.println("Минимальное числа в массиве: " + max);

    }
}
