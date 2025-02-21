package JAVA_OOP_University.Iulian.Lab5;

// Выход за границы массива
class ArrayIndexOutOfBoundsExceptionGenerator extends ExceptionGenerator {
    @Override
    public void generate() {
        System.out.println("Тест: Доступ к несуществующему элементу массива.");
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // Вызовет ArrayIndexOutOfBoundsException
    }
}