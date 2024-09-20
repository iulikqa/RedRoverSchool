package HW.HW5_Part_2;

public class HW_5_2_3 {
    public static void main(String[] args) {
        /*
        Задача №3
        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        Для указанной строки ответ будет 6, 15, 29.

        */
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i = 0; i <= s.length() - 3; i++) {
            String subStr = s.substring(i, i + 3);
            if (subStr.equals("рит")) {
                System.out.println("ндексы начала всех подстрок - “рит” + " + i);
            }
        }
    }
}
