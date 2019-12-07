package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Lazy {
    private static long counter;
    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        Optional<String> stream = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

        int b = foo();
        b = 10;
    }

    private static int foo(){
        final int a = 5;
        return a;
    }

}
