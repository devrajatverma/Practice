package generics;

class Gen<T> {
	T obj;
	Gen(T thisObj) {
		obj = thisObj;
	}
	T get() {
		return obj;
	}
	void printType() {
		System.out.println(obj.getClass().getSimpleName() + " " + obj);
	}
}
public class One {

	public static void main(String[] args) {
		Gen<Integer> iob = new Gen<>(92);
		iob.printType();
		int i = iob.get(); //no cast needed
		Gen<String> sob = new Gen<>("sample");
		sob.printType();

	}

}
