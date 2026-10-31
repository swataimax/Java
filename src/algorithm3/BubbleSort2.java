package algorithm3;

public class BubbleSort2 implements Sort {
    public static void main(String[] args) {
        new SortTester(10, new BubbleSort2(), true);
    }
    
    
    public void sort(int array[]) { //整列
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


}
