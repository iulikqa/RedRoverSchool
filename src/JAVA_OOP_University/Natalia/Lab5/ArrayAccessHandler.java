package JAVA_OOP_University.Natalia.Lab5;

import java.util.Scanner;

class ArrayAccessHandler extends ExceptionHandler {
    private Scanner scanner;

    public ArrayAccessHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void handle() {
        try {
            int[] array = {1, 2, 3};
            System.out.print("Введите индекс элемента массива (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Элемент массива: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс вне границ массива!");
        }
    }
}