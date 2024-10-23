package JAVA_OOP_University.Employee.Incapsulation;

public class EmployeePart2 {
        public static void main(String[] args) {
            // Использование конструктора без параметров
            Employee emp1 = new Employee();
            System.out.println("Сотрудник 1 (Конструктор без параметров):");
            emp1.displayEmployeeInfo();

            // Использование конструктора со всеми параметрами
            Employee emp2 = new Employee(1, "Иванов", "Иван", "Программист", "Москва, ул. Ленина, д. 1", "+7 900 123 45 67", 50000);
            System.out.println("\nСотрудник 2 (Конструктор со всеми параметрами):");
            emp2.displayEmployeeInfo();

            // Использование конструктора с двумя параметрами
            Employee emp3 = new Employee(2, "Петров");
            System.out.println("\nСотрудник 3 (Конструктор с двумя параметрами):");
            emp3.displayEmployeeInfo();
        }
    }
