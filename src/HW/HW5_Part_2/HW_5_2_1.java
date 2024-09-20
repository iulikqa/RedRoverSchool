package HW.HW5_Part_2;

public class HW_5_2_1 {
    public static void main(String[] args) {
        /*
        Задача №1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)
        */

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i <s.length(); i++){
            if (s.charAt(i) == 'о'){
                System.out.print(s.charAt(i));
            }
        }
    }
}
