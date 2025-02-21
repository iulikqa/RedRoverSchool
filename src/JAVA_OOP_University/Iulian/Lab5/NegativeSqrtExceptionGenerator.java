package JAVA_OOP_University.Iulian.Lab5;


// Корень из отрицательного числа
class NegativeSqrtExceptionGenerator extends ExceptionGenerator {
    @Override
    public void generate() {
        System.out.println("Тест: Корень из отрицательного числа.");
        double number = -5;
        if (number < 0) {
            throw new IllegalArgumentException("Число меньше нуля: " + number);
        }
        System.out.println(Math.sqrt(number));
    }
}
