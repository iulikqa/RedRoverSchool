package JAVA_OOP_University.Employee.Incapsulation;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String position;
    private String address;
    private String phone;
    private double salary;

    public Employee() {
        this.id = 0;
        this.lastName = "Unknown";
        this.firstName = "Unknown";
        this.position = "Unemployed";
        this.address = "Not specified";
        this.phone = "Not specified";
        this.salary = 0.0;
    }

    public Employee(int id, String lastName, String firstName, String position, String address, String phone, double salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public Employee(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = "Default Name";
        this.position = "Default Position";
        this.address = "Default Address";
        this.phone = "Default Phone";
        this.salary = 1000.0;
    }

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Должность: " + position);
        System.out.println("Адрес: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
    }
}
