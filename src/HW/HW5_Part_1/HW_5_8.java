package HW.HW5_Part_1;

public class HW_5_8 {
    public static void main(String[] args) {
        /*
            Задача №8
            Дан массив:
            int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            необходимо вывести количество элементов в массиве.
            */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sumCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumCount += array[i][j];
            }

        }
        System.out.println("Количество элементов в массиве = " + sumCount);
    }
}
