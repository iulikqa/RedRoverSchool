package JAVA_OOP_University.Cars;

public class CarsLab1 {

    //    Приватные поля
    private String number;
    private String brend;
    private String model;
    private String color;
    private String country;
    private double price;

//    Конструктор

    public CarsLab1(String number, String brend, String model, String color, String country, double price) {
        this.number = number;
        this.brend = brend;
        this.model = model;
        this.color = color;
        this.country = country;
        this.price = price;
    }

//    Геттеры и сеттеры для каждого поля

    //    Номер
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //    Марка
    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    //    Модель
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //    Цвет
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //    Страна
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //    Цена
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //    Метод для преобразования цены из евро в молдавские леи
    public void convertPriceToMDL(double excangeRate) {

        this.price = this.price * excangeRate;
    }


    //  Метод для отображения информации об автомобиле
    public void displayCarsInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Марка: " + brend);
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + String.format("%.2f", price));
    }

    //     Главный метод для тестирования
    public static void main(String[] args) {

        //    Создание объекта автомобиль
        CarsLab1 firstCar = new CarsLab1("GBR 096", "Peugeot", "AMG Compressor", "Silver Gray", "Germany", 13850.55);

        //    Отображение начальной информации об автомобиле
        firstCar.displayCarsInfo();

        //    Преобразование цены из евро в молдавские леи по курсу +
        double exchangeRate = 20.46;
        firstCar.convertPriceToMDL(exchangeRate);

        //    Изменение поля Марка автомобиля
        firstCar.setBrend("Mercedes-Benz");

        //    Отображение информации после конвертации цены в леях и зменение цвета автомобиля
        System.out.println("\nПосле конвертации цены из EUR в MDL и изменение марки автомобиля:");
        firstCar.displayCarsInfo();
    }
}