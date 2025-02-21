package JAVA_OOP_University.Natalia.Lab5;

import java.util.Scanner;

class DivisionHandler extends ExceptionHandler {
    private Scanner scanner;

    public DivisionHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void handle() {
        try {
            System.out.print("Введите делимое: ");
            int dividend = scanner.nextInt();
            System.out.print("Введите делитель: ");
            int divisor = scanner.nextInt();
            int result = divide(dividend, divisor);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        }
    }

    private int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}