package JAVA_OOP_University.Iulian.Employee.DiferentFiles;

// Класс Administration наследует EmployeeLab2
public class Administration extends EmployeeLab2{
    private String category;
    private int teamSize;

    // Конструктор без параметров
    public Administration() {
        super();
        this.category = "Unknown";
        this.teamSize = 0;
    }

    // Конструктор со всеми параметрами
    public Administration(int id, String firstName, String lastName, String position, String address, String phone, double salary, String category, int teamSize) {
        super(id, firstName, lastName, position, address, phone, salary);
        this.category = category;
        this.teamSize = teamSize;
    }

    // Геттеры и сеттеры
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Категория: " + category);
        System.out.println("Кол-во людей в руководстве: " + teamSize);
    }
}
