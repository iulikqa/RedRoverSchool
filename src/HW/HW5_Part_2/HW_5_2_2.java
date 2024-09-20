package HW.HW5_Part_2;

public class HW_5_2_2 {
    public static void main(String[] args) {
        /*
        Задача №2
        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.
        */

        int count = 0;
        String s = "Перевыборы выбранного президента";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println("количество букв “е” в строке = " + count);
    }
}
