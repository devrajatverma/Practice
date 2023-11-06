package sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);
        //ASC
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
        //DESC
        System.out.println();
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::print);
    }
}
