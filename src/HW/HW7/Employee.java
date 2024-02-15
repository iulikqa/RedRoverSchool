package HW.HW7;

public class Employee {
// Задача №2
// Необходимо создать класс Employee с полями как у Person
// (из предыдущего задания) и поле зарплата. Класс должен иметь
// метод isSameName(Employee employee) который возвращает true,
// если у сотрудника у которого был вызван метод и сотрудника
// который был передан как параметр, одинаковое имя.
    String name;
    int age;
    char sex;
    double salary;

    boolean isSameName(Employee otherEmployee) {
        return name.equals(otherEmployee.name);

    }
}
