package JAVA_OOP_University.Iulian.Lab5;

import java.util.InputMismatchException;

// Класс-обработчик исключений
class ExceptionHandler {
    public static void handleException(ExceptionGenerator generator) {
        try {
            generator.generate();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Невозможно вычислить корень из отрицательного числа. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за пределы массива. " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введены неверные данные. Ожидалось число.");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка вызова метода у null-объекта. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        } finally {
            System.out.println("=========================================");
        }
    }
}