package HW.HW7;

public class Salary {

// Задача №3
// Необходимо создать класс Salary с единственным методом -
// getSum(Employee[] employeeArray), метод должен возвращать
// сумму зарплат всех сотрудников из массива переданного в
// качестве аргумента вызова метода.

    static double getSum(Employee[] emploeeArray){
        double result = 0.0;
        for (int i = 0; i < emploeeArray.length; i++){
            result += emploeeArray[i].salary;
        }
        return result;
    }

}
