package JAVA_OOP_University.Iulian.Employees;

// Класс ExecutiveOwner наследует Owner
public class ExecutiveOwner extends Owner {
    private String executiveRole;

    public ExecutiveOwner() {
        super();
        this.executiveRole = "Unknown";
    }

    public ExecutiveOwner(int id, String firstName, String lastName, String position, String address, String phone, double salary, String ownerType, double sharePercentage, String executiveRole) {
        super(id, firstName, lastName, position, address, phone, salary, ownerType, sharePercentage);
        this.executiveRole = executiveRole;
    }

    public String getExecutiveRole() {
        return executiveRole;
    }

    public void setExecutiveRole(String executiveRole) {
        this.executiveRole = executiveRole;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Исполнительная роль: " + executiveRole);
    }
}
