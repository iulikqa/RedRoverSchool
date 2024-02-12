package HW;

import java.util.Scanner;

public class HW6_2 {

//    Метод для сложения двух чисел
    private static double add (double a, double b){
        return a + b;
    }
//     Метод для вычитания второго числа из первого
    private static double subtract (double a, double b){
        return a - b;
    }

//    Метод для умножения двух чисел
private static double multiply (double a, double b){
    return a * b;
}

//     Метод для деления первого числа на второе
private static double divide (double a, double b){
    return a / b;
}

    public static void main(String[] args) {
//        Задача №1
//      Необходимо написать 4 метода:
//      сложение 2х чисел
//      вычитание 2х чисел
//      умножение 2х чисел
//      деление 2х чисел

        Scanner sc = new Scanner(System.in);
//      Ввод чисел
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();

//      Вызов методов и вывод результатов
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычетание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));

//      Проверка деления на ноль
        if (num2 != 0) {
            System.out.println("Деление: " + divide(num1, num2));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

    }
}
