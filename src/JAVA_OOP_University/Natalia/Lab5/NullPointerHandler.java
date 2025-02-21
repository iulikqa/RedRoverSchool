package JAVA_OOP_University.Natalia.Lab5;

class NullPointerHandler extends ExceptionHandler {
    @Override
    public void handle() {
        try {
            String str = null;
            System.out.println("Длина строки: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка вызвать метод у нулевой ссылки!");
        }
    }
}