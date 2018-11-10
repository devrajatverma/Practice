package generics;

public class GenericMethod {

	static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y) {
		for(V e:y) {
			if(x.equals(e))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Integer[] in = {
				1,2,3,4,5
		};
		if(isIn(1, in))
			System.out.println("Int yes");
		
		String[] st = {
				"one", "two","three"
		};
		
		if(isIn("one", st))
		System.out.println("String yes");

	}

}
