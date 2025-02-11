package JAVA_OOP_University.Natalia;

import JAVA_OOP_University.Natalia.Cars.CarsLab1;
import java.util.*;

public class CarLab6 extends CarsLab1 {
    public CarLab6(String number, String brend, String model, String color, String country, double price) {
        super(number, brend, model, color, country, price);
    }

    public static void main(String[] args) {
        // Создание объектов CarsLab1
        CarsLab1 car1 = new CarsLab1("GBR 096", "Peugeot", "AMG Compressor", "Silver Gray", "Germany", 13850.55);
        CarsLab1 car2 = new CarsLab1("FRA 123", "Renault", "Clio", "Red", "France", 12000.00);
        CarsLab1 car3 = new CarsLab1("USA 456", "Ford", "Mustang", "Blue", "USA", 30000.00);
        CarsLab1 car4 = new CarsLab1("ITA 789", "Fiat", "500", "White", "Italy", 15000.00);
        CarsLab1 car5 = new CarsLab1("JPN 321", "Toyota", "Corolla", "Black", "Japan", 18000.00);

        // Использование ArrayList
        List<CarsLab1> arrayList = new ArrayList<>();
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.add(car5);

        // Сортировка и вывод ArrayList по цене
        System.out.println("ArrayList (по цене):");
        Collections.sort(arrayList, Comparator.comparingDouble(CarsLab1::getPrice));
        for (CarsLab1 car : arrayList) {
            car.displayCarsInfo();
            System.out.println();
        }

        // Использование LinkedList
        List<CarsLab1> linkedList = new LinkedList<>(arrayList);

        // Сортировка и вывод LinkedList по марке
        System.out.println("LinkedList (по марке):");
        Collections.sort(linkedList, Comparator.comparing(CarsLab1::getBrend));
        for (CarsLab1 car : linkedList) {
            car.displayCarsInfo();
            System.out.println();
        }

        // Использование TreeSet
        Set<CarsLab1> treeSet = new TreeSet<>(Comparator.comparing(CarsLab1::getModel));
        treeSet.add(car1);
        treeSet.add(car2);
        treeSet.add(car3);
        treeSet.add(car4);
        treeSet.add(car5);

        // Вывод TreeSet
        System.out.println("TreeSet (по модели):");
        for (CarsLab1 car : treeSet) {
            car.displayCarsInfo();
            System.out.println();
        }

        // Использование HashSet
        Set<CarsLab1> hashSet = new HashSet<>(arrayList);

        // Вывод HashSet
        System.out.println("HashSet:");
        for (CarsLab1 car : hashSet) {
            car.displayCarsInfo();
            System.out.println();
        }

        // Использование HashMap
        Map<String, CarsLab1> hashMap = new HashMap<>();
        hashMap.put(car1.getNumber(), car1);
        hashMap.put(car2.getNumber(), car2);
        hashMap.put(car3.getNumber(), car3);
        hashMap.put(car4.getNumber(), car4);
        hashMap.put(car5.getNumber(), car5);

        // Вывод HashMap
        System.out.println("HashMap:");
        for (Map.Entry<String, CarsLab1> entry : hashMap.entrySet()) {
            System.out.println("Номер: " + entry.getKey());
            entry.getValue().displayCarsInfo();
            System.out.println();
        }

        // Использование TreeMap
        Map<String, CarsLab1> treeMap = new TreeMap<>(hashMap);

        // Вывод TreeMap
        System.out.println("TreeMap:");
        for (Map.Entry<String, CarsLab1> entry : treeMap.entrySet()) {
            System.out.println("Номер: " + entry.getKey());
            entry.getValue().displayCarsInfo();
            System.out.println();
        }
    }
}
