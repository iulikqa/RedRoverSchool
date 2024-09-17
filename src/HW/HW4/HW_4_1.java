package HW.HW4;

public class HW_4_1 {
    public static void main(String[] args) {
        /*
        Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива.
        */

        int [] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            for (int i = 0; i < array.length; i++){
               int  currentElemnt = array[i];
               if (currentElemnt % 2 > 0){
                   System.out.println(currentElemnt);
               }
            }
    }
}
