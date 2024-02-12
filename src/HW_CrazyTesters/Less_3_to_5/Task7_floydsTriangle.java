package HW_CrazyTesters.Less_3_to_5;

import java.util.Scanner;

public class Task7_floydsTriangle {
    public static void main(String[] args) {

// Напишите программу, которая выводит треугольник Флойда — треугольник из чисел,
// где каждая строка содержит одно число больше, чем предыдущая. Количество строк должен задать пользователь.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк для треугольника Флойда: ");

        int numberOfRows = sc.nextInt();

        System.out.println("Треугольник Флойда:");

        int currentNumber = 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }

        sc.close();
    }
}


