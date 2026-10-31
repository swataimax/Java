package algorithm3;

import java.util.Random;

/**
 * 挿入ソート
 */
public class Al3Q2_1b {
    public static void main(String args[]) {
        new Al3Q2_1b(5);
    }

    Al3Q2_1b(int size) {
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
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
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
