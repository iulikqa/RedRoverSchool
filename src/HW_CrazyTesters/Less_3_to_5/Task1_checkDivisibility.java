package HW_CrazyTesters.Less_3_to_5;

import java.util.Scanner;

//Напишите программу, которая проверяет, делится ли введенное пользователем число на 5 и на 11 одновременно.
// Программа должна выводить соответствующие сообщения "Делится" или "Не делится".

public class Task1_checkDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");

        int a = sc.nextInt();


        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }

    }
}
