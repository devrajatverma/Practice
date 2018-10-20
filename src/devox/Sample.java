package devox;

class Engine {
	public Engine() {
	}

	protected Engine(Engine other) {
	}

	public Engine copy() {
		return new Engine(this);
	}

	@Override
	public String toString() {
		return getClass().getName() + ":" + hashCode();
	}
}

class TurboEngine extends Engine {
	public TurboEngine() {
		super();
	}

	protected TurboEngine(TurboEngine te) {
		super(te);
	}
	
	@Override
	public Engine copy() {
		return new TurboEngine(this);
	}
	
	
}

class PistonEngine extends Engine{
	public PistonEngine() {
	}
	protected PistonEngine(PistonEngine pe) {
		super(pe);
	}
	@Override
	public Engine copy() {
		return new PistonEngine(this);
	}
}

class Car {
	private int year;
	private Engine engine;

	public Car(int year, Engine eng) {
		this.year = year;
		engine = eng;
	}

	public Car(Car car) {
		year = car.year;
//		if (car.engine instanceof TurboEngine)
//			engine = new TurboEngine((TurboEngine) car.engine);
//		else
//			engine = new Engine(car.engine);
		
		engine = car.engine.copy();
	}

	@Override
	public String toString() {
		return year + "-" + engine;
	}
}

public class Sample {

	
	public static void main(String[] args) {

		Car car1 = new Car(1992, new PistonEngine());
		System.out.println(car1);

		Car car2 = new Car(car1);
		System.out.println(car2);
	}

}
