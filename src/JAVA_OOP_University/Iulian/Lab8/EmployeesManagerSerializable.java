package JAVA_OOP_University.Iulian.Lab8;

import JAVA_OOP_University.Iulian.Employees.EmployeeLab1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesManagerSerializable {

        private static final String FILE_NAME = "employees.dat";
        private static List<EmployeeLab1> employees = new ArrayList<>();

        public static void main(String[] args) {
            loadEmployees();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить сотрудника");
                System.out.println("2. Вывести всех сотрудников");
                System.out.println("3. Вывести работников с зарплатой больше 3000");
                System.out.println("4. Изменить данные сотрудника");
                System.out.println("5. Удалить сотрудника");
                System.out.println("6. Сохранить в файл");
                System.out.println("7. Выход");
                System.out.print("Выберите опцию: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // очистка буфера

                switch (choice) {
                    case 1:
                        addEmployee(scanner);
                        break;
                    case 2:
                        displayAllEmployees();
                        break;
                    case 3:
                        displayEmployeesWithSalaryAbove3000();
                        break;
                    case 4:
                        modifyEmployee(scanner);
                        break;
                    case 5:
                        deleteEmployee(scanner);
                        break;
                    case 6:
                        saveEmployees();
                        break;
                    case 7:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } while (choice != 7);
        }

        private static void loadEmployees() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                employees = (List<EmployeeLab1>) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден, будет создан новый.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        private static void saveEmployees() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(employees);
                System.out.println("Данные успешно сохранены в файл.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void addEmployee(Scanner scanner) {
            System.out.print("Введите ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // очистка буфера
            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine();
            System.out.print("Введите должность: ");
            String position = scanner.nextLine();
            System.out.print("Введите адрес: ");
            String address = scanner.nextLine();
            System.out.print("Введите телефон: ");
            String phone = scanner.nextLine();
            System.out.print("Введите зарплату: ");
            double salary = scanner.nextDouble();

            EmployeeLab1 employee = new EmployeeLab1(id, firstName, lastName, position, address, phone, salary);
            employees.add(employee);
            System.out.println("Сотрудник добавлен.");
        }

        private static void displayAllEmployees() {
            for (EmployeeLab1 employee : employees) {
                employee.displayEnoiyeeInfo();
                System.out.println();
            }
        }

    // Метод для отображения сотрудников с зарплатой больше 3000
    private static void displayEmployeesWithSalaryAbove3000() {
        boolean found = false;
        for (EmployeeLab1 employee : employees) {
            if (employee.getSalary() > 3000) {
                employee.displayEnoiyeeInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет сотрудников с зарплатой больше 3000.");
        }
    }

        private static void modifyEmployee(Scanner scanner) {
            System.out.print("Введите ID сотрудника для изменения: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // очистка буфера
            for (EmployeeLab1 employee : employees) {
                if (employee.getId() == id) {
                    System.out.print("Введите новое имя (текущая: " + employee.getFirstName() + "): ");
                    employee.setFirstName(scanner.nextLine());
                    System.out.print("Введите новую фамилию (текущая: " + employee.getLastName() + "): ");
                    employee.setLastName(scanner.nextLine());
                    System.out.print("Введите новую должность (текущая: " + employee.getPosition() + "): ");
                    employee.setPosition(scanner.nextLine());
                    System.out.print("Введите новый адрес (текущий: " + employee.getAddress() + "): ");
                    employee.setAddress(scanner.nextLine());
                    System.out.print("Введите новый телефон (текущий: " + employee.getPhone() + "): ");
                    employee.setPhone(scanner.nextLine());
                    System.out.print("Введите новую зарплату (текущая: " + employee.getSalary() + "): ");
                    employee.setSalary(scanner.nextDouble());
                    System.out.println("Данные сотрудника обновлены.");
                    return;
                }
            }
            System.out.println("Сотрудник с таким ID не найден.");
        }

        private static void deleteEmployee(Scanner scanner) {
            System.out.print("Введите ID сотрудника для удаления: ");
            int id = scanner.nextInt();
            employees.removeIf(employee -> employee.getId() == id);
            System.out.println("Сотрудник удален, если он существовал.");
        }
    }

