package JAVA_OOP_University.Natalia.Cars;

public class GPSAutomaticCar extends AutomaticCar {
    private String gpsType;

    public GPSAutomaticCar(String number, String brend, String model, String color, String country, double price, int gearCount, int reverseGears, String gpsType) {
        super(number, brend, model, color, country, price, gearCount, reverseGears);
        this.gpsType = gpsType;
    }

    public void displayGPSAutomaticCarInfo() {
        displayAutomaticCarInfo();
        System.out.println("Тип GPS: " + gpsType);
    }
}
