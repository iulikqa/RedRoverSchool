package JAVA_OOP_University.Iulian.Lab5;

import java.util.Scanner;

// Главный класс
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ExceptionGenerator[] generators = {
                new DivisionByZeroExceptionGenerator(),
                new NegativeSqrtExceptionGenerator(),
                new ArrayIndexOutOfBoundsExceptionGenerator(),
                new InputMismatchExceptionGenerator(scanner),
                new NullPointerExceptionGenerator()
        };

        for (ExceptionGenerator generator : generators) {
            ExceptionHandler.handleException(generator);
        }

        scanner.close();
    }
}