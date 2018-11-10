package generics;

public class GenericConstructor {
	private double val;
	public <T extends Number> GenericConstructor(T v) {
		val = v.doubleValue();
	}
	
	void showVal() {
		System.out.println(val);
	}
	public static void main(String[] args) {
		GenericConstructor gc = new GenericConstructor(2);
		gc.showVal();
		gc = new GenericConstructor(5.6);
		gc.showVal();

	}

}
