package sorting;

public class SelectionSort {
	static void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex])
					minIndex = j;
			}

			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		sort(a);
		for (int e : a)
			System.out.print(e + " ");

	}

}
