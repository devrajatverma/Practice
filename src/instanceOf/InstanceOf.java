package instanceOf;


class A{
	
}
class B extends A{
	
}
class C extends B{}

class X<T>{}
class Y<T> extends X<T>{}
class Z<T> extends Y<T>{}

public class InstanceOf {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c instanceof A);
		
		Z<Integer> z =new Z<>();
		System.out.println(z instanceof X<?>);
	}

}
