package JAVA_OOP_University.Natalia.Lab7;

import JAVA_OOP_University.Natalia.Cars.CarsLab1;

import java.io.*;
import java.util.*;

public class CarsFileManager {
    private static final String FILE_NAME = "cars.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CarsLab1> cars = loadCarsFromFile();
        int choice;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить автомобиль");
            System.out.println("2. Вывести всех автомобилей");
            System.out.println("3. Вывести черные автомобили");
            System.out.println("4. Изменить данные автомобиля");
            System.out.println("5. Удалить автомобиль");
            System.out.println("6. Сохранить в файл");
            System.out.println("7. Выход");
            System.out.print("Выберите опцию: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addCar(scanner, cars);
                    break;
                case 2:
                    displayCars(cars);
                    break;
                case 3:
                    displayBlackCars(cars);
                    break;
                case 4:
                    modifyCar(scanner, cars);
                    break;
                case 5:
                    deleteCar(scanner, cars);
                    break;
                case 6:
                    saveCarsToFile(cars);
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
    }

    private static List<CarsLab1> loadCarsFromFile() {
        List<CarsLab1> cars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    cars.add(new CarsLab1(data[0], data[1], data[2], data[3], data[4], Double.parseDouble(data[5])));
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден или пуст. Начинаем с пустого списка.");
        }
        return cars;
    }

    private static void saveCarsToFile(List<CarsLab1> cars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (CarsLab1 car : cars) {
                writer.write(car.getNumber() + "," + car.getBrend() + "," + car.getModel() + "," +
                        car.getColor() + "," + car.getCountry() + "," + car.getPrice());
                writer.newLine();
            }
            System.out.println("Данные сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }

    private static void displayCars(List<CarsLab1> cars) {
        if (cars.isEmpty()) {
            System.out.println("Файл пуст.");
            return;
        }
        cars.forEach(CarsLab1::displayCarsInfo);
    }

    private static void addCar(Scanner scanner, List<CarsLab1> cars) {
        System.out.print("Введите номер: ");
        String number = scanner.nextLine();
        System.out.print("Введите марку: ");
        String brand = scanner.nextLine();
        System.out.print("Введите модель: ");
        String model = scanner.nextLine();
        System.out.print("Введите цвет: ");
        String color = scanner.nextLine();
        System.out.print("Введите страну: ");
        String country = scanner.nextLine();
        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        cars.add(new CarsLab1(number, brand, model, color, country, price));
        System.out.println("Автомобиль добавлен.");
    }

    private static void modifyCar(Scanner scanner, List<CarsLab1> cars) {
        System.out.print("Введите номер автомобиля для изменения: ");
        String number = scanner.nextLine();
        for (CarsLab1 car : cars) {
            if (car.getNumber().equals(number)) {
                System.out.print("Введите новый цвет: ");
                car.setColor(scanner.nextLine());
                System.out.print("Введите новую цену: ");
                car.setPrice(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Данные обновлены.");
                return;
            }
        }
        System.out.println("Автомобиль не найден.");
    }

    private static void deleteCar(Scanner scanner, List<CarsLab1> cars) {
        System.out.print("Введите номер автомобиля для удаления: ");
        String number = scanner.nextLine();
        cars.removeIf(car -> car.getNumber().equals(number));
        System.out.println("Автомобиль удален.");
    }

    private static void displayBlackCars(List<CarsLab1> cars) {
        System.out.println("Автомобили черного цвета:");
        cars.stream().filter(car -> "Черный".equalsIgnoreCase(car.getColor())).forEach(CarsLab1::displayCarsInfo);
    }
}

