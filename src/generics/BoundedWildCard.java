package generics;

//Two-dimensional coordinates. 
class TwoD {
	int x, y;

	TwoD(int a, int b) {
		x = a;
		y = b;
	}
}

// Three-dimensional coordinates.
class ThreeD extends TwoD {
	int z;

	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}

// Four-dimensional coordinates.
class FourD extends ThreeD {
	int t;

	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}
}

class Coords<T extends TwoD>{
	T[] coords;
	Coords(T[] o){
		coords=o;
	}
}

public class BoundedWildCard {

	static void showxy(Coords<?> c) {
		System.out.println("X Y");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x + " "+c.coords[i].y);
		}
	}
	
	static void showxyz(Coords<? extends ThreeD> c) {
		System.out.println("X Y Z");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x + " "+c.coords[i].y+" "+c.coords[i].z);
		}
	}
	
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X Y Z T");
		for(int i=0;i<c.coords.length;i++) {
			System.out.println(c.coords[i].x + " "+c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
		}
	}
	
	public static void main(String[] args) {
		TwoD[] tw = {
				new TwoD(0,0),
				new TwoD(1,1),
				new TwoD(-1,-1),
				new TwoD(2,3)
		};
		Coords<TwoD> c2d = new Coords<>(tw);
		showxy(c2d);
		// showxyz(c2d);
		
		ThreeD[] td = {
			new ThreeD(0,0,0),
			new ThreeD(1,1,1),
			new ThreeD(-1,-1,-1),
			new ThreeD(2,0,3),
		};

		Coords<ThreeD> c3d = new Coords<>(td);
		showxyz(c3d);
		
		FourD fd[] = { 
			      new FourD(1, 2, 3, 4), 
			      new FourD(6, 8, 14, 8), 
			      new FourD(22, 9, 4, 9), 
			      new FourD(3, -2, -23, 17) 
			    }; 
		Coords<FourD> c4d = new Coords<>(fd);
		showxy(c4d);
		showxyz(c4d);
		showAll(c4d);
	}

}
