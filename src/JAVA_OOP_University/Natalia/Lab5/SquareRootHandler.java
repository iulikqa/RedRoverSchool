package JAVA_OOP_University.Natalia.Lab5;

import java.util.Scanner;
class SquareRootHandler extends ExceptionHandler {
    private Scanner scanner;

    public SquareRootHandler(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public void handle() {
        try {
            System.out.print("Введите число для извлечения корня: ");
            double number = scanner.nextDouble();
            double root = squareRoot(number);
            System.out.println("Квадратный корень: " + root);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Нельзя извлечь корень из отрицательного числа!");
        }
    }

    private double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }
}
