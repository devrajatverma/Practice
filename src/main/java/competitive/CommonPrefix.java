package competitive;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));

    }
    public static String longestCommonPrefix(String[] a) {
        int size = a.length;
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return a[0];
        }
        Arrays.sort(a);
        int length = Math.min(a[0].length(), a[size - 1].length());
        int i = 0;
        while (i < length && a[0].charAt(i) == a[size - 1].charAt(i)) {
            i++;
        }
        return a[0].substring(0, i);
    }

}


