package HW_CrazyTesters.Less_3_to_5;

import java.util.Scanner;

// Напишите программу, которая будет находить и выводить все простые числа
// меньше заданного пользователем числа N. Простое число — это натуральное число больше 1,
// которое делится без остатка только на 1 и на само себя.

public class Task5_LookingForPrimeNumbers {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести число n
        System.out.print("Введите число n: ");

        // Считываем введенное число
        int n = scanner.nextInt();

        // Выводим простые числа меньше n
        System.out.println("Простые числа меньше " + n + ":");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // Закрываем Scanner после использования
        scanner.close();
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
