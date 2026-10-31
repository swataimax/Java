package algorithm3;

import java.util.Random;

public class Al3Q3_1 {
    public static void main(String args[]) {
        new Al3Q3_1(10);
    }

    Al3Q3_1(int size) {
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
        int h; //刻み幅
        for (h = 1; h < array.length; h = 3 * h + 1)
            ;
        for (h /= 3; h > 0; h /= 3) {
            System.out.printf("--- h=%d ---%n", h);
            for (int i = h; i < array.length; i++) { //挿入法
                int tmp = array[i];
                int j = i - h;
                while (j >= 0 && tmp < array[j]) {
                    array[j + h] = array[j];
                    j -= h;
                }
                array[j + h] = tmp;
                print(array, true);
            }
        }
    }

    public void print(int array[], boolean bracket) {
        System.out.print(bracket ? "[" : " ");
        if (array.length > 0)
            System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print((bracket ? ", " : "  ") + array[i]);
        }
        System.out.println(bracket ? "]" : "");
    }
}
