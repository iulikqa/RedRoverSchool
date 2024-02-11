package HW;

public class HW6_1 {
    public static void main(String[] args) {
//       Задача №1
//          Дана строка:
//          String s = “Перестановочный алгоритм быстрого действия”;
//          необходимо вывести все буквы “о” из этой строки.
//          Для указанной строки ответ будет “ооооо” (или в столбик)

        System.out.println("Задача №1");
        String s = "Перестановочный алгоритм быстрого действия";

        // Поиск и вывод букв "о"
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'о' || currentChar == 'О') {
                System.out.print(currentChar);
            }
        }
        System.out.println();
        System.out.println();


//        Задача №2
//          Дана строка:
//          String s = “Перевыборы выбранного президента”;
//          необходимо подсчитать количество букв “е” в строке.
//          Для указанной строки ответ будет 4.

        System.out.println("Задача №2");
        String s2 = "Перевыборы выбранного президента";

        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();


//        Задача №3
//          Дана строка:
//          String s = “Посмотрите как Рите нравится ритм”;
//          необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//          Для указанной строки ответ будет 6, 15, 29.

        System.out.println("Задача №3");
        String s3 = "Посмотрите как Рите нравится ритм";

        String toFind = "рит";

        String lowerCaseS = s3.toLowerCase();
        String lowerCaseSubstring = toFind.toLowerCase();

        // Поиск и вывод индексов начала подстроки "рит" без учета регистра
        System.out.println("Индексы начала подстроки 'рит' без учета регистра:");
        int index = lowerCaseS.indexOf(lowerCaseSubstring);
        while (index != -1) {
            System.out.println(index);
            index = lowerCaseS.indexOf(lowerCaseSubstring, index + 1);
        }

        System.out.println();

//        Экстра задача
//          Дан массив:
//          String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//          необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        System.out.println("Задача №4");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            boolean containsE = false;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].toLowerCase().contains("е")) {
                    containsE = true;
                    break;
                }
            }
            if (!containsE) {
                count2++;
            }
            System.out.println(count2);
        }
    }
}

