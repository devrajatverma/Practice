package generics;

class Stats<T extends Number> {
	T[] arr;
	Stats(T[] ar){
		arr=ar;
	}
	double avg() {
		double sum=0.0;
		for(T t:arr) {
			sum+= t.doubleValue();
		}
		return sum/arr.length;
	}
	boolean sameAvg(Stats<?> other) {
		return avg() == other.avg();
	}
}
public class Two {

	public static void main(String[] args) {
		Integer[] ia = {1,2,3,4,5};
		Double[] da = {1.0,2.0,3.0,4.0,5.0};
		Stats<Integer> st = new Stats<>(ia);
		Stats<Double> sd = new Stats<>(da);
		System.out.println(st.avg());
		System.out.println(sd.avg());
		System.out.println(sd.sameAvg(st));
	}

}
