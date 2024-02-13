package HW_CrazyTesters.Less_3_to_5;

import java.util.Arrays;

public class Task9_evenOutTheOddsZeroingEvenElementsInAnArray {
    public static void main(String[] args) {
// Напишите программу, которая создает массив из 10 целых чисел,
// инициализирует его числами от 1 до 10. Затем программа должна найти
// все четные числа и заменить их на ноль. В конце программа выводит измененный массив.

//      Создание массива из 10 целых чисел
        int[] arr = new int[10];

//      Цикл для инициализация массива числами от 1 до 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

//      Цикл для поиска и замены на 0 всех четных чисел
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }

//      Цикл для вывода измененного массива
        for (int i = 0; i < arr.length; i++) {

        }
        System.out.println(Arrays.toString(arr));
    }
}

