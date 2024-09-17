package HW.HW4;

public class HW_4_2 {
    public static void main(String[] args) {
        /*Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.
        */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int w = 0; w < array.length; w++) {
            int currentElemnt = array[w];
            if (currentElemnt > 5) {
                System.out.println(currentElemnt);
            }
        }
    }
}
