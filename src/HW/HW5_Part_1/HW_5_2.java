package HW.HW5_Part_1;

public class HW_5_2 {
    public static void main(String[] args) {
        /*
    Задача №2
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести максимальное значение массива.
    */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = Integer.MIN_VALUE;
        for( int i = 0; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
