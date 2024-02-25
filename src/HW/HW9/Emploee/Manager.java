package HW.HW9.Emploee;

// Задача №3
// Необходимо создать класс Manager с полями: имя, возраст, пол,
// ЗП в день и количество подчиненных. Все поля сделать приватными и для
// каждого поля добавить методы set и get. Класс должен иметь
// метод - getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.
// К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

import HW.HW9.months.Month;

public class Manager {
    private String name;
    private int age;
    private char sex;
    private double dailySalary;
    private int numberOfSubordinates;

    public double getSalary(Month[] monthArray){
        double sum =0.0;
        for (int i = 0; i < monthArray.length; i++){
            sum += monthArray[i].getWorkDays() * dailySalary;
        }
        return sum * (1 + numberOfSubordinates * 0.01);
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

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
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

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
