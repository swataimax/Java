package algorithm3;

import java.util.Random;

public class Al3Q4_1 {
    public static void main(String args[]) {
        new Al3Q4_1(20);
    }

    Al3Q4_1(int size) {
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
        qsort(array, 0, array.length - 1);
    }

    void qsort(int array[], int left, int right) {
        int pivot = array[(left + right) / 2];
        int i = left;
        int j = right;
        for (;;) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i >= j)
                break;
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        if (left < i - 1) {
            qsort(array, left, i - 1);
        }
        if (j + 1 < right) {
            qsort(array, j + 1, right);
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
