package HW_CrazyTesters.Less_3_to_5;

public class Task10_hollowPyramid {
    public static void main(String[] args) {
//  Напишите программу, которая выводит на экран полую пирамиду из чисел высотой 6 рядов:
//         1
//       2  3
//      4    5
//     6      7
//    8        9
//  10    11   12


        int height = 1;
        int step = 0;

        // Вывод пустой пирамиды
        System.out.println("Пустая пирамида из чисел:");

//      Основной внешний цикл, который отвечает за количество строк в пирамиде.
        for (int i = 0; i < 5; i++) {
            // Вывод пробелов перед числами
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

//          Внутренний цикл - выводит
//          пробелы перед числами, чтобы создать пирамидальную форму.
            for (int j = 0; j < 1; j++) {
                System.out.print(height);
                height += 1;
            }

            for ( int j = 0; j < i; j++){
                System.out.print("  ");
            }

            if (i == 0){
                System.out.println();
                continue;
            }else {
                for (int j = 0; j < 1; j++){
                    System.out.print(height);
                    height += 1;
                }
            }
            System.out.println();
            step++;
        }
        if (step == 4){
            for (int j = 0; j < 3; j++){
                System.out.print(height + "   ");
                height++;
            }
        }
    }
}
