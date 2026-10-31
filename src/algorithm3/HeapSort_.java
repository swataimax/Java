package algorithm3;

import java.util.Arrays;

public class HeapSort_ implements Sort {
	public static void main(String args[]) {
		new SortTester(10, new HeapSort_(), true);
	}

	public void sort(int array[]) {
		array[0]=54;
		array[1]=21;
		array[2]=2;
		array[3]=43;
		array[4]=17;
		array[5]=86;
		array[6]=25;
		array[7]=6;
		array[8]=85;
		array[9]=51;
		System.out.println();
		System.out.println("54  21  2  43  17  86  25  6  85  51");
		System.out.println("sort 1つ目のfor文 i=" + (array.length - 1) / 2);
		for (int i = (array.length - 1) / 2; i >= 0; i--) {
			System.out.print(i + " ");
			downheap(array, i, array.length - 1);
		}
		System.out.println();
		System.out.println("sort 2つ目のfor文 i=" + (array.length - 1));
		for (int i = array.length - 1; i > 0; i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			downheap(array, 0, i - 1);
		}
	}

	void downheap(int a[], int left, int right) {
		System.out.println("downheap left=" + left + ", right=" + right + ", a[left]=" + a[left]);
		int root = a[left]; // ルート
		int c; //大きい方の子ノード
		int p; //親ノード
		for (p = left; p < (right + 1) / 2; p = c) {
			System.out.println("p=" + p + ", (right + 1) / 2=" + ((right + 1) / 2));
			System.out.println("１:" + Arrays.toString(a));
			int cl = p * 2 + 1;
			int cr = cl + 1;
//			System.out.println("cl=" + cl + ", cr=" + cr + ", a[cr]=" + a[cr] + ", a[cl]=" + a[cl]);
			System.out.println("cl=" + cl + ", cr=" + cr);
			c = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			System.out.println("c=" + c + ", a[c]=" + a[c]);
			if (root >= a[c]) {
				System.out.println("root=" + root + ", a[c]" + a[c]);
				System.out.println("1.5:" + Arrays.toString(a));
				break;
			}
			a[p] = a[c];
			System.out.println("a[p]=" + a[p]);
			System.out.println("２:" + Arrays.toString(a));
		}
		a[p] = root;
		System.out.println("root=" + root);
		System.out.println("後:" + Arrays.toString(a));
		System.out.println();
	}
}
