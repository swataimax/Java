package algorithm3;
import java.util.Random;
public class Al3Q2_2 {
    public static void main(String args[]) {
        for (int n = 100; n <= 100000; n *= 10) {
            System.out.printf("--- データ数 %,d ---%n", n);
            new Al3Q2_2(n);
        }
    }

    Al3Q2_2(int max) {
        int array1[] = new int[max];
        int array2[] = new int[max];
        int array3[] = new int[max];
        Random rnd = new Random();
        for (int i = 0; i < max; i++) { //乱数でデータを作成
            array1[i] = array2[i] = array3[i] = rnd.nextInt(max);
        }
        long t0 = System.nanoTime();
        bubblesort(array1); //整列
        long t1 = System.nanoTime();
        selectionsort(array2); //整列
        long t2 = System.nanoTime();
        insertionsort(array3); //整列
        long t3 = System.nanoTime();
        System.out.println("Bubble   :" + formattedNumber(t1 - t0) + " ns");
        System.out.println("Selection:" + formattedNumber(t2 - t1) + " ns");
        System.out.println("Insertion:" + formattedNumber(t3 - t2) + " ns");
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
        }
    }

    public void selectionsort(int array[]) {
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
        }
    }

    public void insertionsort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && tmp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }
    
    private String formattedNumber(long num) {
        String str = String.valueOf(num);
        for (int i = 0; str.length() < 15; i++) {
            str = " " + str;
        }
        return str;
    }
}
