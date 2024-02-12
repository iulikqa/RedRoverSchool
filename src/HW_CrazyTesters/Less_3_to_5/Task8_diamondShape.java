package HW_CrazyTesters.Less_3_to_5;

import java.util.Scanner;

public class Task8_diamondShape {
    public static void main(String[] args) {
// Напишите программу на Java, которая запрашивает у пользователя ввод
// нечетного числа и выводит на экран ромб, состоящий из звездочек *.
// Ширина ромба равна введенному числу, и он должен быть симметричным
// относительно своей горизонтальной и вертикальной оси.
// Пример вывода для числа 5:
//   *
//  ***
// *****
//  ***
//   *
// Примечание: Ширина ромба (в данном случае 5) определяет как количество звездочек
// в его самой широкой части, так и общее количество строк.

        System.out.println("Введите ширину ромба: ");

        Scanner sc = new Scanner(System.in);
        int diamondWith = sc.nextInt();

        for (int i = 1; i <= diamondWith / 2 + 1; i++){
            for (int j = 1; j <= diamondWith / 2 + 1 - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= diamondWith / 2; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = diamondWith - 2; j >= i * 2 - 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
