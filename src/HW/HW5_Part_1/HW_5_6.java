package HW.HW5_Part_1;

public class HW_5_6 {
    public static void main(String[] args) {
        /*Задача №6
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива
        */

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива = " + count);
    }
}

