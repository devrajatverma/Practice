package sorting;

import java.util.Arrays;

public class MergeSort {

	static void merge(int[] left, int[] right, int[] a) {

		int l = 0, r = 0, k = 0;
		while (l < left.length && r < right.length) {
			if (left[l] <= right[r]) {
				a[k] = left[l];
				l++;
			} else {
				a[k] = right[r];
				r++;
			}
			k++;
		}
		while (l < left.length) {
			a[k] = left[l];
			l++;
			k++;
		}
		while (r < right.length) {
			a[k] = right[r];
			r++;
			k++;
		}
	}

	static void mergeSort(int a[]) {
		if (a.length < 2)
			return;

		int mid = a.length / 2;
		int[] left = Arrays.copyOfRange(a, 0, mid);
		int[] right = Arrays.copyOfRange(a, mid, a.length);
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);

	}
	public static void main(String[] args) {
		int a[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		mergeSort(a);
		System.out.println(Arrays.toString(a));

	}

}
