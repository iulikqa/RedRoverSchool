package JAVA_OOP_University.Iulian.Lab5;

import java.util.Scanner;

// Неверный ввод пользователя
class InputMismatchExceptionGenerator extends ExceptionGenerator {
    private final Scanner scanner;

    public InputMismatchExceptionGenerator(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void generate() {
        System.out.println("Тест: Ввод букв вместо чисел.");
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // Введенные буквы вызовут InputMismatchException
        System.out.println("Вы ввели: " + number);
    }
}
