package HW.HW7;

public class Person {
// Задача №1
// Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.
    String name;
    int age;
    char sex;

    int salary;

    String getName() {
        String prefix = "";
        if (Character.toLowerCase(sex) == 'm') {
            prefix = "Mr. ";
        } else if (Character.toLowerCase(sex) == 'f'){
            prefix = "Mrs. ";
        }
        return prefix + name;
    }

}
