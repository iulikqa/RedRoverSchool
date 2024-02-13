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
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
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

        int counts = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                counts++;
            }
        }
        System.out.println(counts);
        System.out.println();


//        Задача №3
//          Дана строка:
//          String s = “Посмотрите как Рите нравится ритм”;
//          необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//          Для указанной строки ответ будет 6, 15, 29.

        System.out.println("Задача №3");
        String s3 = "Посмотрите как Рите нравится ритм";

        s3 = s3.toLowerCase();

        for (int i = 0; i <= s3.length() - 3; i++) {
            String subStr = s3.substring(i, i + 3);
            if (subStr.equals("рит")) {
                System.out.println(i);
            }
        }

        System.out.println();

//        Экстра задача №4
//          Дан массив:
//          String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//          необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        System.out.println("Задача №4");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

