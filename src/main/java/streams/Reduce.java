package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {


	public static void main(String[] args) {

		/*List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);
		Optional<Integer> optional = myList.stream().reduce((a, b) -> a * b);
		if (optional.isPresent())
			System.out.println(optional.get());

		int out = myList.stream().reduce(1, (a, b) -> a * b);
		System.out.println(out);*/

		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				new Product(14, "orange"), new Product(13, "lemon"),
				new Product(23, "bread"), new Product(13, "sugar"));

		System.out.println(
				productList.stream()
						.collect(Collectors.summarizingInt(Product::getPrice))
		);

	}

}

class Product{
	int price;
	String name;

	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
