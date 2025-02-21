package JAVA_OOP_University.Natalia.Lab5;

class ExceptionGeneratorHandler extends ExceptionHandler {
    @Override
    public void handle() {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void generateException() throws Exception {
        throw new Exception("Сгенерированное исключение");
    }
}