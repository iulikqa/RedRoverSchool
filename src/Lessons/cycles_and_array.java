package Lessons;

import java.util.Arrays;

public class cycles_and_array {
    public static void main(String[] args) {

//        for (int i = 5; i < 5; i = i + 1) {
//            System.out.println(i);
//        }
        int[] arr = {10, 20, 30};
        System.out.println(arr.length);

        arr[0] = 5; // изменение элемента массива
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[2]);

//        for (int i = 0; i < arr.length; i = i + 1){
//            System.out.println(arr[i]);
//            // помощью цикла for, можно обоити и вывести три раза все элементы массива
//        }
//
//        System.out.println(Arrays.toString(arr));
//        // ЛИБО ВОТ ТАК ВЫВЕСТИ ВСЕ ЭЛЕМЕНТЫ МАССИВА В ОДНУ СТРОКУ

        int[] arr2 = new int [100]; //создание неконстантного массива из 100 пустых индексов
        for (int i = 0; i < arr2.length; i = i + 1){
            arr2[i] = i;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
