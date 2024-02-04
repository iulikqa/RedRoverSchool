package Lessons;

public class cheburashka {
    public static void main(String[] args) {
        int totalOrange = 10;
        int forCheburashka = 1;
        int forGhena = forCheburashka - totalOrange;

        if (forCheburashka  < forGhena) {
            System.out.println("Какой Чебуркашка жадный!" + ("\ud83d\ude24"));
        } else if (forCheburashka < forGhena){
            System.out.println("Зеленый обнаглел!");
        } else {
            System.out.println("Оба молодцы" + ("\uD83D\uDC4D"));
        }
        System.out.println("Конец!");
    }
}
