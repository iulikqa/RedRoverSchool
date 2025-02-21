package JAVA_OOP_University.Iulian.Lab5;

// Вызов метода у null-объекта
class NullPointerExceptionGenerator extends ExceptionGenerator {
    @Override
    public void generate() {
        System.out.println("Тест: Вызов метода у null-объекта.");
        String nullString = null;
        System.out.println(nullString.length()); // Вызовет NullPointerException
    }
}