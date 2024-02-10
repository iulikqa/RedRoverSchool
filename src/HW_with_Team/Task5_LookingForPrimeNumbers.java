package HW_with_Team;

import java.util.Scanner;

// Напишите программу, которая будет находить и выводить все простые числа
// меньше заданного пользователем числа N. Простое число — это натуральное число больше 1,
// которое делится без остатка только на 1 и на само себя.

public class Task5_LookingForPrimeNumbers {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести число N
        System.out.print("Введите число N: ");

        // Считываем введенное число
        int N = scanner.nextInt();

        // Выводим простые числа меньше N
        System.out.println("Простые числа меньше " + N + ":");
        for (int i = 2; i < N; i++) {
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
