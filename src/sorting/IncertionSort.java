package sorting;

public class IncertionSort {

	static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int value = a[i];
			int hole = i;
			while (hole > 0 && a[hole - 1] > value) {
				a[hole] = a[hole - 1];
				hole--;
			}
			a[hole] = value;
		}
	}
	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		sort(a);
		for (int e : a)
			System.out.print(e + " ");
	}

}
