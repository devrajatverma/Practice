package sorting;

public class BubbleSort {

	static void sort(int[] a) {
		for (int i = a.length - 2; i >= 0; i--) {
			boolean flag = true;
			for (int j = 0; j <= i; j++) {
				if (a[j] > a[j + 1]) {
					flag = false;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (flag)
				break;
		}
	}

	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		sort(a);
		for (int e : a)
			System.out.print(e + " ");

	}

}
