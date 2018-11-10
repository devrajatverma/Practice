package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);
		Optional<Integer> optional = myList.stream().reduce((a, b) -> a * b);
		if (optional.isPresent())
			System.out.println(optional.get());

		int out = myList.stream().reduce(1, (a, b) -> a * b);
		System.out.println(out);
	}

}
