package JAVA_OOP_University.Natalia.Cars;
public class CarsLab2 {
    // Приватные поля
    private String number;
    private String brend;
    private String model;
    private String color;
    private String country;
    private double price;

    // Конструктор без параметров
    public CarsLab2() {
        this.number = "UNKNOWN";
        this.brend = "UNKNOWN";
        this.model = "UNKNOWN";
        this.color = "UNKNOWN";
        this.country = "UNKNOWN";
        this.price = 0.0;
    }

    // Конструктор со всеми параметрами
    public CarsLab2(String number, String brend, String model, String color, String country, double price) {
        this.number = number;
        this.brend = brend;
        this.model = model;
        this.color = color;
        this.country = country;
        this.price = price;
    }

    // Конструктор с одним или двумя параметрами
    public CarsLab2(String number, String brend) {
        this.number = number;
        this.brend = brend;
        this.model = "Standard Model"; // Стандартное значение
        this.color = "Black"; // Стандартный цвет
        this.country = "Unknown Country"; // Стандартная страна
        this.price = 10000.0; // Стандартная цена
    }

    // Геттеры и сеттеры для каждого поля
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для отображения информации об автомобиле
    public void displayCarsInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Марка: " + brend);
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + String.format("%.2f", price));
    }



    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создание объектов автомобилей с разными конструкторами
        CarsLab2 car1 = new CarsLab2("GBR 096", "Peugeot", "AMG Compressor", "Silver Gray", "Germany", 13850.55);
        CarsLab2 car2 = new CarsLab2(); // Автомобиль с конструктором без параметров
        CarsLab2 car3 = new CarsLab2("GBR 097", "Toyota"); // Автомобиль с одним параметром

        // Отображение информации об автомобилях
        System.out.println("Информация об автомобиле 1:");
        car1.displayCarsInfo();

        System.out.println("\nИнформация об автомобиле 2 (по умолчанию):");
        car2.displayCarsInfo();

        System.out.println("\nИнформация об автомобиле 3 (с одним параметром):");
        car3.displayCarsInfo();
    }
}












