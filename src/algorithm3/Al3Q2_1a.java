package algorithm3;

import java.util.Random;

/**
 * 選択ソート
 */
public class Al3Q2_1a {
    public static void main(String args[]) {
        new Al3Q2_1a(5);
    }

    Al3Q2_1a(int size) {
        int array[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(90) + 10;
        }
        print(array, false);
        sort(array);
        print(array, false);
    }

    public void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i; //最小値の位置を格納
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minpos]) {
                    minpos = j; //最小値の位置だけを記憶
                }
            }
            int tmp = array[i];
            array[i] = array[minpos];
            array[minpos] = tmp;
            print(array, true);
        }
    }

    public void print(int array[], boolean bracket) {
        System.out.print(bracket ? "[" : " ");
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print((bracket ? ", " : "  ") + array[i]);
        }
        System.out.println(bracket ? "]" : "");
    }
}
