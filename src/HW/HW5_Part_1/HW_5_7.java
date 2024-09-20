package HW.HW5_Part_1;

public class HW_5_7 {
    public static void main(String[] args) {
        /*
        Задача №7
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести минимальное значение массива.
        */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(min < array[i][j]){
                    min = array[i][j];
                }

            }

        }
        System.out.println(min);
    }
}
