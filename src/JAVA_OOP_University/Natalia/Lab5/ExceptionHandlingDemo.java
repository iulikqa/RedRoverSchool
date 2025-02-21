package JAVA_OOP_University.Natalia.Lab5;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ExceptionHandler[] handlers = {
                new DivisionHandler(scanner),
                new SquareRootHandler(scanner),
              //  new ArrayAccessHandler (scanner),
                new InputNumberHandler(scanner),
                new NullPointerHandler(),
                new ExceptionGeneratorHandler()
        };

        for (ExceptionHandler handler : handlers) {
            handler.handle();
        }

        scanner.close();
    }
}