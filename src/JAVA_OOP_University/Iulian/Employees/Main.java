package JAVA_OOP_University.Iulian.Employee.DiferentFiles;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Администрация ===");
        Administration admin = new Administration(101, "Ион", "Попeску", "Директор", "Кишинев, ул. Штефан чел Маре, д. 1", "+373 68 123 456", 100000, "Топ-менеджер", 5);
        admin.displayEmployeeInfo();

        System.out.println("\n=== Владельцы ===");
        Owner owner = new Owner(202, "Мария", "Гречаный", "Совладелец", "Бельцы, ул. Михай Эминеску, д. 15", "+373 69 765 432", 150000, "Физическое лицо", 40.5);
        owner.displayEmployeeInfo();

        System.out.println("\n=== Исполнительный владелец ===");
        ExecutiveOwner executive = new ExecutiveOwner(303, "Сергей", "Дьяков", "Генеральный директор", "Тирасполь, ул. Ленина, д. 3", "+373 67 654 321", 200000, "Корпоративный владелец", 60.0, "CEO");
        executive.displayEmployeeInfo();
    }

}