package HW.HW9.months;

// Задача №1
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

public class Month {
    private String name;
    private int totalDays;
    private int workDays;

    public Month(String name, int totalDays, int workDays) {
        this.name = name;
        this.totalDays = totalDays;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}
