package JAVA_OOP_University.Iulian.Employees;

// Класс Owner наследует EmployeeLab2
public class Owner extends EmployeeLab2{
    private String ownerType;
    private double sharePercentage;

    public Owner() {
        super();
        this.ownerType = "Unknown";
        this.sharePercentage = 0.0;
    }

    public Owner(int id, String firstName, String lastName, String position, String address, String phone, double salary, String ownerType, double sharePercentage) {
        super(id, firstName, lastName, position, address, phone, salary);
        this.ownerType = ownerType;
        this.sharePercentage = sharePercentage;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public double getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(double sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Тип владельца: " + ownerType);
        System.out.println("Процент акций: " + sharePercentage + "%");
    }
}

