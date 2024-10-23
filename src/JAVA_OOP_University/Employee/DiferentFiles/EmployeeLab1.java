package JAVA_OOP_University.Employee.DiferentFiles;

public class EmployeeLab1 {
    //   Приватные поля
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String address;
    private String phone;
    public double salary;

    //    Конструктор
    public EmployeeLab1(int id, String firstName, String lastName, String position, String address, String phone, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    // Геттеры и сеттеры для каждого поля

    // ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    Фамилия
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //    Имя
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //    Должность
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //    Адрес
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //  Телефон
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //    Зарплата
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //    Метод для преобразования зарплаты из леев в евро
    public void convertSalarytoEuro(double excangeRate) {
        this.salary = this.salary / excangeRate;
    }

    //    Метод для отображения информации о сотруднике
    public void displayEnoiyeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Фамилия: " + firstName);
        System.out.println("Имя: " + lastName);
        System.out.println("Должность: " + position);
        System.out.println("Адрес: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + String.format("%.2f", salary));
    }

    //     Главный метод для тестирования
    public static void main(String[] args) {
        //    Создание объекта сотрудника
        EmployeeLab1 emp1 = new EmployeeLab1(101, "Ivanov", "Alexey", "Manager", "123 Main St, Cityville", "+37368912964", 75500.50);

        //    Отображение начальной информации о сотруднике
        emp1.displayEnoiyeeInfo();

        emp1.setSalary(95000.99);

        //    Преобразование зарплаты в евро по курсу 19.29
        double exchangeRate = 19.29;
        emp1.convertSalarytoEuro(exchangeRate);

        //    Отображение информации после зменения поля Зарплата и конвертации в евро
        System.out.println("\nПосле конвертации зарплаты в EUR:");
        emp1.displayEnoiyeeInfo();
    }

}
