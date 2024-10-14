package HW.HW6;

/*
    Необходимо создать класс Director с теми же методами, что и Manager,
    но метод getSalary должен возвращать результат по формуле - <базовая ставка> *
    (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
*/

public class Director {
    double baseSalary;
    String name;
    int numberOfSubordinates;

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(){
        return getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
    }
}
