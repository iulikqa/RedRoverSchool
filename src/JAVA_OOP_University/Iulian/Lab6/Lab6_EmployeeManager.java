package JAVA_OOP_University.Iulian;

import JAVA_OOP_University.Iulian.Employees.EmployeeLab1;
import java.util.*;

public class Lab6_EmployeeManager {
    public static void main(String[] args) {
        // Создаем список сотрудников
        List<EmployeeLab1> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeLab1(105, "Ivanov", "Alexey", "Manager", "123 Main St", "+37368912964", 75500.50));
        employeeList.add(new EmployeeLab1(102, "Petrov", "Sergey", "Developer", "456 Elm St", "+37360123456", 85000.75));
        employeeList.add(new EmployeeLab1(103, "Sidorov", "Nikolay", "Analyst", "789 Oak St", "+37361234567", 68000.30));
        employeeList.add(new EmployeeLab1(101, "Smirnov", "Dmitry", "QA Engineer", "321 Pine St", "+37362345678", 72000.10));
        employeeList.add(new EmployeeLab1(104, "Fedorov", "Mikhail", "Designer", "654 Birch St", "+37363456789", 78000.20));

        // Вывод списка
        System.out.println("Список сотрудников (ArrayList):");
        for (EmployeeLab1 emp : employeeList) {
            emp.displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        // LinkedList с теми же сотрудниками
        LinkedList<EmployeeLab1> employeeLinkedList = new LinkedList<>(employeeList);
        System.out.println("\nСписок сотрудников (LinkedList):");
        for (EmployeeLab1 emp : employeeLinkedList) {
            emp.displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        // Компаратор для сортировки по ID
        Comparator<EmployeeLab1> byIdComparator = Comparator.comparingInt(EmployeeLab1::getId);
        employeeList.sort(byIdComparator);

        System.out.println("\nОтсортированный список сотрудников по ID:");
        for (EmployeeLab1 emp : employeeList) {
            emp.displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        System.out.println("\nВывод списка через Итератор:");
        Iterator<EmployeeLab1> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            iterator.next().displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        // TreeSet сортирует автоматически
        Set<EmployeeLab1> employeeTreeSet = new TreeSet<>(byIdComparator);
        employeeTreeSet.addAll(employeeList);

        System.out.println("\nСотрудники в TreeSet (отсортированы по ID):");
        for (EmployeeLab1 emp : employeeTreeSet) {
            emp.displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        Set<EmployeeLab1> employeeHashSet = new HashSet<>(employeeList);
        System.out.println("\nСотрудники в HashSet:");
        for (EmployeeLab1 emp : employeeHashSet) {
            emp.displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        Map<Integer, EmployeeLab1> employeeHashMap = new HashMap<>();
        for (EmployeeLab1 emp : employeeList) {
            employeeHashMap.put(emp.getId(), emp);
        }

        System.out.println("\nВывод сотрудников из HashMap:");
        for (Map.Entry<Integer, EmployeeLab1> entry : employeeHashMap.entrySet()) {
            System.out.println("ID: " + entry.getKey());
            entry.getValue().displayEnoiyeeInfo();
            System.out.println("---------------------");
        }

        TreeMap<Integer, EmployeeLab1> employeeTreeMap = new TreeMap<>(employeeHashMap);

        System.out.println("\nВывод сотрудников из TreeMap (сортировка по ID):");
        for (Map.Entry<Integer, EmployeeLab1> entry : employeeTreeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey());
            entry.getValue().displayEnoiyeeInfo();
            System.out.println("---------------------");
        }
    }
}


