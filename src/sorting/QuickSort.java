package sorting;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(a, start, end);
            sort(a, start, pivotIndex-1);
            sort(a, pivotIndex+1, end);
        }
    }

    static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (a[i] < a[partitionIndex]) {
                int temp = a[i];
                a[i] = a[partitionIndex];
                a[partitionIndex] = temp;
            }
        }
        int temp = a[partitionIndex];
        a[partitionIndex] = a[end];
        a[end] = temp;
        return partitionIndex;
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        sort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
