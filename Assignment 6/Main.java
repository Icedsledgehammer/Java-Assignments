//Name- Rishith Singh Rawat
//PRN- 22070126088
//Class- AIML B1

package duck;

public class Main {
	public static void main(String[] args) {
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		redHeadDuck.performSwim();
		
		RubberDuck rb = new RubberDuck();
		rb.display();
		rb.performFly();
		rb.performQuack();
		rb.performDrown();
	}
}