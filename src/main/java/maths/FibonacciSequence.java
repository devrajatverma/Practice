package maths;

public class FibonacciSequence {
	static void print(int n) {
		// assume the 0 before the secuence
		// 0 1 1 2
		// a b c

		if (n < 1)
			return;
		else {
			int a = 0, b = 1, c;
			while (n > 0) {
				System.out.print(b + " ");
				c = a + b;
				a = b;
				b = c;
				n--;
			}

		}
	}

	public static void main(String[] args) {

		print(10);
	}

}
