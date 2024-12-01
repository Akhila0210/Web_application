package CarProject;

public class Car {
	private IEngine iEn;
	public Car() {
		System.out.println("This is not a Car constructor");
	}
	public Car(IEngine iEn) {
		System.out.println("This is constructor injection");
		this.iEn=iEn;
	}
	public void setiEn(IEngine iEn) {
		this.iEn=iEn;
		System.out.println("Dependency object injected into target bean");
	}
	public void show() {
		iEn.etype();
	}

}
