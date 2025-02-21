package JAVA_OOP_University.Natalia.Cars;

public class CarsTest {
    public static void main(String[] args) {
        CarsLab2 car1 = new CarsLab2("GBR 096", "Peugeot", "AMG Compressor", "Silver Gray", "Germany", 13850.55);
        AutomaticCar autoCar = new AutomaticCar("XYZ 123", "BMW", "X5", "Black", "Germany", 50000, 8, 1);
        GPSAutomaticCar gpsCar = new GPSAutomaticCar("ABC 456", "Audi", "Q7", "White", "Germany", 60000, 7, 1, "Garmin");

        System.out.println("\nИнформация об автомобиле:");
        car1.displayCarsInfo();

        System.out.println("\nИнформация об автомобиле с АКПП:");
        autoCar.displayAutomaticCarInfo();

        System.out.println("\nИнформация об автомобиле с АКПП и GPS:");
        gpsCar.displayGPSAutomaticCarInfo();
    }
}
