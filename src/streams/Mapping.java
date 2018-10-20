package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mapping {

	public static void main(String[] args) {
		List<Double> myList = Arrays.asList(7.0, 18.0, 10.0, 24.0, 17.0, 5.0);
		Stream<Double> sqrt = myList.stream().map((e) -> Math.sqrt(e));
		double product = sqrt.reduce(1.0, (a, b) -> a * b);
		System.out.println(product);
	}

}
