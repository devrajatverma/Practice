package generics;
class Genn<T>{
	T ob;
	Genn(T o){
		ob=o;
	}
	T getOb() {
		return ob;
	}
}

public class RowTypes {

	public static void main(String[] args) {
		Gen<Integer> gi = new Gen<>(12);
		Gen<String> gs = new Gen<>("12");
		Gen row = new Gen(new Double(88.7));
		
		double d = (Double)row.get(); // cast needed
		
		gs = row;
		
		// String s = gs.get(); 
		row = gi;
		// d= (Double) row.get();
	}

}
