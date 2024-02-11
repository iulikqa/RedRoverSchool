package HW_CrazyTesters.Less_3_to_5;

import java.util.Scanner;

//Напишите программу, которая вычисляет сумму всех четных чисел от 1 до n,
// где n — это число, введенное пользователем.
public class Task3_СalculatorOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();

        // Переменная для хранения суммы четных чисел
        int sum = 0;

        // Вычисляем сумму четных чисел от 1 до n
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        // Выводим результат
        System.out.println("Сумма четных чисел от 1 до " + n + ": " + sum);

    }
}


