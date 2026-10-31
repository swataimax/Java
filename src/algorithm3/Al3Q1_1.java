package algorithm3;

import java.util.Random;

public class Al3Q1_1 {
    public static void main(String args[]) {
        new Al3Q1_1(10);
    }

    Al3Q1_1(int max) {
        int array[] = new int[max];
        Random rnd = new Random();
        for (int i = 0; i < max; i++) { //乱数でデータを作成
            array[i] = rnd.nextInt(100);
        }
        print(array); //初期状態を表示
        bubblesort(array); //整列
        print(array); //整列後の状態を表示
    }

    void bubblesort(int array[]) { //整列
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
            print(array); //問題１①追加
        }
    }

    void print(int array[]) { //配列の状態を表示
        for (int val : array) {
            System.out.print((val < 10 ? "  " : " ") + val + " ");
        }
        System.out.println();
    }
}
