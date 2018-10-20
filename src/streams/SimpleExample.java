package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleExample {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);
		Optional<Integer> min = myList.stream().min(Integer::compare);
		if (min.isPresent())
			System.out.println(min.get());

		System.out.println("----------------------------------------");
		Stream<Integer> stream = myList.stream();
		Optional<Integer> max = stream.max(Integer::compare);

		if (max.isPresent())
			System.out.println(max.get());
		System.out.println("----------------------------------------");

		stream = myList.stream().sorted();

		stream.forEach(e -> {
			System.out.println(e + " ");
		});
		System.out.println("----------------------------------------");

		stream = myList.stream().sorted().filter((e) -> e % 2 == 1);
		stream.forEach(e -> {
			System.out.println(e + " ");
		});
		System.out.println("----------------------------------------");

		stream = myList.stream().sorted().filter((e) -> e % 2 == 1).filter((e) -> e > 5);
		stream.forEach(e -> {
			System.out.println(e + " ");
		});
	}
}