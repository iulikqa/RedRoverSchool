package JAVA_OOP_University.Natalia.Lab5;

import java.util.Scanner;

class InputNumberHandler extends ExceptionHandler {
    private Scanner scanner;

    public InputNumberHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void handle() {
        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (Exception e) {
            System.out.println("Ошибка: Вводите только числа!");
            scanner.next(); // Очищаем некорректный ввод
        }
    }
}