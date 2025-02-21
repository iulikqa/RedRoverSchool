package JAVA_OOP_University.Iulian.Lab5;

// Деление на ноль
class DivisionByZeroExceptionGenerator extends ExceptionGenerator {
    @Override
    public void generate() {
        System.out.println("Тест: Деление на ноль.");
        int result = 50 / 0; // Вызовет ArithmeticException
    }
}
