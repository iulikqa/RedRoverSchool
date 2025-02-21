package JAVA_OOP_University.Natalia.Cars;

// Класс автомобилей с автоматической коробкой передач
public class AutomaticCar extends CarsLab2{
    private int gearCount;
    private int reverseGears;

    public AutomaticCar(String number, String brend, String model, String color, String country, double price, int gearCount, int reverseGears) {
        super(number, brend, model, color, country, price);
        this.gearCount = gearCount;
        this.reverseGears = reverseGears;
    }

    public void displayAutomaticCarInfo() {
        displayCarsInfo();
        System.out.println("Количество передач: " + gearCount);
        System.out.println("Количество передач заднего хода: " + reverseGears);
    }
}
