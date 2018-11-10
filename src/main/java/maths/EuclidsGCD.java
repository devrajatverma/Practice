package maths;

public class EuclidsGCD {
	static int getGCD(int a, int b) {
		int dividend = a >= b ? a : b;
		int divisor = a <= b ? a : b;
		while (divisor != 0) {
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor  = remainder;
		}
		return dividend;
	}
	public static void main(String[] args) {
		System.out.println(getGCD(5, 5));
	}

}
