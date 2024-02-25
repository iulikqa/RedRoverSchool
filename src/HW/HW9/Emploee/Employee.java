package HW.HW9.Emploee;

// Задача №2
// Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.

import HW.HW9.months.Month;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double dailySalary;

    public double getSalary(Month[] monthArray){
        double sum =0.0;
        for (int i = 0; i < monthArray.length; i++){
            sum += monthArray[i].getWorkDays() * dailySalary;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }
}
