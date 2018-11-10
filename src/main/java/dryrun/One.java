package dryrun;

interface temp{
	    void foo();
	}

public abstract class One {

	int x;
	public static void main(String[] args) {
		temp t = () ->{
				System.out.println("hi");
				
		};
		t.foo();
	}

}
