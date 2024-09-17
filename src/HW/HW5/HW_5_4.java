package HW.HW5;

public class HW_5_4 {
    public static void main(String[] args) {
        /*
        Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.
        */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
             sumArray +=array[i];

        }
        System.out.println(sumArray / array.length);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j = 0; j< array [i]; j++){
                if(max<array [i]){
                    max=array[i];
                }

            }
            System.out.println(max);
        }
        /*
        Задача №6
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.
        */

        int count=0;
        for(int i=0;i<array.length;i++){
            count+= array[i];
        }
        System.out.println(count);



    }
}

