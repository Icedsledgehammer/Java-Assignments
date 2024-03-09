package duck;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new CanSwim();
	}
	
	void display() {
		System.out.println("This is Red Head Duck.....");
	}
}
