package duck;

abstract public class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	SwimBehaviour swimBehaviour;
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
	
	public void setSwimBehaviour(SwimBehaviour sb) {
		swimBehaviour = sb;
	}
	
	//Below here is a getter setter method automatically generated
	
//	public FlyBehaviour getFlyBehaviour() {
//		return flyBehaviour;
//	}
//
//	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
//		this.flyBehaviour = flyBehaviour;
//	}
//
//	public QuackBehaviour getQuackBehaviour() {
//		return quackBehaviour;
//	}
//
//	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
//		this.quackBehaviour = quackBehaviour;
//	}

	abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performSwim() {
		swimBehaviour.swim();
	}
	
	public void performDrown() {
		swimBehaviour.swim();
	}
}	
