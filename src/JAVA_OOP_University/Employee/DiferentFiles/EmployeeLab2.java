package JAVA_OOP_University.Employee.DiferentFiles;

public class EmployeeLab2 {
    //   Приватные поля
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String address;
    private String phone;
    private double salary;

    // Конструктор без параметров (стандартные значения)
    public EmployeeLab2() {
        this.id = 0;
        this.lastName = "Unknown";
        this.firstName = "Unknown";
        this.position = "Unemployed";
        this.address = "Not specified";
        this.phone = "Not specified";
        this.salary = 0.0;
    }

    // Конструктор со всеми параметрами
    public EmployeeLab2(int id, String firstName, String lastName, String position, String address, String phone, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }
    // Конструктор с двумя параметрами (остальные стандартные)
    public EmployeeLab2(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = "Unknown";
        this.position = "Unemployed";
        this.address = "Not specified";
        this.phone = "Not specified";
        this.salary = 5000.0; // Стандартная зарплата
    }
    // Геттеры и сеттеры для каждого поля

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод для отображения информации о сотруднике
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Должность: " + position);
        System.out.println("Адрес: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Использование конструктора без параметров
        EmployeeLab2 emp1 = new EmployeeLab2();
        System.out.println("Сотрудник 1 (Конструктор без параметров):");
        emp1.displayEmployeeInfo();

        // Использование конструктора со всеми параметрами
        EmployeeLab2 emp2 = new EmployeeLab2(1, "Иванов", "Иван", "Программист", "Бельцы, ул. Измаил, д. 1", "+373 69 999 999", 50000);
        System.out.println("\nСотрудник 2 (Конструктор со всеми параметрами):");
        emp2.displayEmployeeInfo();

        // Использование конструктора с двумя параметрами
        EmployeeLab2 emp3 = new EmployeeLab2(2, "Петров");
        System.out.println("\nСотрудник 3 (Конструктор с двумя параметрами):");
        emp3.displayEmployeeInfo();
    }
}