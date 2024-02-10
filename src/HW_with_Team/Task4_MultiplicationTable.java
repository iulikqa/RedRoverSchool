package HW_with_Team;

import java.util.Scanner;

// Напишите программу, которая выводит на экран таблицу умножения для заданного
// пользователем числа с использованием цикла for.
public class Task4_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Объявляем переменную для номера которого введем в консоли
        int num = sc.nextInt();

//        Организуем внешний цикл для перебора чисел от 1 до 10.
        for (int i = 1; i <= 10; i++) {
//        В теле вложенного цикла умножаем переменные i и num и
//        выводим результат на экран.

            System.out.println(i + "x" + num + "=" + (i * num));
        }

    }

}
