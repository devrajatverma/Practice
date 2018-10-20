package maths;

public class PrimeNumbeTools {

	static boolean isPrime(int n) {
		if(n==1) return false;
		
		int sqrt=(int) Math.sqrt(n);
		for(int i=2;i<=sqrt;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static void printPrimeFectors(int n) {
		int sqrt = (int) Math.sqrt(n)+1;
		for(int i=2;i<=sqrt;i++) {
			if(n%i==0) {
				int count = 0;
				while(n%i==0) {
					n=n/i;
					count++;
				}
				System.out.println(i+"^"+count);
			}
		}
		if(n!=1)
			System.out.println(n+"^1");
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(23));
		printPrimeFectors(8);
	}

}
