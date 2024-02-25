package HW.HW9;

import HW.HW9.Emploee.Employee;
import HW.HW9.Emploee.Manager;
import HW.HW9.months.MonthUtils;
import HW.HW9.plates.LicensePlate;
import HW.HW9.plates.LicensesPlateMaker;

public class Main {
    public static void main(String[] args) {
        Employee jim = new Employee();
        jim.setName("Jim Harison");
        jim.setDailySalary(1000.0);

        System.out.println(jim.getSalary(MonthUtils.SUMMER));

        Manager michael = new Manager();
        michael.setName("Michael Jackson");
        michael.setDailySalary(1000.0);
        michael.setNumberOfSubordinates(5);

        System.out.println(michael.getSalary(MonthUtils.SUMMER));

        System.out.println();

        LicensesPlateMaker nyMaker = new LicensesPlateMaker("NY", 1000);
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println();

        LicensesPlateMaker nyMaker1 = new LicensesPlateMaker("CA", 192);
        System.out.println(nyMaker1.makeNextPlate().getPlate());
        System.out.println(nyMaker1.makeNextPlate().getPlate());
        System.out.println(nyMaker1.makeNextPlate().getPlate());



    }
}
