package HW.HW7;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Anna";
        person1.age = 22;
        person1.sex = 'f';
        person1.getName();
        System.out.println(person1.getName());

        System.out.println("==============================");

        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 29;
        person2.sex = 'm';
        person2.getName();
        System.out.println(person2.getName());

        System.out.println("==============================");

        Employee ami = new Employee();
        ami.name = "Ami Grifindor";
        ami.age = 27;
        ami.sex = 'f';
        ami.salary = 24900.0;

        Employee john = new Employee();
        john.name = "John Climpton";
        john.age = 45;
        john.sex = 'm';
        john.salary = 68420.56;

        Employee michael = new Employee();
        michael.name = "Michael Mcortny";
        michael.age = 45;
        michael.sex = 'm';
        michael.salary = 68420.56;


        System.out.println(ami.isSameName(john));

        System.out.println("==============================");

        Employee[] employees = {ami, john, michael};

        System.out.println(Salary.getSum(employees));



    }
}
